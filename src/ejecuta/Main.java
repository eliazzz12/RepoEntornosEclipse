package ejecuta;

import java.util.Set;
import java.util.TreeSet;

import modelo.Animal;
import modelo.Gato;
import modelo.Perro;

public class Main {
	static Set<Animal> mascotas = new TreeSet<>();

	public static void main(String[] args) {
		mascotas.add(new Perro("Pluto", 7, "153AW", "Labrador"));
		mascotas.add(new Gato("Silvestre", 4, "627FB", "Negro"));
		
		todosRuido();
	}

	private static void mostrarAnimal(Animal animal) {
		System.out.println();
		System.out.println("Nombre:"+animal.getNombre());
		System.out.println("Raza:"+animal.getRaza());
		System.out.println("Edad:"+animal.getEdad());
		System.out.println("Chip:"+animal.getChip());
	}
	
	private static void todosRuido() {
		for(Animal a : mascotas) {
			if(a instanceof Perro) {
				Perro p = (Perro) a;
				p.hacerRuido();
			}
			else if(a instanceof Gato) {
				Gato g = (Gato) a;
				g.hacerRuido();
			}
		}
	}
}
