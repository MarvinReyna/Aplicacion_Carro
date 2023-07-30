
public class Vehiculo {
    private String id;
    private String marca;
    private float tTotal; // 

    public Vehiculo(String id, String marca) {
        this.id = id;
        this.marca = marca;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void settTotal(float tTotal) {
		this.tTotal = tTotal;
	}

	public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float gettTotal() {
        return tTotal;
    }
    // Agregar un método para sumar el tiempo de vuelta al tiempo total
    public void agregarTiempoVuelta(float tiempoVuelta) {
        tTotal += tiempoVuelta;
    }
}
