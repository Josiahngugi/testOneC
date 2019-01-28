import java.util.Scanner;

public class Memorize {

 public void memorize() {
  Scanner input =new Scanner(System.in);
  System.out.println("enter number");
  int k= input.nextInt();

     this.isPrime(k);
     if(isPrime(k))
         System.out.println(" true") ;

     else
         System.out.println(" false");
 }

  public boolean isPrime(int n)
  {
   // Corner case
   if (n <= 1)
    return false;

   // Check from 2 to n-1
   for (int i = 2; i < n; i++)
    if (n % i == 0)
     return false;

   return true;
  }

    public static void main(String[] args) {
        Memorize t = new Memorize();
        t.memorize();
    }
}
