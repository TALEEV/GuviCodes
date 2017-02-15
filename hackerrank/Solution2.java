package hackerrank;
import java.util.ArrayList;
public class Solution2 {
    public static void main(String[] args){
        ArrayList<Integer> ar=new ArrayList<>();
        ar.add(1);
        ar.add(2);
        ar.add(3);
        ar.add(4);
        ar.add(5);
        ar.add(6);
        try{
        System.out.print(ar.get(10));
        }catch(IndexOutOfBoundsException e){System.out.println("Hii");}
        }
}
