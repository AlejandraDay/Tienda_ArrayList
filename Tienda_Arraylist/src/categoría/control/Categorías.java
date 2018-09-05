package categoría.control;

import java.util.ArrayList;
import java.util.Iterator;

import categoría.entity.Categoría;
import categoría.entity.NoExisteCategoría;


public class Categorías {
	private ArrayList<Categoría> categorías;

	public Categorías() {
		categorías=new ArrayList<Categoría>();
	}

	public void ingresar(Categoría categoría) throws java.lang.ArrayIndexOutOfBoundsException {
		categorías.add(categoría);
	}

	public void eliminar(int codCategoría) throws NoExisteCategoría {
		int índice=buscar(codCategoría);
		categorías.remove(índice);
	}

	public int buscar(int codCategoría) throws NoExisteCategoría {
		Categoría categoría=null;
		int índice=-1;
		for(Iterator<Categoría> iterator = categorías.iterator(); iterator.hasNext();) {
			categoría=iterator.next();
			if(codCategoría== categoría.getCodCategoría()) {
				índice=categorías.indexOf(categoría);
			}
			if(índice==-1) {
				throw new NoExisteCategoría(); 
			}
		}
		return índice;
	}

	public ArrayList<Categoría> getCategorías() {
		return categorías;
	}
}
