
abstract class Object{
abstract void showShape();
public void shape(){
System.out.println("I'm form abstract class");
}
}
class Sphere extends Object{
    void showShape(){
        System.out.println("I'm Sphere");
    }
}
class cuboid extends Object{
    void showShape(){
        System.out.println("I'm Cuboid");
    }
}
class prism extends Object{
    void showShape(){
        System.out.println("I'm Prism");
    }
}
public class Objects {
    public static void main(String args[]){
        Object obj  = new Sphere();
        obj.showShape();
        obj = new cuboid();
        obj.showShape();
        obj = new prism();
        obj.showShape();
    }
}