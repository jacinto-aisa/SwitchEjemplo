// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        FactoriaDeCoches miFabricaDeCoches = new FactoriaDeCoches();
        Vehiculo miDeportivo = miFabricaDeCoches.dameVehiculo(TipoDeVehiculo.Deportivo);
        Vehiculo miDescapotable = miFabricaDeCoches.dameVehiculo(TipoDeVehiculo.Descapotable);
        Vehiculo miBerlina = miFabricaDeCoches.dameVehiculo(TipoDeVehiculo.CuatroPorCuatro);
        System.out.println(miDeportivo);
        System.out.println(miDescapotable);
        System.out.println(miBerlina);
        Vehiculo miBerlina2 = miFabricaDeCoches.dameVehiculo("Berlina");
        Vehiculo miCoche3 = miFabricaDeCoches.dameVehiculo("CuatroporCuatro");
        System.out.println(miBerlina2);
        System.out.println(miCoche3);

    }
}