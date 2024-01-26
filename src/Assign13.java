import java.util.Scanner;


public class Assign13 {

        public static boolean isPrime(int n){
            if(n<=1){
                return false;
            }
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter a number");
            int n=sc.nextInt();
            if(isPrime(n)){
                System.out.println("It is prime number "+n);
            }
            else{
                System.out.println("It is not a prime number "+n);
            }

        }
    }

