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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getChip() {
		return chip;
	}

	public void setChip(String chip) {
		this.chip = chip;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	public abstract void hacerRuido();
	
}
