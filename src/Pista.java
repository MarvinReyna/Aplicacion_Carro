public class Pista {
	private String id;
	private String nombre;
	private float longitud;

	public Pista(String id, String nombre, float longitud) {
		this.id = id;
		this.nombre = nombre;
		this.longitud = longitud;
		
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getLongitud() {
		return longitud;
	}

	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}

	@Override
	public String toString() {
		return "La Pista Es: [ID:" + id + ", NOMBRE:" + nombre + ", Longitud:" + longitud + "]";
	}
	
}

