public class VehiculoDescapotable extends Vehiculo{
    public VehiculoDescapotable(String descripcion, float precio) {
        super(descripcion, precio);
    }
    String tipo = "Descapotable";


    @Override
    public String toString() {
        return "Vehiculo Descapotable{" + super.getDescripcion() +
                super.getPrecio() +
                "tipo='" + tipo + '\'' +
                '}';
    }
}
