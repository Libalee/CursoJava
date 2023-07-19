package sintaxe.arquivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Arquivo {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\Libale\\Desktop\\Torrent\\coisasFaculdade\\sim.txt");

        Scanner scanner = null;

        try {
            scanner = new Scanner(file);
            while(scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if(scanner != null) {
                scanner.close();
            }
        }

    }
}
