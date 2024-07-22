import java.util.*;
public class Program_10 {
    Scanner sc=new Scanner(System.in);
    public void main(){
        System.out.print("\n Enter array elements");
        int arr[][]=new int[4][4];
        int sum=0;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                arr[i][j]=sc.nextInt();
                sum+=arr[i][j];
            }
        }
        System.out.print("\n Your Array is");
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print("\t" + arr[i][j]);
            }
            System.out.print("\n ");
        }    
        System.out.print("\n Sum is" + sum);
    }
}