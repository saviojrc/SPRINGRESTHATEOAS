package com.br.digitalinnovationone.SpringHateoas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.br.digitalinnovationone.SpringHateoas.controller.request.SoldadoEditRequest;
import com.br.digitalinnovationone.SpringHateoas.controller.response.SoldadoListResponse;
import com.br.digitalinnovationone.SpringHateoas.controller.response.SoldadoResponse;
import com.br.digitalinnovationone.SpringHateoas.dto.Soldado;
import com.br.digitalinnovationone.SpringHateoas.entity.SoldadoEntity;
import com.br.digitalinnovationone.SpringHateoas.exception.SoldadoNotFoundException;
import com.br.digitalinnovationone.SpringHateoas.repository.SoldadoRepository;
import com.br.digitalinnovationone.SpringHateoas.resource.ResourceSoldado;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class SoldadoService {

	private SoldadoRepository soldadoRepository;
	private ObjectMapper objectMapper;
	private ResourceSoldado resourceSoldado;

	public SoldadoService(SoldadoRepository soldadoRepository, ObjectMapper objectMapper,
			ResourceSoldado resourceSoldado) {
		this.soldadoRepository = soldadoRepository;
		this.objectMapper = objectMapper;
		this.resourceSoldado = resourceSoldado;
	}

	public SoldadoResponse buscarSoldado(Long id) {
		SoldadoEntity soldado = soldadoRepository.findById(id).orElseThrow(() -> new SoldadoNotFoundException(id));
		SoldadoResponse soldadoResponse = objectMapper.convertValue(soldado, SoldadoResponse.class);
		return soldadoResponse;
	}

	public void criarSoldado(Soldado soldado) {
		SoldadoEntity soldadoEntity = objectMapper.convertValue(soldado, SoldadoEntity.class);
		soldadoRepository.save(soldadoEntity);
	}

	public void alterarSoldado(Long id, SoldadoEditRequest soldadoEditRequest) {
		SoldadoEntity soldadoEntity = objectMapper.convertValue(soldadoEditRequest, SoldadoEntity.class);
		soldadoEntity.setId(id);
		soldadoRepository.save(soldadoEntity);
	}

	public void deletarSoldado(Long id) {
		SoldadoEntity soldado = soldadoRepository.findById(id).orElseThrow(() -> new SoldadoNotFoundException(id));
		soldadoRepository.delete(soldado);
	}

	public List<SoldadoListResponse> buscarSoldados() {
		List<SoldadoEntity> all = soldadoRepository.findAll();
		List<SoldadoListResponse> soldadoStream = all.stream().map(it -> resourceSoldado.criarLink(it))
				.collect(Collectors.toList());
		return soldadoStream;
	}

}
