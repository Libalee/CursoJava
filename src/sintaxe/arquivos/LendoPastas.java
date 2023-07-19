package sintaxe.arquivos;

import java.io.File;

public class LendoPastas {
    public static void main(String[] args) {

        File path = new File("C:\\Users\\Libale\\Desktop\\Torrent");

        File[] folders = path.listFiles();

        // Mostra todos os arquivos na pasta destino
        //
        for(File file: folders) {
            System.out.println(file);
        }

    }
}
