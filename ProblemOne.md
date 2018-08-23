## Project Euler Problem One

#### If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000.
I created a for loop that would go through every number from 0 to 1000 and would test if the number is divisible by either 3 or 5. If it was, then I would add it to the sum. 

``` java
public class ProblemOne{
  public static void main(String[] args){
    int sum = 0;
     for (int i = 0; i <1000; i++){
        if(i%3==0 || i%5==0)
           sum+=i;
     }
     System.out.println(sum);
  }
}
```
