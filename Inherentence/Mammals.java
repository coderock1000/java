class ammals {
    void mam() {
        System.out.println("Inside Mammals Class");
    }
}

class Lion extends ammals {
    void roar() {
        System.out.println("Inside Lion class ");
    }
}

class Human extends ammals {
    void hum() {
        System.out.println("Inside Human");
    }
}

public class Mammals {
public static void main(String[] args){
    Lion obj= new Lion();
    obj.roar();
    obj.mam();
}
}
