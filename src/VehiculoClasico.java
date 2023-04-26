public class VehiculoClasico extends Vehiculo{
    public VehiculoClasico(String descripcion, float precio) {
        super(descripcion, precio);
    }
    String tipo = "Clasico";


    @Override
    public String toString() {
        return "Vehiculo Clasico{" + super.getDescripcion() +
                super.getPrecio() +
                "tipo='" + tipo + '\'' +
                '}';
    }
}
