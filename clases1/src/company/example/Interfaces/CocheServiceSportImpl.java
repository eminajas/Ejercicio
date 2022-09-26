package company.example.Interfaces;

import company.clase1.Coche;

public class CocheServiceSportImpl implements CochesService {
    @Override
    public Coche crearCocheDemo() {
        System.out.println("creando elecctrico");
        return new Coche();
    }

    @Override
    public void destruirCoche(){

    }

    @Override
    public void destruirCoche(Coche coche) {

    }
}
