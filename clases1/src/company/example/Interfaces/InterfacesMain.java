package company.example.Interfaces;

import company.clase1.Coche;

public class InterfacesMain {
    public static void main(String[] args) {
        CochesService service1 = new CocheServiceClassicImpl();
        CochesService service2 = new CocheServiceSportImpl();

        Coche coche1 = service1.crearCocheDemo();
        Coche coche2 = service2.crearCocheDemo();

    }
}
