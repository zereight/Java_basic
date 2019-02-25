public class Main {
    public static void main(String[] args) {
        Node newNode1 = new Node(10,20);
        Node newNode2 = new Node(30,40);
        Node res = newNode1.getCenterPoint(newNode2);
        System.out.println( res.getX() + " " + res.getY() );

    }
}