package categor�a.view;

import java.util.Scanner;

import categor�a.entity.Categor�a;
import view.InputTypes;

public class RegistroCategor�a {
	public static Categor�a ingresar(Scanner scanner) {
		int codCategor�a= InputTypes.readInt("Ingrese el c�digo de la categor�a: ", scanner);
		String nombreCategor�a=InputTypes.readString("Nombre: ", scanner);
		String descripci�n=InputTypes.readString("Descripci�n: ", scanner);
		
		return new Categor�a(codCategor�a, nombreCategor�a, descripci�n);
	}
}
