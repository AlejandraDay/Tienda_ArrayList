package categoría.entity;

public class Categoría {
	private int codCategoría;
	private String nombre;
	private String descripcion;
	
	public Categoría(int codCategoría, String nombre, String descripcion) {
		super();
		this.codCategoría = codCategoría;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	
	public int getCodCategoría() {
		return codCategoría;
	}
	public void setCodCategoría(int codCategoría) {
		this.codCategoría = codCategoría;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "Categoría [codCategoría=" + codCategoría + ", nombre=" + nombre + ", descripcion="+descripcion + "]";
	}
	
	

}
