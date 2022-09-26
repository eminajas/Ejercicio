package company.ejercicios2;

public class perros {
    String raza = "raza del perro";
    Integer precio = 100;
   /* public perros(){

    }*/

    public perros(String raza, Integer precio){
        this.raza = raza;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "perros{" +
                "raza='" + raza + '\'' +
                ", precio=" + precio +
                '}';
    }
}
