abstract class Ex{
   int x=10;
   int y=20;
   void display(){
    System.out.println(x);
    System.out.println(y);
   }
}
public class Example extends Ex{
    public static void main (String args[]){
        Ex k=new Ex();
        k.display();

    }
}