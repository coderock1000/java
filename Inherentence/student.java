class Parent {
    int age, id;
    String name;

    void naming(String name) {
        System.out.println("Name:" + name);
    }
}

class Child extends Parent {
    void ageN(int age) {
        System.out.println("Age of student is:" + age);
    }
}
class student{
    public static void main(String args[]) {
        Child c = new Child();
        c.naming("John Doe");
        c.ageN(20);
}
}
