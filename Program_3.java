import java.util.*;
public class Program_3 {
    Scanner sc=new Scanner(System.in);
    public void main(){
        System.out.print("\n Enter Any Sentence");
        String sentence=sc.nextLine();
        sentence=' ' + sentence;
        sentence=sentence.toUpperCase();
        int count=0;
        for(int i=0;i<sentence.length();i++){
            if(sentence.charAt(i)==' '){
                if(sentence.charAt(i+1)=='A'){
                    count+=1;
                }
            }
        }
        System.out.print("\n Number of words are" + count );
    }
}