package com.mlmc.eed.examen.OptimizacionYDocumentacion;

/**
 * Representa a un perro
 * 
 * @author Magarín
 *
 */
public class Perro extends Mascota {
	/**
	 * Sonido que emite un perro al ladrar
	 */
	private static final String GUAUUUUUUUUUU = "GUAUUUUUUUUUU";
	/**
	 * Edad del Perro
	 */
	private int age;
	/**
	 * Construye un perro con los datos indicados
	 * 
	 * @param name Nombre del nuevo perro
	 * @param age Edad del nuevo perro
	 * 
	 * @throws EdadErroneaException Cuando la edad no es válida
	 */
	public Perro(String name, int age) throws EdadErroneaException {
		super();
		setAge(age);
		this.name = name;
	}

	/**
	 * Establece la nueva edad
	 * 
	 * @param age Nueva edad 
	 * 
	 * @throws EdadErroneaException Cuando la edad es negativa
	 */
	public void setAge(int age) throws EdadErroneaException {
		if (age < 0)
			throw new EdadErroneaException("La edad no puede ser negativa");
		this.age = age;
	}

	/**
	 * Devuelve la edad del perro
	 * 
	 * @return edad del perro
	 */
	public int getAge() {
		return this.age;
	}

	/**
	 * Acción de ladrar del perro
	 * 
	 * @return Sonido que emite un perro al ladrar
	 */
	public String ladrar() {
		return GUAUUUUUUUUUU;
	}

}
