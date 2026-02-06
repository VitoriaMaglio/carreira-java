package br.com.alura.screenmatch.modelos;

import javax.sound.midi.Soundbank;
import java.time.*;
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DataHora {
    //LocalDate data s/ fuso horário
    LocalDate data1 = LocalDate.now();
    LocalDate data11 = LocalDate.of(2026, 02, 12);
    LocalDate data111 = LocalDate.parse("2026-02-12");
    //DateTimeFormatter é uma variável do formato que sua data fora do padrãp ISO vai ter
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate data1111 = LocalDate.parse("\"12/02/2026\"", fmt);

    //LocalDateTime data com hora
    LocalDateTime dataHora = LocalDateTime.parse("2026-02-13T17:30");


    public static void main(String[] args) {

        LocalDate exer = LocalDate.now();
        LocalTime exer2 = LocalTime.now();

        DateTimeFormatter fmtexer = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter fmtexer2 = DateTimeFormatter.ofPattern("HH:mm");

        String dataF = exer.format(fmtexer);
        String timeF = exer2.format(fmtexer2);


        System.out.println("Data formatada: " + dataF);
        System.out.println("Time formatada: " + timeF);

        Scanner scanner = new Scanner(System.in);
        //System.out.println("Digite o horário que vc iniciou o exercício: ");
        //String timeInicio = scanner.nextLine();

        //LocalTime timeI = LocalTime.parse(timeInicio);

        //System.out.println("Digite o horário que vc terminou o exercício: ");
        //String timeTermino = scanner.nextLine();

        //LocalTime timeT = LocalTime.parse(timeTermino);

        //Duração entre dois períodos de tempo em segundos
        //Duration duracao = Duration.between(timeI,timeT);
        //System.out.println("Diferença: "+ duracao.toHours() + "horas e " + duracao.toMinutes() + "minutos." );

        //Fuso horário
        ZonedDateTime horaJ = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String horaFormatada = horaJ.format(formatter);
        System.out.println(horaFormatada);

        ZonedDateTime horaPadrao = ZonedDateTime.now();
        ZonedDateTime horaAustr = ZonedDateTime.now(ZoneId.of("Australia/Sydney"));
        //ZonedDateTime horaAustrCurto = horaPadrao.withZoneSameInstant(ZoneId.of("Australia/Sydney"));

        System.out.println("Hora padrão: " + horaPadrao);
        System.out.println("Hora Sydney: " + horaAustr);
        DateTimeFormatter datafmt = DateTimeFormatter.ofPattern("HH:mm");
        String dataPaF = horaPadrao.format(datafmt);
        System.out.println("Hora padrao fmt: "+ dataPaF);
        String dataSydF = horaAustr.format(datafmt);
        System.out.println("Hora Sydney fmt: " + dataSydF);

//        System.out.println("Digite a data produto: ");
//        String prodInicio = scanner.nextLine();
//
//        DateTimeFormatter formata = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//
//        LocalDate dataPro = LocalDate.parse(prodInicio, formata);
//        LocalDate dataVenc = dataPro.plusMonths(4);
//        String dataVencFor = dataVenc.format(formata);
//
//        System.out.println("Data vencimento: " + dataVencFor);

        System.out.println("Digite a hora que vc entrou na trab: ");
        String horaEntrada = scanner.nextLine();

        DateTimeFormatter horaFmt = DateTimeFormatter.ofPattern("HH:mm");

        LocalTime horaEntradaFmt = LocalTime.parse(horaEntrada, horaFmt);
        //converti a entrada String do user para hora

        LocalTime cargaH = horaEntradaFmt.plusHours(6);
        System.out.println("Hora de saída prevista: " + cargaH);

        System.out.println("Digite o horário que vc saiu do trab: ");
        String horaSaida = scanner.nextLine();

        LocalTime horaSaidaFmt = LocalTime.parse(horaSaida, horaFmt);

        Duration duration = Duration.between(cargaH,horaSaidaFmt).abs();//valor absoluto
        System.out.println("Diferença: " + duration.toHours() +"horas e "+ duration.toMinutesPart() + "minutos");

        //Para cálculo de sistemas reais usar LocalDateTime poispode ter virada de dia



    }

}
