package com.br.digitalinnovationone.SpringHateoas.resource;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import org.springframework.hateoas.Link;
import org.springframework.stereotype.Component;

import com.br.digitalinnovationone.SpringHateoas.controller.SoldadoController;
import com.br.digitalinnovationone.SpringHateoas.controller.response.SoldadoListResponse;
import com.br.digitalinnovationone.SpringHateoas.entity.SoldadoEntity;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class ResourceSoldado {

	private ObjectMapper objectMapper;

	public ResourceSoldado(ObjectMapper objectMapper) {
		this.objectMapper = objectMapper;
	}

	public SoldadoListResponse criarLink(SoldadoEntity soldadoEntity) {
		SoldadoListResponse soldadoListResponse = objectMapper.convertValue(soldadoEntity, SoldadoListResponse.class);
		Link link = linkTo(methodOn(SoldadoController.class).buscarSoldado(soldadoEntity.getId())).withSelfRel();
		soldadoListResponse.add(link);

		return soldadoListResponse;

	}

}
