class superclass{
    int x=10; static int x1;
    public void display(){
        System.out.println("hello ! this is superclass \n");
    }
}
class subclass extends superclass{
    int y=20;
    public void show(){
        System.out.println("hello ! this is subclass \n");
    }
}
public class inheritance {
    public static void main(String[] args) {
        subclass obj = new subclass();
        obj.display();
        obj.show();
        superclass obj1 = new subclass();
        System.out.println(obj1.x);
    }
    
}
