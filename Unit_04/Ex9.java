/*
 * Ex9.java
 * 
 * Copyright 2021 an2 <an2@an2-VirtualBox>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */

public class Ex9 {
  
  public static void main (String[] args) {
     System.out.println(" CALCULADORA DE ECUACIONES DE SEGUNDO GRADO");
     System.out.println("-------------------------------------------");
      String line;
      System.out.print(" Escriba la variable a: ");
      line = System.console().readLine();
      double a;
      a = Integer.parseInt(line);
      System.out.print(" Escriba la variable b: ");
      line = System.console().readLine();
      double b;
      b = Integer.parseInt(line);
      System.out.print(" Escriba la variable c: ");
      line = System.console().readLine();
      double c;
      c = Integer.parseInt(line);
      double result1 = (-b+Math.sqrt((b*b)-4*a*c))-2*a;
      double result2 = (-b-Math.sqrt((b*b)-4*a*c))-2*a;
      System.out.println("El resultado de la ecuación de variables a = "+a+" b = "+b+" c = "+c+" es: "+result1+" y "+result2);
 }
}
