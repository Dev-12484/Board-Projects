import java.util.*;
public class Program_2 {
    Scanner sc=new Scanner(System.in);
    public void main(){
        System.out.print("\n Enter initial price of book");
        double price=sc.nextDouble();
        System.out.print("\n Enter discount percentage");
        double discount=sc.nextDouble();
        double discounted_price=((100-(discount))/100)*price;
        System.out.print("\n The discounted price of the book will be " + discounted_price);
        
    }
}