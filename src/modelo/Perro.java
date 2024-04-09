package modelo;

public class Perro extends Animal{

	public Perro(String nombre, int edad, String chip, String raza) {
		super(nombre, edad, chip, raza);
	}
	
	@Override
	public void hacerRuido() {
		System.out.println("guau!");
	}
	
	public void hacerRuido(String ruido) {
		System.out.println(ruido);
	}
	
	@Override
	public int compareTo(Animal a) {
		return this.getNombre().compareTo(a.getNombre());
	}
}
