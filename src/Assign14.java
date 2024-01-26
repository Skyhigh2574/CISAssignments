import java.util.Scanner;
public class Assign14 {


        public static void main(String[] args){
            int sum=0;
            Scanner sc=new Scanner(System.in);
            System.out.println("enter a number");
            int n= sc.nextInt();
            for(int i=1;i<=n;i++){
                if(i%2==0){
                    sum=sum+i;

                }
                else {
                    continue;
                }

            }
            System.out.println(sum);
        }


}
