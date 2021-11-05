/**
 * 
 * @author David Antúnez Pérez
 * 
 */



public class Ex16_4 {
  
  public static void main (String[] args) {
    System.out.println(" TEST DE PAREJA INFIEL: ");
    System.out.println("----------------------- ");
    int points = 0;
     System.out.printf("RESPONDE CON VERDADERO O FALSO,\nCADA RESPUESTA VERDADERA SUMARÁ 3 PUNTOS Y LA FALSA SUMARÁ 0 PUNTOS\n");
    System.out.println("PREGUNTA 1:");
    System.out.println("Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
    String ans1;
    ans1 = System.console().readLine();
    switch (ans1){
    case "verdadero":
    case "Verdadero":
    case "VERDADERO":
      points= points + 3;
      System.out.println("Puntuación: "+points);
      break;
    case "falso": 
    case "Falso": 
    case "FALSO":
      System.out.println("Puntuación: "+points);
    break;
      default:
        System.out.println("'"+ans1+"'"+" no es un valor válido. Puntuación: "+ points);
      }
      System.out.println("---------------------------------------------");
      System.out.println("PREGUNTA 2:");
    System.out.println("Han aumentado sus gastos de vestuario.");
    String ans2;
    ans2 = System.console().readLine();
    switch (ans2){
    case "verdadero":
    case "Verdadero":
    case "VERDADERO":
      points= points + 3;
      System.out.println("Puntuación: "+points);
      break;
    case "falso": 
    case "Falso": 
    case "FALSO":
      System.out.println("Puntuación: "+points);
    break;
      default:
        System.out.println("'"+ans2+"'"+" no es un valor válido. Puntuación: "+ points);
      }
      System.out.println("---------------------------------------------");
            System.out.println("PREGUNTA 3:");
    System.out.println("Ha perdido el interés que mostraba anteriormente por ti.");
    String ans3;
    ans3 = System.console().readLine();
    switch (ans3){
    case "verdadero":
    case "Verdadero":
    case "VERDADERO":
      points= points + 3;
      System.out.println("Puntuación: "+points);
      break;
    case "falso": 
    case "Falso": 
    case "FALSO":
      System.out.println("Puntuación: "+points);
    break;
      default:
        System.out.println("'"+ans3+"'"+" no es un valor válido. Puntuación: "+ points);
      }
      System.out.println("---------------------------------------------");
      System.out.println("PREGUNTA 4:");
    System.out.printf("Ahora se afeita y se asea con más frecuencia (si es hombre) \no ahora se arregla el pelo y se asea con más frecuencia (si es mujer).\n");
    String ans4;
    ans4 = System.console().readLine();
    switch (ans4){
    case "verdadero":
    case "Verdadero":
    case "VERDADERO":
      points= points + 3;
      System.out.println("Puntuación: "+points);
      break;
    case "falso": 
    case "Falso": 
    case "FALSO":
      System.out.println("Puntuación: "+points);
    break;
      default:
        System.out.println("'"+ans4+"'"+" no es un valor válido. Puntuación: "+ points);
      }
      System.out.println("---------------------------------------------");
      System.out.println("PREGUNTA 5:");
    System.out.println(" No te deja que mires la agenda de su teléfono móvil.");
    String ans5;
    ans5 = System.console().readLine();
    switch (ans5){
    case "verdadero":
    case "Verdadero":
    case "VERDADERO":
      points= points + 3;
      System.out.println("Puntuación: "+points);
      break;
    case "falso": 
    case "Falso": 
    case "FALSO":
      System.out.println("Puntuación: "+points);
    break;
      default:
        System.out.println("'"+ans5+"'"+" no es un valor válido. Puntuación: "+ points);
      }
      System.out.println("---------------------------------------------");
      System.out.println("PREGUNTA 6:");
    System.out.println(" A veces tiene llamadas que dice no querer contestar cuando estás tú delante.");
    String ans6;
    ans6 = System.console().readLine();
    switch (ans6){
    case "verdadero":
    case "Verdadero":
    case "VERDADERO":
      points= points + 3;
      System.out.println("Puntuación: "+points);
      break;
    case "falso": 
    case "Falso": 
    case "FALSO":
      System.out.println("Puntuación: "+points);
    break;
      default:
        System.out.println("'"+ans6+"'"+" no es un valor válido. Puntuación: "+ points);
      }
      System.out.println("---------------------------------------------");
      System.out.println("PREGUNTA 7:");
    System.out.println(" Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a.");
    String ans7;
    ans7 = System.console().readLine();
    switch (ans7){
    case "verdadero":
    case "Verdadero":
    case "VERDADERO":
      points= points + 3;
      System.out.println("Puntuación: "+points);
      break;
    case "falso": 
    case "Falso": 
    case "FALSO":
      System.out.println("Puntuación: "+points);
    break;
      default:
        System.out.println("'"+ans7+"'"+" no es un valor válido. Puntuación: "+ points);
      }
        System.out.println("---------------------------------------------");
        System.out.println("PREGUNTA 8:");
    System.out.println(" Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo.");
    String ans8;
    ans8 = System.console().readLine();
    switch (ans8){
    case "verdadero":
    case "Verdadero":
    case "VERDADERO":
      points= points + 3;
      System.out.println("Puntuación: "+points);
      break;
    case "falso": 
    case "Falso": 
    case "FALSO":
      System.out.println("Puntuación: "+points);
    break;
      default:
        System.out.println("'"+ans8+"'"+" no es un valor válido. Puntuación: "+ points);
      }
        System.out.println("---------------------------------------------");
        System.out.println("PREGUNTA 9:");
    System.out.println(" Has notado que últimamente se perfuma más.");
    String ans9;
    ans9 = System.console().readLine();
    switch (ans9){
    case "verdadero":
    case "Verdadero":
    case "VERDADERO":
      points= points + 3;
      System.out.println("Puntuación: "+points);
      break;
    case "falso": 
    case "Falso": 
    case "FALSO":
      System.out.println("Puntuación: "+points);
    break;
      default:
        System.out.println("'"+ans9+"'"+" no es un valor válido. Puntuación: "+ points);
      }
        System.out.println("---------------------------------------------");
        System.out.println("PREGUNTA 10:");
    System.out.println(" Se confunde y te dice que ha estado en sitios donde no ha ido contigo.");
    String ans10;
    ans10 = System.console().readLine();
    switch (ans10){
    case "verdadero":
    case "Verdadero":
    case "VERDADERO":
      points= points + 3;
      System.out.println("Puntuación: "+points);
      break;
    case "falso": 
    case "Falso": 
    case "FALSO":
      System.out.println("Puntuación: "+points);
    break;
      default:
        System.out.println("'"+ans10+"'"+" no es un valor válido. Puntuación: "+ points);
      }
        System.out.println("---------------------------------------------");
        
      System.out.println("CONCLUSIONES FINALES: ");
      System.out.println("----------------------");
      System.out.printf("Tu puntuación ha sido de: "+points+", lo que significa que: \n");
      if (points <=10){
        System.out.println("Enhorabuena! tu pareja parece ser totalmente fiel.");
        }
      else if ((points>10)&&(points<=22)){
        System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente,\n aunque seguramente será algo sin importancia. Nobajes la guardia.");
        }
      else {
        System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona.\n Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
        }
        
        
      
      
    
  }
}

