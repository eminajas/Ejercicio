package company.ejercicios2;

import java.util.ArrayList;
import java.util.List;

public class listasCostco {
    public static void main(String[] args) {

        List<costco> productos = new ArrayList<>();

        productos.add(new costco("harina hotcakes","Kruzteas", 1254230,231));
        productos.add(new costco("hotdogs","kirkland",2549853,125));
        productos.add(new costco("mayonesa","haiz",12549,125));

        System.out.println(productos);



    }

}
