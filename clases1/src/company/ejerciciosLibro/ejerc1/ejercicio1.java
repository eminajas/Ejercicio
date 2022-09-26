package company.ejerciciosLibro.ejerc1;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        libroCalificaciones miLibroCalificaciones = new libroCalificaciones();

        System.out.printf("El nombre incial del curso es: %s\n\n ",
                miLibroCalificaciones.getNombreDelCurso());

        System.out.println("escriba el nombre del curso: ");

        String elnNombre = entrada.nextLine();
        miLibroCalificaciones.setNombreDelCurso(elnNombre);
        System.out.println();
        miLibroCalificaciones.setmensaje();


    }
}
