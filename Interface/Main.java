interface myinterface {

    public void method1();
    public void method2();
}

class Main implements myinterface {
    public void method1() {
        System.out.println("Method 1 implementation");
    }
    public void method2() {
        System.out.println("Method 2 implementation");
    }
    public static void main(String args[]) {
    myinterface obj = new Main();
    obj.method1();
    obj.method2();
}
}
