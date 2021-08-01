import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ListL l = new ListL();
        double n=0;
        while(n!=-1){
            System.out.println("0. Exit.");
            System.out.println("1. Add element to the list.");
            System.out.println("2. Add element at position.");
            System.out.println("3. Remove last element added.");
            System.out.println("4. Remove element at position.");
            System.out.println("5. Print list.");
            n=input.nextDouble();
            if(n==0){
                break;
            }
            else if(n==1){
                System.out.println("Element: ");
                n=input.nextDouble();
                l.createList(n);
            }
            else if(n==2){
                int pos;
                System.out.println("Position: ");
                pos=input.nextInt();
                System.out.println("Element: ");
                n=input.nextDouble();
                l.addPos(n,pos);
            }
            else if(n==3){
                l.removeLast();
            }
            else if(n==4){
                int pos;
                System.out.println("Position: ");
                pos=input.nextInt();
                l.removePos(pos);
            }
            else{
                l.printList();
            }
        }
        input.close();
    }
}