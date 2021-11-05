/**
 * @author David Antunez Perez
 * Implementa un programa que calcule el número de latidos del corazón de una persona
 * durante el transcurso de varios años. Al usuario se le solicitará el tiempo transcurrido,
 *  expresado en años, y el ritmo cardíaco medio durante todos esos años, medido en latidos por
 *  minuto. No es necesario considerar los años bisiestos, se considera que todos los años tienen
 *  365 días.
 */
public class Ex03dap2 {
    public static void main(String[] args) {
        int puls; // pulsaciones por minuto
        int year; // años transcurridos
        int total; // total de latidos en ese tiempo
        System.out.print("Introduzca su ritmo cardíaco medio en pulsaciones por minuto: ");
            puls = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca el tiempo en años: ");
            year = Integer.parseInt(System.console().readLine());
        total = puls * year * 365 * 24 * 60;
        System.out.println("Su corazón habrá latido "+total+" veces en " + year+ " año(s).");
  }
}
