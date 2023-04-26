public class Cuatro extends Vehiculo{
    public Cuatro(String descripcion, float precio) {
        super(descripcion, precio);
    }
    String tipo = "Cuatro";


    @Override
    public String toString() {
        return "Vehiculo Cuatro{" + super.getDescripcion() +
                super.getPrecio() +
                "tipo='" + tipo + '\'' +
                '}';
    }
}