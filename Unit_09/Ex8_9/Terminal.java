public class Terminal {
  private String id;
  private static int tiempo;

  public String toString() {
    return "Nº" + this.id + " - " + getTiempo() + "s de conversación";
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public static int getTiempo() {
    return tiempo;
  }

  public static void setTiempo(int tiempo) {
    Terminal.tiempo = tiempo;
  }

  public Terminal(String id) {
    this.id = id;
  }

  public void llama(Terminal t, int time) {
    System.out.println("Nº " + t.getId() + " - " + (getTiempo() + time) + "s de conversación.");
    Terminal.tiempo += time;
  }
}
