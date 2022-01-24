public class Overload {
  public static void main(String[] args) {
    greet();
    greet("Juan");
    greet(7);
  }

  // Functions
  public static void greet() {
    System.out.println("Hello");
  }

  public static void greet(String name) {
    System.out.println("Hello " + name);
  }

  public static void greet(int times) {
    for (int i = 0; i < times; i++) {
      System.out.println("Hello(" + i + ") ");
    }
  }
}
