package com.br.digitalinnovationone.SpringHateoas.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.digitalinnovationone.SpringHateoas.controller.response.SoldadoListResponse;
import com.br.digitalinnovationone.SpringHateoas.controller.response.SoldadoResponse;
import com.br.digitalinnovationone.SpringHateoas.dto.Soldado;
import com.br.digitalinnovationone.SpringHateoas.service.SoldadoService;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/v1/soldado")
public class SoldadoController {

	private SoldadoService soldadoService;
	@SuppressWarnings("unused")
	private ObjectMapper objectMapper;

	public SoldadoController(SoldadoService soldadoService, ObjectMapper objectMapper) {
		this.soldadoService = soldadoService;
		this.objectMapper = objectMapper;
	}

	@GetMapping("/{id}")
	public ResponseEntity<SoldadoResponse> buscarSoldado(@Valid @PathVariable() Long id) {
		SoldadoResponse soldadoResponse = soldadoService.buscarSoldado(id);
		return ResponseEntity.status(HttpStatus.OK).body(soldadoResponse);
	}

	@PostMapping
	public ResponseEntity<Soldado> criarSoldado(@Valid @RequestBody Soldado soldado) {
		soldadoService.criarSoldado(soldado);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Soldado> deletarSoldado(@Valid @PathVariable Long id) {
		soldadoService.deletarSoldado(id);
		return ResponseEntity.ok().build();
	}

	@GetMapping
	public ResponseEntity<List<SoldadoListResponse>> buscarSoldados() {
		List<SoldadoListResponse> soldadoListResponses = soldadoService.buscarSoldados();
		return ResponseEntity.status(HttpStatus.OK).body(soldadoListResponses);

	}

}
