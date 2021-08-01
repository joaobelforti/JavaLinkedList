public class Node {
    private double element;
    private int id;
    Node anterior;
    Node prox;
    Node(double element){
        this.element=element;
        this.prox=null;
    }
    public double getElement(){
        return this.element;
    }
    public void setProx(Node prox){
        this.prox = prox;
    }
    public Node getProx(){
        return this.prox;
    }
}
