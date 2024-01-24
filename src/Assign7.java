import java.util.Scanner;

public class Assign7 {
    public static void main(String args[])
    {
        System.out.println("enter the inches:");
        Scanner sc=new Scanner(System.in);
        float inches= sc.nextFloat();
        System.out.println("inches to meters "+(inches*0.0254));
       // Scanner a =new Scanner(System.in);
        System.out.println("enter the number:");
        int a=sc.nextInt();
        System.out.println("the square is "+Math.pow(a,2));
        System.out.println("the square is "+Math.pow(a,3));
        System.out.println("the square is "+Math.pow(a,4));

        System.out.println("enter 1st integer");
        int b=sc.nextInt();
        System.out.println("enter 2nd integer");
        int c=sc.nextInt();
        System.out.println("enter 3rd integer");
        int d=sc.nextInt();
        System.out.println("enter 4th integer");
        int e=sc.nextInt();
        String result=((b==c)&&(e==d))?"equal":"not equal";
        System.out.println("the numbers are "+result);

        System.out.println("Enter the number");
        int f = sc.nextInt();
        String x=(f%2==0)?"even":"odd";
        System.out.println("The given number is "+x);
        }
    }