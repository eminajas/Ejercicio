package company.claseses12;

public class stringsmain {
    //la clase String

    /*
        length()
        startsWith("")
        endsWith("")
        indexof()
        subString(1,5)
        trim()
        equals()
        compareTo
     */



    public static void main(String[] args) {
        String mensaje = "que hay de nuevo";

        System.out.println(mensaje.length());
        String mensajeMAY = mensaje.toUpperCase();
        System.out.println(mensajeMAY);

        String otro = "que hay de viejo";

        if(mensajeMAY.equalsIgnoreCase(otro)){
            System.out.println("verdadero "+ otro+ " es igual "+mensajeMAY);
        }
        System.out.println("falso " + otro + " no es igual " + mensajeMAY);
    }

}
