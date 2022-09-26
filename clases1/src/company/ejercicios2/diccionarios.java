package company.ejercicios2;
import java.util.HashMap;
import java.util.Map;


public class diccionarios {
    public static void main(String[] args) {
        Map<String,String> personas=new HashMap<>();
        personas.put("1234fr","rodolfo gomez");
        personas.put("1249kif", "juan lopez ");
        personas.put("7ewf8932u","emanue juhas");

        System.out.println(personas);

        for(String key: personas.keySet()){
            System.out.println(key);
        }

        for(String values: personas.values()){
            System.out.println(values);
        }

        for(Map.Entry<String,String>pair:personas.entrySet()){
            System.out.println(pair.getKey()+ " / " + pair.getValue());
        }

    }
}
