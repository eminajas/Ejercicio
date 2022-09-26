package company.clase1;

public class switcches {
    public static void main(String[] args) {
        String clima = "soleado";

        switch(clima){
            case  "soleado":
                System.out.println("esta soleado");
                break;
            case "nublado":
                System.out.println("esta nublaso");
                break;
            default:
                System.out.println("no se conoce el clima");
                break;

        }
    }

}
