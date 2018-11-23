//Multiples of 3 and 5:
    int sum = 0;
     for (int i = 0; i <1000; i++){
        if(i%3==0 || i%5==0)
           sum+=i;
     }
     System.out.println(sum);
//Fibonacci Evens:
    ArrayList<Integer> fib = new ArrayList<Integer>();
    fib.add(1);
    fib.add(2);
    for (int i = 2; i < 400; i++){
    
      if ((fib.get(i-2)+fib.get(i-1))<4000000)
       fib.add(fib.get(i-2)+fib.get(i-1));
      else
        break;
    }
    int sum =0;
    
    for (int i =0; i<fib.size();i++){
       if (fib.get(i)%2 ==0)
          sum += fib.get(i);
    }
    System.out.println(sum);
//Largest Prime Factor:
   ArrayList<Integer> factors = new ArrayList<Integer>();
    int n = 600851475143;
    int d = 2;
    while (n>1){
       while(n%d == 0){
          factors.add(d);
          n /= d;
       }
       d++;
       if(d*d > n){
          if (n>1)
             factors.add(n);
             break;
       }   
    }
    System.out.print(factors.get(factors.size()-1));

//Largest Palindrome Product:
 import java.util.*;
 public class ProjectEuler{
    public static void main(String[]args){
    ArrayList<Integer> products = new ArrayList<Integer>();
    ArrayList<String> numbers = new ArrayList<String>();
    ArrayList<String> reverses = new ArrayList<String>();
    for (int i = 100; i <1000; i++){
       for (int j = 100; j<1000; j++){
          products.add(i*j);
       }
    }
    Collections.sort(products);
    for (int k = 0; k < products.size(); k++){
       String number = Integer.toString(products.get(k));
       String reverse = new  StringBuffer(number).reverse().toString();
       reverses.add(reverse);
       numbers.add(number);
   }
  for(int i=0; i<reverses.size(); i++){
    if (reverses.get(i).equals(numbers.get(i))) 
      System.out.println(reverses.get(i));
   }   
 }
 }
//Special Pythagorean Triplet:
 import java.util.*;
 public class ProjectEuler{
    public static void main(String[]args){
    for (int n = 0; n < 22; n++){
       for(int m = 0; m < 500; m++){
          if ((n*n) + (n*m) < 501){
          System.out.println((n*n) + (n*m) + " " + "n: " + n + "m: " + m);
          }
       }
    }
 }
}

//Largest Product in a Series:
import java.util.*;
public class ProjectEuler{
   public static void main(String[]args){

   String stuffs = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";
   ArrayList<Integer> sums = new ArrayList<Integer>();
   for (int i = 0; i<=stuffs.length(); i++){
      String number = stuffs.substring(i, i+13);      
      int sum = 1; 
      for (int j = 0; j<number.length(); j++){
         int no = Integer.parseInt(number.substring(j, j+1));
         sum*= no;         
      }
      sums.add(sum);
      }
      Collections.sort(sums);
      System.out.println(sums.get(sums.size()-1));
   
   }
}
//Summation of Primes:
import java.util.*;

public class ProjectEuler{
   public static void main(String[]args){
      long sum = 0; 
      long num = 0; 
      for (long i=1; i<2000000;i++){
         num = i; 
         boolean prime = true;
         for (long j = 2; j < i;j++){
            if (i%j == 0){
               prime = false;
               break; 
            }
          }
           if (prime == true)
            sum+=  num; 
          
          }
        System.out.println(sum); 
      } 
      
   }  
   

//10001st prime:
import java.util.*;

public class ProjectEuler{
   public static void main(String[]args){
      long num = 0; 
      long count= 0; 
      while(count<10002){
      for (long i=1; i<2000000;i++){
         num = i; 
         boolean prime = true;
         for (long j = 2; j < i;j++){
            if (i%j == 0){
               prime = false;
               break; 
            }
          }
           if (prime == true){
            System.out.println(num);
            count++;
            }       
          }
      }
      }   
   }  
   

//Smallest Multiple: 
import java.util.*;

public class ProjectEuler{
   public static void main(String[]args){
   long no = 2520;
    boolean there = false;
    while (!there) {
        no += 2520;
        boolean divide = true;
        for (int i = 11; i <= 20; i++) {
            if (no % i != 0) {
                divide = false;
                break;
            }
        }
        if (divide) {
            there = true;
        }
    }
    System.out.println( no);
 
}     
}  
   
//Sum Square Difference:
import java.util.*;

public class ProjectEuler{
   public static void main(String[]args){
        int sum1 = 0;
        int sum2 = 0;
        int sum = 0;
        int n = 100;

        
        sum1 = n*(n+1)/2;
        sum1 *= sum1;

        
        sum2 = (n * (n+1) * (2*n+1))/6;

        System.out.println(sum1 - sum2);

}     
}  
 