
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        for(int i=0; i<10; i++){
            arr[i] = i+100;
        }
        
        for (int i =0 ; i<arr.length; i++) {
            System.out.println(i);
        }
        
        
    }
}