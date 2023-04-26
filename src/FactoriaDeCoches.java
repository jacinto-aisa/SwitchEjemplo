public class FactoriaDeCoches {

    Vehiculo dameVehiculo(TipoDeVehiculo tipo){
        switch (tipo)
        {
            case Berlina: return new VehiculoBerlina("berlina",89);
            case Clasico: return new VehiculoClasico("clasico",90);
            case Deportivo: return new VehiculoDeportivo("dijijd",89);
            case Descapotable: return new VehiculoDescapotable("ijsia",90);
            case CuatroPorCuatro: return new Cuatro("ijiijs",989);
            default: return null;
        }
    }
    Vehiculo dameVehiculo(String tipo) {
        switch (tipo){
            case "Berlina": return new VehiculoBerlina("berlina",89);
            case "Clasico": return new VehiculoClasico("clasico",90);
            case "Deportivo": return new VehiculoDeportivo("dijijd",89);
            case "Descapotable": return new VehiculoDescapotable("ijsia",90);
            case "CuatroPor Cuatro": return new Cuatro("ijiijs",989);
            default: return null;
        }
    }
}
