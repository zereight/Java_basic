public class Main {

    //final means "const"
    final static double PI = 3.141592;
    
    public static void main(String[] args) {
        int int_num = 10;
        double double_num = 1.9;
        String String_text = "Hello!!";


        //printIn is one-line, print is consecutive line.
        System.out.println("type in: "+int_num);
        System.out.print(double_num * PI + " and ");
        System.out.println(String_text);

        //bin, oct, hex using format
        int a = 45;
        System.out.format("%b \n", a);
        System.out.format("%o \n", a);
        System.out.format("%x \n", a);

        //substring(x,y) : x<= index <y
        String name = "abcdefghi";
        System.out.println(name.substring(2, 5 ));
        System.out.println(name.substring(0, name.length() ));

    }
}