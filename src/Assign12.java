import java.util.Scanner;
public class Assign12 {

        public static void fact(int n){
            int f=1;
            for(int i=1;i<=n;i++){
                f= f*i;
            }
            System.out.println("the factorial of "+ n +" is: "+f);
        }
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter a number");
            int n=sc.nextInt();
            fact(n);


        }

}
