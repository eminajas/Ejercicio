package company.ejercicios2;

public class costco {
    String productos = " ";
    String marca = " ";
    Integer Id = 120;
    Integer precio = 1265;

    public costco(String productos, String marca,Integer Id,Integer precio){
        this.productos = productos;
        this.marca =marca;
        this.Id = Id;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "costco{" +
                "productos='" + productos + '\'' +
                ", marca='" + marca + '\'' +
                ", Id=" + Id +
                ", precio=" + precio +
                '}';
    }
}
