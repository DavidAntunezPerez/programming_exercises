public class RandomMinigame {
  public static void main(String[] args) {
    int figNum = (int)(Math.random()*3);
    switch(figNum){
      case 0:
      System.out.print("Piedra");
      break;
      case 1:
      System.out.print("Papel");
      break;
      case 2:
      System.out.print("Tijeras");
      break;
      default:
      System.out.print("Introduce un valor válido.");
    }
  }
}
