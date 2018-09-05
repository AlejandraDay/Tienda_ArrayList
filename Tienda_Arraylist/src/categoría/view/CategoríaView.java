package categor�a.view;

import java.util.Iterator;
import java.util.Scanner;

import categor�a.control.Categor�as;
import categor�a.entity.Categor�a;
import categor�a.entity.NoExisteCategor�a;
import producto.control.Productos;
import view.InputTypes;

public class Categor�aView {

	
	private Categor�as categor�as;
	private Productos productos;
	private Scanner scanner;
	public Categor�aView(Categor�as categor�as, Productos productos, Scanner scanner) {
		this.scanner = scanner;
		this.categor�as=categor�as;
		this.productos=productos;
	}
	public void add() {
		Categor�a categor�a;
		categor�a=RegistroCategor�a.ingresar(scanner);
		categor�as.ingresar(categor�a);
	}
	public void listar() {
	    for(Iterator<Categor�a> i=categor�as.getCategor�as().iterator();i.hasNext();) {
			System.out.println(i.next());
		}
	}
	public void lisarProductos() throws NoExisteCategor�a {
		int codCategor�a=InputTypes.readInt("C�digo de categor�a: ", scanner);
		System.out.println(categor�as.getCategor�as().get(categor�as.buscar(codCategor�a)));
		for(int i=0; i<productos.getCantidad(); i++) {
			if(codCategor�a==productos.getProductos()[i].getCodCategor�a());
			System.out.println(productos.getProductos()[i]);
		}
	}
	public void delete() throws NoExisteCategor�a {
		  int codCategor�a=InputTypes.readInt("Ingrese la categor�a del producto", scanner);
		  categor�as.eliminar(codCategor�a);
		}


}
