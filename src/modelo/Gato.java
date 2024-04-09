package modelo;

public class Gato extends Animal {
	
	private int vidas;
	
	public Gato(String nombre, int edad, String chip, String raza) {
		super(nombre, edad, chip, raza);
	}

	@Override
	public void hacerRuido() {
		System.out.println("MIAAAAAAAU");
	}
	
	public int getVidas() {
		return vidas;
	}
	
	public void setVidas(int vidas) {
		this.vidas = vidas;
	}
	
	@Override
	public int compareTo(Animal a) {
		return this.getNombre().compareTo(a.getNombre());
	}
}
