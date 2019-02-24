import java.io.*;
import java.util.*;

public class Main {

    //File io
    public static void main(String[] args) {
        
        File file = new File("input.txt");
        try {
            Scanner sc  = new Scanner(file);
            while( sc.hasNext() ){
                System.out.println( sc.nextInt() );
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
            
        

    }
}