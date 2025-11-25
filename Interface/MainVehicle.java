interface Vehicle {
    void changeGear(int gear);

    void speedByGear();

    void applyBrakes(int value);
}

class Bike implements Vehicle {
    int gear;
    int speed;

    @Override
    public void changeGear(int gear) {
        this.gear = gear;
    }

    @Override
    public void speedByGear() {
        if (gear == 0)
            speed = 0;
        else if (gear == 1)
            speed = 20;
        else if (gear == 2)
            speed = 40;
        else if (gear == 3)
            speed = 60;
        else
            speed = 80; 
    }

    @Override
    public void applyBrakes(int value) {
        speed = speed - value; 
        if (speed < 0)
            speed = 0;
    }

    public void printState() {
        System.out.println("Bike → Gear: " + gear + " Speed: " + speed + " km/h");
    }
}

class Car implements Vehicle {
    int gear;
    int speed;

    @Override
    public void changeGear(int gear) {
        this.gear = gear;
    }

    @Override
    public void speedByGear() {
        switch (gear) {
            case 0:
                speed = 0;
                break;
            case 1:
                speed = 30;
                break;
            case 2:
                speed = 50;
                break;
            case 3:
                speed = 70;
                break;
            case 4:
                speed = 90;
                break;
            default:
                speed = 120;
        }
    }

    @Override
    public void applyBrakes(int value) {
        speed -= value;
        if (speed < 0)
            speed = 0;
    }

    public void printState() {
        System.out.println("Car → Gear: " + gear + " Speed: " + speed + " km/h");
    }
}

public class MainVehicle {
    public static void main(String[] args) {

        Bike b = new Bike();
        b.changeGear(2);
        b.speedByGear();
        b.applyBrakes(10);
        System.out.println("Bike Current State:");
        b.printState();

        Car c = new Car();
        c.changeGear(3);
        c.speedByGear();
        c.applyBrakes(20);
        System.out.println("Car Current State:");
        c.printState();
    }
}
