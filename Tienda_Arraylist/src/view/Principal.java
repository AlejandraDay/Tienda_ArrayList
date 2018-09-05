package view;

import java.util.Scanner;

import categoría.control.Categorías;
import categoría.view.CategoríaView;
import producto.control.Productos;
import producto.view.ProductoView;


public class Principal {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner (System.in);
		Categorías categorías= new Categorías();
		Productos productos= new Productos(10);
		
		ProductoView productosview= new ProductoView(productos, categorías, scanner);
		CategoríaView categoríasview= new CategoríaView(categorías, productos, scanner);
		
		
		MenuPrincipal.menú(scanner, productosview,  categoríasview);
		scanner.close();

	}

}
