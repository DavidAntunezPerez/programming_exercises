/**
 *
 * @author David Antúnez Pérez
 * 
 */

public class Ex10{
  
  public static void main (String[] args) {
    System.out.println(" AVERIGUA TU HORÓSCOPO");
    System.out.println("-----------------------");
      String month;
      System.out.print(" Indica tu mes de nacimiento: ");
      month = System.console().readLine();
      String line2;
      System.out.print(" Indica tu día de nacimiento: ");
      line2 = System.console().readLine();
      int day;
      day = Integer.parseInt(line2);
      
        switch (month){
          case "Enero":
            if ((day <= 20)&&(day > 0)){
              System.out.println(" Tu signo es Capricornio");
              }
            else if ((day >=21)&&(day<=31))
            {
              System.out.println(" Tu signo es Acuario");
              }
              else {
                System.out.println(" Por favor, indica un número entre 1 y 31");
              }
          break;
          case "Febrero":
            if ((day <= 19)&&(day > 0)){
              System.out.println(" Tu signo es Acuario");
              }
            else if ((day >=20)&&(day<=29))
            {
              System.out.println(" Tu signo es Piscis");
              }
              else {
                System.out.println(" Por favor, indica un número entre 1 y 31");
              }
          break;
          case "Marzo":
            if ((day <= 20)&&(day > 0)){
              System.out.println(" Tu signo es Piscis");
              }
            else if ((day >=21)&&(day<=31))
            {
              System.out.println(" Tu signo es Aries");
              }
              else {
                System.out.println(" Por favor, indica un número entre 1 y 31");
              }
          break;
          case "Abril":
            if ((day <= 21)&&(day > 0)){
              System.out.println(" Tu signo es Aries");
              }
            else if ((day >=22)&&(day<=30))
            {
              System.out.println(" Tu signo es Tauro");
              }
              else {
                System.out.println(" Por favor, indica un número entre 1 y 31");
              }
          break;
          case "Mayo":
            if ((day <= 21)&&(day > 0)){
              System.out.println(" Tu signo es Tauro");
              }
            else if ((day >=22)&&(day<=31))
            {
              System.out.println(" Tu signo es Géminis");
              }
              else {
                System.out.println(" Por favor, indica un número entre 1 y 31");
              }
          break;
          case "Junio":
            if ((day <= 21)&&(day > 0)){
              System.out.println(" Tu signo es Géminis");
              }
            else if ((day >=22)&&(day<=30))
            {
              System.out.println(" Tu signo es Cáncer");
              }
              else {
                System.out.println(" Por favor, indica un número entre 1 y 31");
              }
          break;
          case "Julio":
            if ((day <= 22)&&(day > 0)){
              System.out.println(" Tu signo es Cáncer");
              }
            else if ((day >=23)&&(day<=31))
            {
              System.out.println(" Tu signo es Leo");
              }
              else {
                System.out.println(" Por favor, indica un número entre 1 y 31");
              }
          break;
          case "Agosto":
            if ((day <= 22)&&(day > 0)){
              System.out.println(" Tu signo es Leo");
              }
            else if ((day >=23)&&(day<=30))
            {
              System.out.println(" Tu signo es Virgo");
              }
              else {
                System.out.println(" Por favor, indica un número entre 1 y 31");
              }
          break;
          case "Septiembre":
            if ((day <= 22)&&(day > 0)){
              System.out.println(" Tu signo es Virgo");
              }
            else if ((day >=23)&&(day<=31))
            {
              System.out.println(" Tu signo es Libra");
              }
              else {
                System.out.println(" Por favor, indica un número entre 1 y 31");
              }
          break;
          case "Octubre":
            if ((day <= 22)&&(day > 0)){
              System.out.println(" Tu signo es Libra");
              }
            else if ((day >=23)&&(day<=30))
            {
              System.out.println(" Tu signo es Escorpio");
              }
              else {
                System.out.println(" Por favor, indica un número entre 1 y 31");
              }
          break;
          case "Noviembre":
            if ((day <= 22)&&(day > 0)){
              System.out.println(" Tu signo es Escorpio");
              }
            else if ((day >=23)&&(day<=31))
            {
              System.out.println(" Tu signo es Sagitario");
              }
              else {
                System.out.println(" Por favor, indica un número entre 1 y 31");
              }
          break;
          case "Diciembre":
            if ((day <= 22)&&(day > 0)){
              System.out.println(" Tu signo es Sagitario");
              }
            else if ((day >=23)&&(day<=30))
            {
              System.out.println(" Tu signo es Capricornio");
              }
              else {
                System.out.println(" Por favor, indica un número entre 1 y 31");
              }
          break;
          default:
            System.out.printf(" Este mes no es válido, debe de estar escrito con la primera letra mayúscula y \n en Español.");
          }
        
        }
      
  }


