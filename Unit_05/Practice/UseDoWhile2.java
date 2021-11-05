public class UseDoWhile2 {
    public static void main(String[] args) {
        int n;
        do{
            System.out.print("Dime un número: ");
            n = Integer.parseInt(System.console().readLine());
            if (n % 2 == 0){
            System.out.println("Numero par introducido. Numero en cuestión: "+n);
            }
            else {
                System.out.println("Numero impar introducido, finalizando bucle.");
            }
        }while(n % 2 == 0);
        
    }
}
