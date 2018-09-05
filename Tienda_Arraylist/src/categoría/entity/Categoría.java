package categor�a.entity;

public class Categor�a {
	private int codCategor�a;
	private String nombre;
	private String descripcion;
	
	public Categor�a(int codCategor�a, String nombre, String descripcion) {
		super();
		this.codCategor�a = codCategor�a;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	
	public int getCodCategor�a() {
		return codCategor�a;
	}
	public void setCodCategor�a(int codCategor�a) {
		this.codCategor�a = codCategor�a;
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
		return "Categor�a [codCategor�a=" + codCategor�a + ", nombre=" + nombre + ", descripcion="+descripcion + "]";
	}
	
	

}
