
import functions.Functions_1to14_8;

public class Ex17_8 {
  public static int binarioDecimal (int n){
    int numDig = Functions_1to14_8.digitos(n); // numero de dígitos
    int cifra = n;
int cogNum = 0;
int contDigit = 0;
    
for ( int h = 1; h <= n; h *= 10 ) {
	contDigit++;
}
    
for ( int i = 1; i <= contDigit; i++ ) {
  int potencia10 = (int)(Math.pow(10,(contDigit-i)));
  cogNum = cifra / potencia10;
  System.out.print(cogNum+"\n");
 
  }
  return 
}
