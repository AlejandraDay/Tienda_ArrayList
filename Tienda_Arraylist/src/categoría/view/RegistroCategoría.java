package categoría.view;

import java.util.Scanner;

import categoría.entity.Categoría;
import view.InputTypes;

public class RegistroCategoría {
	public static Categoría ingresar(Scanner scanner) {
		int codCategoría= InputTypes.readInt("Ingrese el código de la categoría: ", scanner);
		String nombreCategoría=InputTypes.readString("Nombre: ", scanner);
		String descripción=InputTypes.readString("Descripción: ", scanner);
		
		return new Categoría(codCategoría, nombreCategoría, descripción);
	}
}
