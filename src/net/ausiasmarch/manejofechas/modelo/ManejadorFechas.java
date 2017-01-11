package net.ausiasmarch.manejofechas.modelo;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

/**
 * ManejadorFechas.java
 *
 * @author Bruno Fortea Mas
 */
public class ManejadorFechas {

    private static final Locale locale = new Locale("es", "ES");

   
    public static String getDiaSemanaCorto(LocalDateTime ldt) {
        return ldt.getDayOfWeek().getDisplayName(TextStyle.SHORT, locale);
    }

    
    public static String getDiaSemanaCompleto(LocalDateTime ldt) {
        return ldt.getDayOfWeek().getDisplayName(TextStyle.FULL, locale);
    }

    
    public static String getDiaMesCorto(LocalDateTime ldt) {
        return ldt.getMonth().getDisplayName(TextStyle.SHORT, locale);
    }

    public static String getDiaMesCompleto(LocalDateTime ldt) {
        return ldt.getMonth().getDisplayName(TextStyle.FULL, locale);
    }

    public static String getDiaSemanaCorto(LocalDate ld) {
        return ld.getDayOfWeek().getDisplayName(TextStyle.SHORT, locale);
    }

    public static String getDiaSemanaCompleto(LocalDate ld) {
        return ld.getDayOfWeek().getDisplayName(TextStyle.FULL, locale);
    }

    public static String getDiaMesCorto(LocalDate ld) {
        return ld.getMonth().getDisplayName(TextStyle.SHORT, locale);
    }

    public static String getDiaMesCompleto(LocalDate ld) {
        return ld.getMonth().getDisplayName(TextStyle.FULL, locale);
    }

    public static int getDiaMes(LocalDateTime ldt) {
        return ldt.getDayOfMonth();
    }

    public static int getDiaMes(LocalDate ld) {
        return ld.getDayOfMonth();
    }

    public static int getMes(LocalDateTime ldt) {
        return ldt.getMonthValue();
    }

    public static int getAnyo(LocalDateTime ldt) {
        return ldt.getYear();
    }

    public static int getHora(LocalDateTime ldt) {
        return ldt.getHour();
    }

 
    public static int getMin(LocalDateTime ldt) {
        return ldt.getMinute();
    }

    public static int getSec(LocalDateTime ldt) {
        return ldt.getSecond();
    }

    public static int getMes(LocalDate ld) {
        return ld.getMonthValue();
    }

    public static int getAnyo(LocalDate ld) {
        return ld.getYear();
    }

    public static int getDia(LocalDate ld) {
        return ld.getDayOfMonth();
    }

    public static LocalDate sumaDias(LocalDate ld, int valor) {

        return ld.plusDays(valor);
    }

    public static LocalDateTime sumaDias(LocalDateTime ldt, int valor) {
        return ldt.plusDays(valor);
    }

    public static LocalDate sumaMeses(LocalDate ld, int valor) {

        return ld.plusMonths(valor);
    }

    public static LocalDateTime sumaMeses(LocalDateTime ldt, int valor) {
        return ldt.plusMonths(valor);
    }

    public static LocalDate sumaAnyos(LocalDate ld, int valor) {

        return ld.plusYears(valor);
    }

    public static LocalDateTime sumaAnyos(LocalDateTime ldt, int valor) {
        return ldt.plusYears(valor);
    }

    public static LocalDate sumar(LocalDate ld, int valor, String unidades) {
        switch (unidades) {
            case "Dias":
                ld = ManejadorFechas.sumaDias(ld, valor);
                break;

            case "Meses":
                ld = ManejadorFechas.sumaMeses(ld, valor);
                break;

            case "Años":
                ld = ManejadorFechas.sumaAnyos(ld, valor);
                break;

        }
        return ld;
    }

    public static LocalDate sumar(LocalDate ld, int valor, ChronoUnit unidades) {
        return ld.plus(valor, unidades);
    }

    public static LocalDate restaDias(LocalDate ld, int valor) {

        return ld.minusDays(valor);
    }


    public static LocalDateTime restaDias(LocalDateTime ldt, int valor) {
        return ldt.minusDays(valor);
    }

    public static LocalDate restaMeses(LocalDate ld, int valor) {

        return ld.minusMonths(valor);
    }

    public static LocalDateTime restaMeses(LocalDateTime ldt, int valor) {
        return ldt.minusMonths(valor);
    }

    public static LocalDate restaAnyos(LocalDate ld, int valor) {

        return ld.minusYears(valor);
    }

    public static LocalDateTime restaAnyos(LocalDateTime ldt, int valor) {
        return ldt.minusYears(valor);
    }

    public static LocalDate restar(LocalDate ld, int valor, String unidades) {
        switch (unidades) {
            case "Dias":
                ld = ManejadorFechas.restaDias(ld, valor);
                break;

            case "Meses":
                ld = ManejadorFechas.restaMeses(ld, valor);
                break;

            case "Años":
                ld = ManejadorFechas.restaAnyos(ld, valor);
                break;

        }
        return ld;
    }

    public static LocalDate restar(LocalDate ld, int valor, ChronoUnit unidades) {
        return ld.minus(valor, unidades);
    }

    public static String fechaActual() {
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("EEEE dd 'de' MMMM 'de' yyyy");
        LocalDate fecha = LocalDate.now();
        return fecha.format(dt);

    }

    public static String fechaHoraActual() {
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("EEEE dd 'de' MMMM 'de' yyyy    H:mm:ss a");
        LocalDateTime fecha = LocalDateTime.now();
        return fecha.format(dt);

    }

}
