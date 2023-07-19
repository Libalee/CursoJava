package sintaxe.tempo;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DataHoraTrans {
    public static void main(String[] args) {
        LocalDate LD01 = LocalDate.now();
        LocalDateTime LD02 = LocalDateTime.now();
        Instant LD03 = Instant.now();


        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt03 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        System.out.println(LD01.format(fmt01));
        System.out.println(LD02.format(fmt02));
        System.out.println(fmt03.format(LD03));

    }
}
