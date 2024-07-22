import java.util.*;
public class Program_17 {
    Scanner sc=new Scanner(System.in);
    public void main(){
        String juices[]={"Mango","Orange","Apple","Strawberry","Kiwi","Banana","Lemon","Tomato","Cranberry","Grape","Mixed Fruit","Berry Delight","Orangey Barf","Mixed Cocktail","Date Milkshake"};
        int codes[]={590601,783170,570612,466618,396706,441264,356685,440468,839865,595102,304478,679802,629839,674861,749541};
        int original_prices[]={129,119,119,139,149,129,129,139,139,139,149,159,159,149,159};
        System.out.print("\n Which juice are you looking for ?");
        String choice=sc.nextLine();
        for(int i=0;i<14;i++){
            if(choice.equals(juices[i])){
                System.out.print("\n Juice Flavour : " + juices[i]);
                System.out.print("\n Code : " + codes[i]);
                System.out.print("\n Original Price : " + original_prices[i]);
                System.out.print("\n Reduced Price : " + (original_prices[i]-10));
                break;
            }
        }
    }
}