package hackerrank;
import java.util.*;
public class Solution3 {
    public static void main(String[] args){
       Scanner in=new Scanner(System.in);
        String s=in.next();
        char[] ch=s.toCharArray();
        String st="";
        for(int j=ch.length-1;j>=0;j--){
        st=st+""+ch[j]; 
        } 
        
  System.out.print(st);
    }
}
