package categor�a.control;
//Linea aux
import java.util.ArrayList;
import java.util.Iterator;

import categor�a.entity.Categor�a;
import categor�a.entity.NoExisteCategor�a;


public class Categor�as {
	private ArrayList<Categor�a> categor�as;

	public Categor�as() {
		categor�as=new ArrayList<Categor�a>();
	}

	public void ingresar(Categor�a categor�a) throws java.lang.ArrayIndexOutOfBoundsException {
		categor�as.add(categor�a);
	}

	public void eliminar(int codCategor�a) throws NoExisteCategor�a {
		int �ndice=buscar(codCategor�a);
		categor�as.remove(�ndice);
	}

	public int buscar(int codCategor�a) throws NoExisteCategor�a {
		Categor�a categor�a=null;
		int �ndice=-1;
		for(Iterator<Categor�a> iterator = categor�as.iterator(); iterator.hasNext();) {
			categor�a=iterator.next();
			if(codCategor�a== categor�a.getCodCategor�a()) {
				�ndice=categor�as.indexOf(categor�a);
			}
			if(�ndice==-1) {
				throw new NoExisteCategor�a(); 
			}
		}
		return �ndice;
	}

	public ArrayList<Categor�a> getCategor�as() {
		return categor�as;
	}
}
