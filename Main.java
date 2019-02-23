import java.math.BigInteger;
public class Main {

    public static void main(String[] args) {
        
        BigInteger a = new BigInteger("13782179392173273791223892183021");
        BigInteger b = new BigInteger( "1238754875847539483948394839" );
        BigInteger c = a.add(b);
        BigInteger d = c.multiply(a);
        System.out.println(d);
    }
}