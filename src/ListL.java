public class ListL {
    private Node first;
    private Node anterior;
    private int qtt;
    ListL(){
        this.qtt=0;
        this.first=null;
    }
    public Node getFirst(){
        return this.first;
    }
    public void createList(double x){
        Node no = new Node(x);
        this.anterior=getFirst();
        if(this.first==null){
            addFirst(x);
        }else{
            while(this.anterior.getProx()!=null){this.anterior=this.anterior.getProx();}
            this.qtt++;
            this.anterior.setProx(no);
            this.anterior=no;
        }
        resetNode();
    }
    public void addFirst(double x){
        Node no = new Node(x);
        this.qtt++;
        this.first=no;
        this.anterior=no;
    }
    public void addPos(double x,int pos){
        Node no = new Node(x);
        this.qtt++;
        Node aux = getFirst();
        int i=0;
        if(pos==0){addFirst(x);}
        else{
            while(i!=pos-1){
                aux=aux.getProx();
                i++;
            } 
            no.setProx(aux.getProx());
            aux.setProx(no);
            this.anterior=no;
        }
    }
    public void removePos(int x) {
        int i = 0;
        Node n = getFirst();
        if (x == 0) {
            this.first = this.first.getProx();
        } else {
            while (i != x - 1) {
                n = n.getProx();
                i++;
            }
            if (n.getProx().getProx() == null) {
                System.out.println("AAAAAAAA");
                n.setProx(null);
            } else {
                n.setProx(n.getProx().getProx());
            }
        }
    }
    public void resetNode(){
        Node n;
        n=getFirst();
        while(n.getProx()!=null){ 
            n=n.getProx();
        }
        this.anterior=n;
    }
    public void removeLast(){
        if(this.anterior.equals(this.first)==true){
            this.first=this.first.getProx();
        }else if(this.anterior!=null){
            Node n =getFirst();
            while(true){
                if(this.anterior.equals(n.getProx())==true){break;}
                n=n.getProx();
            }
            n.setProx(n.getProx().getProx());
        }
        resetNode();
        //resetId();
    }
    public void printList(){
        Node n = getFirst();
        int i=0;
        while(true){
            System.out.println("POS = "+i+" EL = "+n.getElement());
            if(n.getProx()==null){break;}
            n=n.getProx();
            i++;
        }
    }
}