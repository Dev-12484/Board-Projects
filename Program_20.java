import java.util.*;
public class Program_20 {
    Scanner sc=new Scanner(System.in);
    public void main(){
        System.out.print("\n Enter 20 names to sort in descending order");
        String names[]=new String[5];
        for(int i=0;i<5;i++){
            names[i]=sc.nextLine();
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<4;j++){
                int bigger=names[j].compareTo(names[j+1]);
                if(bigger==1){
                    String temp=names[j];
                    names[j]=names[j+1];
                    names[j+1]=temp;
                }
            }
        }
        for(int i=0;i<5;i++){
            System.out.print("\n " + names[i]);
        }
    }
}
