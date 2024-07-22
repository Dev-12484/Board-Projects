import java.util.*;
public class Program_7 {
    Scanner sc=new Scanner(System.in);
    public void main(){
        System.out.print("\n Enter number");
        int no=sc.nextInt();
        int divisor_sum=0;
        for(int i=1;i<no;i++){
            if((no%i)==0){
                divisor_sum+=i;
            }
        }
        if(divisor_sum==no){
            System.out.print("\n It is a perfect number");
        }
        else{
            System.out.print("\n It is not a perfect number");
        }
    }
}