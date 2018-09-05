package producto.view;

import java.util.Scanner;

import categoría.control.Categorías;
import categoría.entity.NoExisteCategoría;
import producto.entity.Producto;
import view.InputTypes;

public class RegistroProducto{
	
	public static Producto ingresar(Scanner scanner, Categorías categorías) throws NoExisteCategoría{
		
		int codProducto= InputTypes.readInt("Ingrese el código del producto: ", scanner);
		String nombreProducto=InputTypes.readString("Nombre: ", scanner);
		double precio=InputTypes.readDouble("Precio: ", scanner);
		String descripción=InputTypes.readString("Descripción: ", scanner);
		int codCategoría=InputTypes.readInt("Código categoría: ", scanner);
		
		/*valor=InputTypes.readInt("Código categoría: ", scanner);
		
		if(!categorías.compararCategoría(valor)) {
			throw new NoExisteCategoría();
		}
		int codCategoría=valor;*/
		categorías.buscar(codCategoría);
		
		return new Producto(codProducto, nombreProducto, precio, descripción, codCategoría);
	}
}
