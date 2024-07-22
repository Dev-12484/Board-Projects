import java.util.*;
public class Program_16 {
    Scanner sc=new Scanner(System.in);
    public void main(){
        int arr[]={9,12,24,27,34,48,54,64,74,76,83,85,90,93,95,};
        System.out.print("\n Enter number to search for");
        int no=sc.nextInt();
        int first=0;
        int last=14;
        int mid=(first+last)/2;
        boolean found=false;
        /*int mid=(first+last)/2;
        if(arr[mid]>no){
            first=mid+1;
        }
        else if(arr[mid]<no){
            last=mid-1;
        }
        else if(arr[mid]==no){
            System.out.print("\n Sorry number not found");
        }*/
        while(first!=mid){
            mid=(first+last)/2;
            if(arr[mid]==no){
                found=true;
                break;
            }
            else if(arr[mid]>no){
                last=mid-1;
            }
            else if(arr[mid]<no){
                first=mid+1;
            }
        }
        if(found==true){
            System.out.print("\n Your search was found");
        }
        else{
            System.out.print("\n Sorry, your search wasn't found");
        }
    }
}