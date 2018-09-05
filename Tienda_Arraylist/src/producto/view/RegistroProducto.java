package producto.view;

import java.util.Scanner;

import categor�a.control.Categor�as;
import categor�a.entity.NoExisteCategor�a;
import producto.entity.Producto;
import view.InputTypes;

public class RegistroProducto{
	
	public static Producto ingresar(Scanner scanner, Categor�as categor�as) throws NoExisteCategor�a{
		
		int codProducto= InputTypes.readInt("Ingrese el c�digo del producto: ", scanner);
		String nombreProducto=InputTypes.readString("Nombre: ", scanner);
		double precio=InputTypes.readDouble("Precio: ", scanner);
		String descripci�n=InputTypes.readString("Descripci�n: ", scanner);
		int codCategor�a=InputTypes.readInt("C�digo categor�a: ", scanner);
		
		/*valor=InputTypes.readInt("C�digo categor�a: ", scanner);
		
		if(!categor�as.compararCategor�a(valor)) {
			throw new NoExisteCategor�a();
		}
		int codCategor�a=valor;*/
		categor�as.buscar(codCategor�a);
		
		return new Producto(codProducto, nombreProducto, precio, descripci�n, codCategor�a);
	}
}
