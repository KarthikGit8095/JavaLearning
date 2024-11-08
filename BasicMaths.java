public class Main {
    // count digits
     static int countdigits(int x){
         int count=0;
         while(x>0){
             x=x/10;
             count++;
         }
         return count;

    }

    //palindrome
    static boolean palindrome(int x){
         int rem;
         int temp=x;
         int sum=0;
         while(x>0){
             rem=x%10;
             sum=(sum*10)+rem;
             x=x/10;
         }
         if (temp==sum){
             return true ;
         }
         else{
             return false;
         }
    }


    //factorial
    static int factorial(int n){
         int fact=1;
         for(int i=2;i<=n;i++){
             fact=fact*i;

         }
         return fact ;
    }

    //gcd
    static int gcd(int a, int b){
         if(b==0){
             return a;
         }
         else{
             return gcd(b,a%b);
         }

    }

    static int lcm(int a, int b){
         return (a*b)/gcd(a,b);

    }

    static boolean prime(int n){

         if (n==1){
             return false;
         }

             for (int i=2;i*i<=n;i++){
                 if(n%i==0){
                     return false;
                 }
             }

         return true ;
    }


    public static void main(String[] args) {
         // count digits result
         int countResult= countdigits(78656);
        System.out.println(countResult);

        //palindrome
        System.out.println(palindrome(121));

        //factorial
        System.out.println(factorial(5));

        //gcd
        System.out.println(gcd(10,15));

        //lcm
        System.out.println(lcm(4,6));

        System.out.println(prime(7));





    }
}