public class RandomFigure {
  public static void main(String[] args) {
    int figNum;
    for (int i = 0; i <= 20; i++) {
      figNum = (int) (Math.random() * 4 + 1);
      switch (figNum) {
      case 1:
        System.out.print("_");
        break;
      case 2:
        System.out.print("💩");
        break;
      case 3:
        System.out.print("🤬");
        break;
      case 4:
        System.out.print("🤟");
        break;
      default:
        System.out.print("Introduce un valor válido.");
      }
    }
  }
}
