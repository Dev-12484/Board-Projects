import java.util.*;
public class Program_8 {
    Scanner sc=new Scanner(System.in);
    public void main(){
        System.out.print("\n Enter name then student");
        String arr_names[]=new String[5];
        int arr_percentages[]=new int[5];
        for(int i=0;i<5;i++){
            arr_names[i]=sc.next();
            arr_percentages[i]=sc.nextInt();
        }
        for(int i=0;i<4;i++){
            int high=arr_percentages[i];
            int high_pos=i;
            for(int j=i;j<5;j++){
                if(arr_percentages[j]>high){
                    high=arr_percentages[j];
                    high_pos=j;
                }
            }
            int temp_p=arr_percentages[i];
            arr_percentages[i]=arr_percentages[high_pos];
            arr_percentages[high_pos]=temp_p;
            String temp_n=arr_names[i];
            arr_names[i]=arr_names[high_pos];
            arr_names[high_pos]=temp_n;
        }
        for(int i=0;i<5;i++){
            System.out.print("\n" + arr_names[i] + " " + arr_percentages[i]);
        }
    }
}