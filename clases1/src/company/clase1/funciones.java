package company.clase1;

public class funciones {
    public static void main(String[] args) {
        holamundo();
        holamundo2("mira me comi una sardina");
        holamundo2("roberto");
        System.out.println("que hace");
        //suma(12,5);
        System.out.println(suma(12,5));
    }

    private static void holamundo() {
        System.out.println("hola mundo desde un metodo");
        System.out.println("hola");
        System.out.println("mundo");
    }

    public static String holamundo2(String hola) {
        System.out.println("hola = " + hola);
        return hola;
    }

    public static int suma(int a, int b){

        return a+b;
    }

    }
