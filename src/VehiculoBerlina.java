public class VehiculoBerlina extends Vehiculo{
    public VehiculoBerlina(String descripcion, float precio) {
        super(descripcion, precio);
    }
    String tipo = "Berlina";


    @Override
    public String toString() {
        return "Vehiculo Berlina{" + super.getDescripcion() +
                super.getPrecio() +
                "tipo='" + tipo + '\'' +
                '}';
    }
}
