import java.util.*;
public class Program_12 {
    Scanner sc=new Scanner(System.in);
    public void main(){
        System.out.print("\n Please enter your sentence");
        String sentence=sc.nextLine();
        System.out.print("\n Enter F to see the first letter of every word");
        System.out.print("\n Enter L to see the last letter of every word \n");
        String choice=sc.next();
        if(choice.equals("F")){
            sentence=" "+sentence;
            for(int i=0;i<sentence.length();i++){
                if(sentence.charAt(i)==' '){
                    System.out.print("\t" + sentence.charAt(i+1));
                }
            }
        }
        else if(choice.equals("L")){
            sentence=sentence+" ";
            for(int i=0;i<sentence.length();i++){
                if(sentence.charAt(i)==' '){
                    System.out.print("\t" + sentence.charAt(i-1));
                }
            }
        }
        else{
            System.out.print("\n INVALID CHOICE");
        }
    }
}

