/*
 * Ex20.java
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


public class Ex20 {
  
  public static void main (String[] args) {
     String line;
      System.out.print(" Escribe un número entero positivo: ");
      line = System.console().readLine();
      int num, inv = 0, cifra;
      int aux = 0;
      num = Integer.parseInt(line);
      //invertir número
      num = aux;
      cifra = aux % 10; 
      inv = inv * 10 + cifra;
      aux = aux / 10; 
      if(num == inv){
            System.out.println(" El número es capicua");
        }else{
            System.out.println(" El número no es capicua");
  }
 }
}
