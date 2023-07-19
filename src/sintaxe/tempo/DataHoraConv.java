package sintaxe.tempo;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class DataHoraConv {
    public static void main(String[] args) {
        LocalDate LD01 = LocalDate.now();
        LocalDateTime LD02 = LocalDateTime.now();
        Instant LD03 = Instant.now();

        LocalDate r1 = LocalDate.ofInstant(LD03, ZoneId.systemDefault()); // Converte a hora global pra uma hora do sistema.
        LocalDate r2 = LocalDate.ofInstant(LD03, ZoneId.of("Portugal")); // Converte a hora global pra uma hora de um fuso dado.

        LocalDateTime r3 = LocalDateTime.ofInstant(LD03, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(LD03, ZoneId.of("Portugal"));

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);

        System.out.println(LD01.getDayOfMonth());
        System.out.println(LD02.getMinute());
    }
}
