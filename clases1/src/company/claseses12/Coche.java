package company.claseses12;

public class Coche {
    String name = "Nombre del coche ";
    public Coche(){
    }
    public Coche(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "name='" + name + '\'' +
                '}';
    }
}
