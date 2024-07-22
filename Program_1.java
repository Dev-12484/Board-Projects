import java.util.*;
public class Program_1{ 
    int choice; 
    Scanner sc=new Scanner(System.in); 
    void area() 
    { 
        System.out.println("Enter choice :- "); 
        System.out.println("1. Find area of circle "); 
        System.out.println("2. Find area of square "); 
        System.out.println("3. Find area of rectangle "); 
        System.out.println("4. Find area of parallelogram "); 
        System.out.println("5. Find area of triangle "); 
        choice=sc.nextInt(); 
        switch (choice) 
        { 
            case 1:  
            System.out.println("Enter radius of the circle"); 
            double radius=sc.nextDouble(); 
            double area_1; 
            area_1=(22/7)*radius*radius; 
            System.out.println("The area is "+area_1); 
            break; 
            case 2: 
            System.out.println("Enter side"); 
            int side=sc.nextInt(); 
            int area_2; 
            area_2=side*side; 
            System.out.println("The area is "+area_2); 
            break; 
            case 3: 
            System.out.println("Enter length and breadth"); 
            int l=sc.nextInt(); 
            int b=sc.nextInt(); 
            int area_3=l*b; 
            System.out.println("The area is "+area_3); 
            break; 
            case 4: 
            System.out.println("Enter base & height "); 
            int base_parallel=sc.nextInt(); 
            int h_parallel=sc.nextInt(); 
            int area_4=base_parallel*h_parallel; 
            System.out.println("The area is "+area_4); 
            break; 
            case 5: 
            System.out.println("Enter base and height "); 
            double height_triangle=sc.nextDouble(); 
            double base_triangle=sc.nextDouble(); 
            double area_5=(1.0/2.0)*base_triangle*height_triangle; 
            System.out.println("The area is "+area_5); 
            break; 
        } 

    } 
    public static void main(String args[]) 
    { 
        Program_1 obj=new Program_1(); 
        obj.area(); 
    } 
} 

