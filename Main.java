public class Main {
    public static void main(String[] args) {
        
        try {
            //something

            //force error
            throw new Exception();
        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
