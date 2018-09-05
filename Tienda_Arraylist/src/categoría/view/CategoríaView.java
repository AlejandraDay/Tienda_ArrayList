package categoría.view;

import java.util.Iterator;
import java.util.Scanner;

import categoría.control.Categorías;
import categoría.entity.Categoría;
import categoría.entity.NoExisteCategoría;
import producto.control.Productos;
import view.InputTypes;

public class CategoríaView {

	
	private Categorías categorías;
	private Productos productos;
	private Scanner scanner;
	public CategoríaView(Categorías categorías, Productos productos, Scanner scanner) {
		this.scanner = scanner;
		this.categorías=categorías;
		this.productos=productos;
	}
	public void add() {
		Categoría categoría;
		categoría=RegistroCategoría.ingresar(scanner);
		categorías.ingresar(categoría);
	}
	public void listar() {
	    for(Iterator<Categoría> i=categorías.getCategorías().iterator();i.hasNext();) {
			System.out.println(i.next());
		}
	}
	public void lisarProductos() throws NoExisteCategoría {
		int codCategoría=InputTypes.readInt("Código de categoría: ", scanner);
		System.out.println(categorías.getCategorías().get(categorías.buscar(codCategoría)));
		for(int i=0; i<productos.getCantidad(); i++) {
			if(codCategoría==productos.getProductos()[i].getCodCategoría());
			System.out.println(productos.getProductos()[i]);
		}
	}
	public void delete() throws NoExisteCategoría {
		  int codCategoría=InputTypes.readInt("Ingrese la categoría del producto", scanner);
		  categorías.eliminar(codCategoría);
		}


}
