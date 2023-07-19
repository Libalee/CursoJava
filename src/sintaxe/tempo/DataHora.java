package sintaxe.tempo;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.stream.StreamSupport;

public class DataHora {
    public static void main(String[] args) {

        LocalDate LD01 = LocalDate.now(); // Data local
        LocalDateTime LD02 = LocalDateTime.now(); // Data local com hora
        Instant LD03 = Instant.now(); // Horario de londres com hora

        LocalDate LD04 = LocalDate.parse("1997-08-31"); // Hora a partir de um texto
        // Hora é similar, só tem que criar com o LocalDateTime
        // Instant é igual, só tem que colocar o fuso no final

        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Como interpretar o texto
        LocalDate LD05 = LocalDate.parse("08/07/2023", fmt01); // Usando o interpretador de texto

        DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime LD06 = LocalDateTime.parse("08/07/2023 11:25", fmt02);

        LocalDate LD07 = LocalDate.of(2023, 07, 8);
        LocalDateTime LD08 = LocalDateTime.of(2023, 07, 8, 11, 31);

        System.out.println(LD01);
        System.out.println(LD02);
        System.out.println(LD03);
        System.out.println(LD04);
        System.out.println(LD05);
        System.out.println(LD06);
        System.out.println(LD07);
        System.out.println(LD08);
    }
}
