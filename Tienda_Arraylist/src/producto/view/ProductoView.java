package producto.view;
import java.util.Scanner;

import categoría.control.Categorías;
import categoría.entity.NoExisteCategoría;
import producto.control.Productos;
import producto.entity.Producto;
import view.InputTypes;

public class ProductoView {
	
	private Productos productos;
	private Categorías categorías;
	private Scanner scanner;
	public ProductoView(Productos productos, Categorías categorías, Scanner scanner) {
		this.scanner=scanner;	
		this.categorías=categorías;
		this.productos=productos;
	}
	
	public void add() throws NoExisteCategoría{
		Producto producto;
		producto=RegistroProducto.ingresar(scanner, categorías);
		productos.ingresar(producto);
	}
	public void listar() {
		int codCategoría=0;
		int índiceCategoría=0;
		for(int i=0; i< productos.getCantidad(); i++) {
			System.out.println(productos.getProductos()[i]);
			codCategoría=productos.getProductos()[i].getCodCategoría();
			try {
				índiceCategoría=categorías.buscar(codCategoría);
			} catch (NoExisteCategoría e) {
				e.printStackTrace();
			}
			System.out.println(categorías.getCategorías().get(índiceCategoría));
		}
	}
	public void delete(){
		int codProducto=InputTypes.readInt("Ingrese la categoría del producto: ", scanner);
		  productos.eliminar(codProducto);
		
	}
}
