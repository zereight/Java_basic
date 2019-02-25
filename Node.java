public class Node {
    private int x;
    private int y;

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int _x){
        this.x = _x;
    }

    public void setY(int _y){
        this.y = _y;
    }

    //Java doesnt support "default parameters"
    public Node(int _x , int _y){
        this.x = _x;
        this.y = _y;
    }

    public Node getCenterPoint(Node else_Node){
        return new Node( (else_Node.getX()+this.x)/2, (else_Node.getY()+this.y)/2 ) ;
    }
}