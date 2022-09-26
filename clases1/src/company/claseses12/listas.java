package company.claseses12;
import java.util.ArrayList;
import java.util.List;


public class listas
{
    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>();

        nombres.add("Emmanuel");
        nombres.add("ema");
        nombres.add("jose");
        nombres.add("alberto");
        nombres.add("joseliro");

        System.out.println(nombres);

        for(String nombre: nombres){
            System.out.println(nombre);
        }

        List<Coche>coches = new ArrayList<>();
        coches.add(new Coche("honda civic"));
        coches.add(new Coche("subaru wrx"));
        coches.add(new Coche("lamborghini aventador"));

        System.out.println(coches);


    }
}
