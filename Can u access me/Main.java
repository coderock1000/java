class Parent{
    public void sayHello(){
        System.out.println("Hello from Parent class");
    }

    }

    class child extends Parent {
        @Override
        public void sayHello() {
            System.out.println("Hello from Child class");
        }
    }
class Main{
    public static void main(String[] args) {
        Parent p = new child();
        p.sayHello();  
 
}
}

