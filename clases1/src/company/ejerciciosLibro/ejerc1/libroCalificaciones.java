package company.ejerciciosLibro.ejerc1;

public class libroCalificaciones {
    private String nombreDelCurso;

    public void setNombreDelCurso(String nombreDelCurso) {
        this.nombreDelCurso = nombreDelCurso;
    }

    public String getNombreDelCurso() {
        return nombreDelCurso;
    }

    public void setmensaje(){
        System.out.printf("bienvenido al libro de calificaciones para \n%s!\n", getNombreDelCurso());
    }
}
