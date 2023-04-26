public class VehiculoDeportivo extends Vehiculo{
    public VehiculoDeportivo(String descripcion, float precio) {
        super(descripcion, precio);
    }
    String tipo = "Deportivo";


    @Override
    public String toString() {
        return "VehiculoDeportivo{" + super.getDescripcion() +
                super.getPrecio() +
                "tipo='" + tipo + '\'' +
                '}';
    }
}
