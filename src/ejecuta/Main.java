package ejecuta;

import java.util.Set;
import java.util.TreeSet;

import modelo.Animal;

public class Main {
	static Set<Animal> mascotas = new TreeSet<>();

	public static void main(String[] args) {
		
	}

	private static void mostrarAnimal(Animal animal) {
			if(existe(animal)) {
				System.out.println("Nombre:"+animal.getNombre());
				System.out.println("Raza:"+animal.getRaza());
				System.out.println("Edad:"+animal.getEdad());
				System.out.println("Chip:"+animal.getChip());
				return;
			}
		System.out.println("No tenemos ese animal :(");
	}
}
