package modelo;

public abstract class Animal {
	private String nombre;
	private int edad;
	private String chip;
	private String raza;
	
	public Animal(String nombre, int edad, String chip, String raza) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.chip = chip;
		this.raza = raza;
	}
	
	
}
