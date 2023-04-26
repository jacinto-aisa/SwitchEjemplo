public class Vehiculo implements IVendible {
    private String descripcion;
    private float precio;


    public Vehiculo(String descripcion, float precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public float getPrecio() {
        return precio;
    }
}
