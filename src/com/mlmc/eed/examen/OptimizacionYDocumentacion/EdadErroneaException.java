package com.mlmc.eed.examen.OptimizacionYDocumentacion;

/**
 * Lanzada para indicar que la edad no es correcta
 * 
 * @author Magarín
 *
 */
public class EdadErroneaException extends Exception {

	/**
	 * Construye una EdadErroneaException con el mensaje indicado
	 * 
	 * @param message Mensaje descriptivo de por qué la edad es errónea
	 */
	public EdadErroneaException(String message) {
		super(message);
	}
}
