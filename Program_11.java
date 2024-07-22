import java.util.*;
public class Program_11 {
    Scanner sc=new Scanner(System.in);
    public void main(){
        String names[]={"Raj","Mithali","Ashish","Virat","Rohit","Sanju","Deepika","Rohini","Akash","Sanjay"};
        int floor[]={2,5,4,8,3,7,6,5,1,4};
        int room[]={203,506,401,802,309,712,610,503,108,402};
        System.out.print("\n Which guest are you looking for");
        String guest=sc.next();
        boolean found=false;
        for(int i=0;i<10;i++){
            if(guest.equals(names[i])==true){
                System.out.print(guest + " " + names[i]);
                System.out.print("\n Its room number " + room[i] + "on the floor " + floor[i]);
                found=true;
                break;
            }
        }
        if(found==false){
            System.out.print("\n Sorry there is no such guest");
        }
    }
}