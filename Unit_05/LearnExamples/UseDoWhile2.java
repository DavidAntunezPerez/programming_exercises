package LearnExamples;

public class UseDoWhile2 {
    public static void main(String[] args) {
        int n;
        String ans;
        do{
            System.out.print("Dime un número: ");
            n = Integer.parseInt(System.console().readLine());
            if (n % 2 == 0){
            System.out.println("Numero par introducido. Numero en cuestión: "+n);
            }
            else {
                System.out.println("Numero impar introducido, finalizando bucle.");
                    System.out.print("¿Quiere continuar? (s / n): "); // Para requerir si quiere continuar
                    ans = System.console().readLine();
                    if ("s".equals(ans)){
                        do{
                            System.out.print("Dime un número: ");
                            n = Integer.parseInt(System.console().readLine());
                            if (n % 2 == 0){
                            System.out.println("Numero par introducido. Numero en cuestión: "+n);
                            }
                            else {
                            System.out.println("Numero impar introducido, finalizando bucle. No hay más intentos.");
                            }
                        }while(n % 2 == 0);  
                    }
                
            }
        }while(n % 2 == 0);
        // Esto ocurre debido a que primero te ejecuta el trozo de código dentro del do, y luego te pide el requisito para que se cumpla, por lo tanto, hemos podido poner el mensaje de impares dentro del do debido a que cuando se ejecute la última vez mostrará antes de finalizar el mensaje de número impar, ya que el bucle se seguía cumpliendo, y después parará debido a que los valores del bucle no son los requeridos.

        
    }
}
