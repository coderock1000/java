class Parent{
    protected void protect(){
        System.out.println("This is a protected method in Parent class");
    }
}
class Child extends Parent {
    private void privateMethod(){
        System.out.println("This is a private method in Child class"); 
    }
}
class Super{
    public static void privateMethod(){
        Child c = new Child();
        c.privateMethod();

        System.out.println("hello world");
    }
}
    

