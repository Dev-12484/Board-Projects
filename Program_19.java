import java.util.*;
public class Program_19 {
    Scanner sc=new Scanner(System.in);
    public void main(){
        System.out.print("\n Enter your word in uppercase");
        String word=sc.nextLine();
        word=word.toUpperCase();
        char letters[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        int frequencies[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,};
        for(int i=0;i<word.length();i++){
            for(int j=0;j<26;j++){
                if(word.charAt(i)==letters[j]){
                    frequencies[j]+=1;
                }
            }
        }
        for(int i=0;i<26;i++){
            if(frequencies[i]>0){
                System.out.print("\n The letter " + letters[i] + " is repeated " + frequencies[i] + " times");
            }
        }
    }
}
