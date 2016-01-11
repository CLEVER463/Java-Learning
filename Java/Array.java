import java.util.Arrays;
public class Array {
    public static void main(String[] args) {
     int[] a = new int[]{1,2,3,4,5,6,7,8,9,10};
     int[] b = Arrays.copyOf(a, 2*a.length);
     for(int i=0;i<b.length;i++){
         System.out.println(" "+b[i]);
     }
    }
    
}