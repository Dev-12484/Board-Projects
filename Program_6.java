import java.util.*;
public class Program_6 {
    Scanner sc=new Scanner(System.in);
    public void main(){
        System.out.print("\n Enter the word");
        String word=sc.next();
        boolean consecutive=false;
        for(int i=0;i<(word.length()-1);i++){
            if(word.charAt(i)==word.charAt(i+1)){
                consecutive=true;
            }
        }
        if(consecutive==true){
            System.out.print("\n The word does have consecutive letters");
        }
        else{
            System.out.print("\n The word does not have consecutive letters");
        }
    }
}