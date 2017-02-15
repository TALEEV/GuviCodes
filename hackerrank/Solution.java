
package hackerrank;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
public class Solution{
public static void main(String[] args){
Scanner in=new Scanner(System.in);
int n=in.nextInt();
//now get the array of the prices
int arr[]=new int[n];
for(int i=0;i<n;i++){
    arr[i]=in.nextInt();
}
//now need to set up the code 
HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
ArrayList<Integer> ar=new ArrayList<Integer>();
int price=0;
//there should be something that j should not exceeed 
for(int i=0;i<n;i++){
    try{
   if(arr[i]>=arr[i+1]){
       price+=arr[i]-arr[i+1];
   }else{
       price+=arr[i];
   }
    }catch(ArrayIndexOutOfBoundsException e){}
}
price=price+arr[n-1];
System.out.print("The price would be "+price);
}

}