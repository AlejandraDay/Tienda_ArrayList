package producto.view;
import java.util.Scanner;

import categor�a.control.Categor�as;
import categor�a.entity.NoExisteCategor�a;
import producto.control.Productos;
import producto.entity.Producto;
import view.InputTypes;

public class ProductoView {
	
	private Productos productos;
	private Categor�as categor�as;
	private Scanner scanner;
	public ProductoView(Productos productos, Categor�as categor�as, Scanner scanner) {
		this.scanner=scanner;	
		this.categor�as=categor�as;
		this.productos=productos;
	}
	
	public void add() throws NoExisteCategor�a{
		Producto producto;
		producto=RegistroProducto.ingresar(scanner, categor�as);
		productos.ingresar(producto);
	}
	public void listar() {
		int codCategor�a=0;
		int �ndiceCategor�a=0;
		for(int i=0; i< productos.getCantidad(); i++) {
			System.out.println(productos.getProductos()[i]);
			codCategor�a=productos.getProductos()[i].getCodCategor�a();
			try {
				�ndiceCategor�a=categor�as.buscar(codCategor�a);
			} catch (NoExisteCategor�a e) {
				e.printStackTrace();
			}
			System.out.println(categor�as.getCategor�as().get(�ndiceCategor�a));
		}
	}
	public void delete(){
		int codProducto=InputTypes.readInt("Ingrese la categor�a del producto: ", scanner);
		  productos.eliminar(codProducto);
		
	}
}
