import java.util.*;
public class Program_13 {
    Scanner sc=new Scanner(System.in);
    public void main(){
        System.out.print("\n Enter number to check");
        int no=sc.nextInt();
        int copy=no;
        int copytwo=no;
        int count=0;
        int dig,no2=0; 
        while(no>0){
            no=no/10;
            count+=1;
        }
        System.out.print("\n" + count);
        for(int i=count;i>0;i--){
            dig=copy%10;
            copy=copy/10;
            no2+=dig*Math.pow(10,count-1);
            count--;
            System.out.print("\n" + dig);
            System.out.print("\n" + copy);
            System.out.print("\n" + count);
            System.out.print("\n" + no2);
        }
        if(copytwo==no2){
            System.out.print("\n It is a palindrome number");
        }
        else{
            System.out.print("\n It is not a palindrome number");
        }
    }
}