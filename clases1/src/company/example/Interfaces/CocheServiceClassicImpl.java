package company.example.Interfaces;

import company.clase1.Coche;
import company.clase1.cocheELECTRICO;

public class CocheServiceClassicImpl implements CochesService {
    @Override
    public Coche crearCocheDemo() {
        System.out.println("creando coche electrico");
        return new cocheELECTRICO();
    }

    @Override
    public void destruirCoche(){

    }
    @Override
    public void destruirCoche(Coche coche){
        System.out.println("estoy destruyendo el coche");
       // return null;
    }
}
