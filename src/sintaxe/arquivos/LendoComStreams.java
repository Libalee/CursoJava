package sintaxe.arquivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LendoComStreams {
    public static void main(String[] args) {

        String path = "C:\\Users\\Libale\\Desktop\\Torrent\\coisasFaculdade\\sim.txt";

        // Tem que colocar o BufferedReader dentro do try pra ter que escrever menos
        // Caso ele não esteja aqui tem que colocar um outro try dentro do finally
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line = bufferedReader.readLine();

            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        }
        catch (IOException e) {
            System.out.print("Error " + e.getMessage());
        }
    }
}
