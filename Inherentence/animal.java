class family_of_dogs {
    void show() {
        System.out.println("I am an animal");
    }
}

class Dog extends animal {
    void show() {
        System.out.println("I am a dog");
    }
}

class Puppy extends Dog {
    void show() {
        System.out.println("I am a small dog");
    }
}

public class animal {
    public static void main(String[] args) {
        Puppy obj = new Puppy();
        obj.show();
    }

}
