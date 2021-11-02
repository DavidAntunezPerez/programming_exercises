/**
 * @author David Antúnez Pérez
 * 
 */


public class Ex12 {
  
  public static void main (String[] args) {
    System.out.println("TEST 1º DAM");
    System.out.println("-------------");
    System.out.println("PREGUNTA 1:");
    System.out.println("Cuales de estos son SGBD:");
    System.out.println(" a) IMS \n b) Microsoft Azure \n c) Oracle Touch ");
    String ans1;
    int result = 0;
      System.out.print(" Selecciona la respuesta: ");
      ans1 = System.console().readLine().toLowerCase();
        switch (ans1){
        case "a":
        System.out.printf(" ¡Respuesta correcta! \n IMS es una base de datos jerárquica creada por IBM \n");
        result++;
        System.out.println(" Puntuación: " + result);
        break;
        default: 
        System.out.println(" Oh, no, has fallado...");
        System.out.println(" Puntuación: " + result);
      }
    System.out.println("-------------");
    
    
    System.out.println("PREGUNTA 2:");
    System.out.println(" Un ejemplo de medida de prevención es: ");
    System.out.println(" a) Airbag \n b) Guantes \n c) Frenos ABS ");
    String ans2;
      System.out.print(" Selecciona la respuesta: ");
      ans2 = System.console().readLine().toLowerCase();
        switch (ans2){
        case "c":
        System.out.printf("¡Respuesta correcta! \n Los frenos ABS es un sistema de seguridad presente \n en coches que previene el bloqueo de ruedas \n");
        result++;
        System.out.println(" Puntuación: " + result);
        break;
        default: 
        System.out.println(" Oh, no, has fallado...");
        System.out.println(" Puntuación: " + result);
      }
          System.out.println("-------------");
          
          
    System.out.println("PREGUNTA 3:");
    System.out.println(" Un ejemplo de entorno de ejecución es: ");
    System.out.println(" a) JRE \n b) VirtualBox \n c) Kubernetes ");
    String ans3;
      System.out.print(" Selecciona la respuesta: ");
      ans3 = System.console().readLine().toLowerCase();
      switch (ans3){
        case "a":
        System.out.printf("¡Respuesta correcta! \nJRE (Java Runtime Enviroment) es un entorno de ejecución que proporciona \nlas blibliotecas de clases y otros recursos que un programa Java requiera ejecutar.\n");
        result++;
        System.out.println(" Puntuación: " + result);
        break;
        default: 
        System.out.println(" Oh, no, has fallado...");
        System.out.println(" Puntuación: " + result);
      }
          System.out.println("-------------");
    System.out.println("PREGUNTA 4:");
    System.out.println("¿Quién fue el inventor de la World Wide Web ?");
    System.out.println(" a) Tim Berners-Lee \n b) Marc Andreessen \n c) Steve Jobs  ");
    String ans4;
      System.out.print(" Selecciona la respuesta: ");
      ans4 = System.console().readLine().toLowerCase();
      switch (ans4){
        case "a":
        System.out.printf("¡Respuesta correcta! \nTim Berners-Lee es un reconocido e importante científico informático de origen británico\n al que se le atribulle la invención de la WWW y del lenguaje de marcas HTML. \n");
        result++;
        System.out.println(" Puntuación: " + result);
        break;
        default: 
        System.out.println(" Oh, no, has fallado...");
        System.out.println(" Puntuación: " + result);
      }
      
          System.out.println("-------------");
    System.out.println("PREGUNTA 5:");
    System.out.println(" ¿Cuál es la última versión de Ubuntu hasta la fecha (22/10/21)?");
    System.out.println(" a) 22.04.03 \n b) 22.10 \n c) 22.01 ");
    String ans5;
      System.out.print(" Selecciona la respuesta: ");
      ans5 = System.console().readLine().toLowerCase();
      switch (ans5){
        case "b":
        System.out.printf("¡Respuesta correcta! \nEl OS Ubuntu 22.10 fue lanzado en 14/10/21 bajo el nombre de Impish Indri\n");
        result++;
        System.out.println(" Puntuación: " + result);
        break;
        default: 
        System.out.println(" Oh, no, has fallado...");
        System.out.println(" Puntuación: " + result);
      }
      
          System.out.println("-------------");
    System.out.println("PREGUNTA 6:");
    System.out.println("¿Qué es una boolean en Java ?");
    System.out.println(" a) Sirve para compilar un archivo .java para poder ejecutarlo posteriormente \n b) Un tipo de datos primitivo que puede almacenar valores verdaderos o falsos.\n c) Se utiliza para analizar los errores de un archivo .java para compilarlos ");
    String ans6;
      System.out.print(" Selecciona la respuesta: ");
      ans6 = System.console().readLine().toLowerCase();
      switch (ans6){
        case "b":
        System.out.printf("¡Respuesta correcta! \n Una boolean o variable booleana es capaz de \nverificar si un hecho es verdadero o falso en Java\n");
        result++;
        System.out.println(" Puntuación: " + result);
        break;
        default: 
        System.out.println(" Oh, no, has fallado...");
        System.out.println(" Puntuación: " + result);
      }
      
    System.out.println("-------------");
    System.out.println("PREGUNTA 7:");
    System.out.println("¿Qué componente se encarga de convertir la corriente alterna en continua en un ordenador regulando el voltaje de los componentes?");
    System.out.println(" a) Socket \n b) PSU \n c) PCIExpress ");
    String ans7;
      System.out.print(" Selecciona la respuesta: ");
      ans7 = System.console().readLine().toLowerCase();
        switch (ans7){
          case "b":
          System.out.printf("¡Respuesta correcta! \nLa PSU o Power Supply Unit se encarga de suministrar la energía electrica de los componentes del ordenador. \n");
          result++;
          System.out.println(" Puntuación: " + result);
          break;
          default: 
          System.out.println(" Oh, no, has fallado...");
          System.out.println(" Puntuación: " + result);
      }
      
          System.out.println("-------------");
    System.out.println("PREGUNTA 8:");
    System.out.println("¿Cuáles de estos son Lenguajes de Programación Orientados a Objetos?");
    System.out.println(" a) C \n b) C++ \n c) SQL ");
    String ans8;
      System.out.print(" Selecciona la respuesta: ");
      ans8 = System.console().readLine().toLowerCase();
      switch (ans8){
        case "b":
        System.out.printf("¡Respuesta correcta! \n C++ es una extensión a C para soportar la programación orientada a objetos (POO).  \n");
        result++;
        System.out.println(" Puntuación: " + result);
        break;
        default: 
        System.out.println(" Oh, no, has fallado...");
        System.out.println(" Puntuación: " + result);
      }
      
          System.out.println("-------------");
    System.out.println("PREGUNTA 9:");
    System.out.println("¿Cuantas versiones oficiales tiene HTML actualmente (23/10/21?");
    System.out.println(" a) 5 \n b) 4 \n c) 6 ");
    String ans9;
      System.out.print(" Selecciona la respuesta: ");
      ans9 = System.console().readLine().toLowerCase();
      switch (ans9){
        case "a":
        System.out.printf("¡Respuesta correcta! \nHTLM 5 es la última especificación oficial y se espera que continúe evolucionando a lo largo de los próximos años. \n");
        result++;
        System.out.println(" Puntuación: " + result);
        break;
        default: 
        System.out.println(" Oh, no, has fallado...");
        System.out.println(" Puntuación: " + result);
      }
      
      
          System.out.println("-------------");
    System.out.println("PREGUNTA 10:");
    System.out.println("¿Cuál fue el primer Lenguaje de Programación Universal ?");
    System.out.println(" a) C \n b) COBOL \n c) Fortran ");
    String ans10;
      System.out.print(" Selecciona la respuesta: ");
      ans10 = System.console().readLine().toLowerCase();
      switch (ans10){
        case "c":
        System.out.printf("¡Respuesta correcta! \nEl FORTRAN (FORmula TRANslator) fue el primer lenguaje de programación utilizado universalmente en el mundo de la programación. \n Fue creado en 1957 por John Backus de IBM. \n");
        result++;
        System.out.println(" Puntuación: " + result);
        break;
        default: 
        System.out.println(" Oh, no, has fallado...");
        System.out.println(" Puntuación: " + result);
        if ((result >= 9)&&(result < 10)){
          System.out.printf("¡Casi perfecto! Buen trabajo, se nota que estas estudiando mucho,\n con un poco más de esfuerzo llegarás al máximo.");
          }
        else if((result>=7)&&(result<9)) {
          System.out.printf("Una puntuación notable, no esta nada mal, sigue esforzandote para llegar al máximo");
          }
        else if((result>=5)&&(result<7)) {
          System.out.printf("Vas muy justo, deberías estar más atento en clase.");
          }
        else if(result>=10) {
          System.out.printf("¡Puntuación perfecta! Muy buen trabajo, se nota que te esfuerzas y estás atent@ en clase.");
          }
        else {
          System.out.printf("No estas dando tu máximo, sabes que puedes hacerlo mejor,\npor lo menos, para rozar el suficiente.");
        }
      }
    }
 }

