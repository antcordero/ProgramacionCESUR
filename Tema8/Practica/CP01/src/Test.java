import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {

        //Si no existe el directorio crearlo
        File directorio = new File(".\\misArchivos");
        if (!directorio.exists()){
            directorio.mkdirs();
        }

        //Si no existe el archivo (fichero) crearlo
        File archivo = new File(".\\misArchivos\\logs.txt");
        try {
            if (!archivo.exists()) {
                archivo.createNewFile();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
}
