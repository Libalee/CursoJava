package sintaxe.arquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CriandoArquivos {
    public static void main(String[] args) {

        List<String> lines = new ArrayList<>();
        String path = "C:\\Users\\Libale\\Desktop\\Torrent\\coisasFaculdade\\nao.txt";

        Scanner scanner = new Scanner(System.in);

        lines.add(scanner.nextLine());

        while(!(lines.stream().anyMatch(x -> x.equals("Sair")))) {
            lines.add(scanner.nextLine());
        }
        // Escrever assim excluiria o arquivo já existente no path e criaria um novo
        // Se não passar o path o arquivo é criado na pasta do projeto (CursoJava)
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))) {
            for (String line: lines) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Escrever assim pra não excluir o arquivo e apenas adicionar a ele
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("nao.txt", true))) {
            for (String line: lines) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        scanner.close();

    }
}
