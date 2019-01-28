import java.util.Scanner;

public class Memorize {

// memorize function
 public void memorize() {
  Scanner input =new Scanner(System.in);
  System.out.println("enter number");
  int k= input.nextInt();

//  Passing isPrime as input function to this function
     this.isPrime(k);

     if(isPrime(k))
         System.out.println(" true") ;

     else
         System.out.println(" false");
 }

//    memorized isPrime function
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
