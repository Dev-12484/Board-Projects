import java.util.*;
public class Program_9 {
    Scanner sc = new Scanner(System.in); 
    public void main(){  
        int n, remainder = 1, number, sum = 0;    
        System.out.print("Enter a number you want to check: ");  
        n = sc.nextInt();  
        number = n;  
        while(number > 9){       
            while(number > 0){  
                remainder = number % 10;   
                sum = sum + remainder;   
                number = number / 10;     
            }  
            number = sum;  
            sum = 0;  
        }  
        if(number == 1){  
            System.out.println("The given number is a magic number.");  
        }  
        else{  
            System.out.println("The given number is not a magic number.");  
        }  
    }  
} 