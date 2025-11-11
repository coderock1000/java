class Sup {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.printNumber();
    }
}
class superclass {
    int number = 56;
}
class SubClass extends superclass {
    int number = 96;
    void printNumber(){
        System.out.println("Number from SubClass: " + number);
    }
}
