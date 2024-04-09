package modelo;

public class Gato extends Animal {

	public Gato(String nombre, int edad, String chip, String raza) {
		super(nombre, edad, chip, raza);
	}

	@Override
	public void hacerRuido() {
		System.out.println("miau");
	}
	
	
}
