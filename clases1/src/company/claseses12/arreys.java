package company.claseses12;

public class arreys {
    public static void main(String[] args) {
        String nombre1= "hola1";
        String nombre2 = "jola";
        String nombre3= "hola2";
        String nombre4 = "jola2";
        String nombre5= "hola3";
        String nombre6 = "jola3";

        String[] nombres = new String[6];
        String[] nombres2 = new String[]{nombre1, nombre2, nombre3, nombre4, nombre5, nombre6};
        nombres[0] = nombre1;
        nombres[1] = nombre2;
        nombres[2] = nombre3;
        nombres[3] = nombre4;
        nombres[4] = nombre5;
        nombres[5] = nombre6;

        for (int i = 0; i < nombres.length; i++){
            System.out.println(nombres[i]);
        }
    }
}
