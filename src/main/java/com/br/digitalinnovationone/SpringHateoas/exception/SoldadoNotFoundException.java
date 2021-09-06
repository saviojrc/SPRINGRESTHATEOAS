package com.br.digitalinnovationone.SpringHateoas.exception;

public class SoldadoNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SoldadoNotFoundException(long meetingId) {
		super("Soldado " + meetingId + " não existe.");
	}

}
