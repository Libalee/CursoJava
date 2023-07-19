package sintaxe.tempo;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DataHoraCalc {
    public static void main(String[] args) {
        LocalDate LD01 = LocalDate.now();
        LocalDateTime LD02 = LocalDateTime.now();
        Instant LD03 = Instant.now();

        // Pra fazer calculo tem que instancia uma data nova.

        LocalDate CLD01 = LD01.minusDays(7);
        LocalDate CLD02 = LD01.plusDays(7);

        LocalDateTime CLD03 = LD02.minus(7, ChronoUnit.DAYS); // ChronoUnit é a unidade temportal
        LocalDateTime CLD04 = LD02.plus(7, ChronoUnit.DAYS); // Um enum q simboliza a quantidade de tempo

        System.out.println(CLD01);
        System.out.println(CLD02);
        System.out.println(CLD03);
        System.out.println(CLD04);

        Duration t1 = Duration.between(CLD03, CLD04);


        System.out.println(t1.toDays());

    }
}
