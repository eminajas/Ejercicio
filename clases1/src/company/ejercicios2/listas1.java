package company.ejercicios2;
import java.util.ArrayList;
import java.util.List;

public class listas1 {
    public static void main(String[] args) {
        List<perros> raza = new ArrayList<>();


        raza.add(new perros("galgo",1000));
        raza.add(new perros("husky", 2000));
        raza.add(new perros("san Bernardo", 30000));

        System.out.println(raza);


    }
}
