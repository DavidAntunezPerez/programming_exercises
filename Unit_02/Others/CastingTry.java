package Others;
/*
 * CastingTry.java
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


public class CastingTry {
  public static void main(String[] args) {
    int x = 2;
    int y = 9;
    double division;

    division = (double) y / (double) x;
    
    System.out.println("El verdadero resultado es " + division);
  
    division = y / x;
  
    System.out.println("El resultado falso de la división es " + division);   
  }
}


