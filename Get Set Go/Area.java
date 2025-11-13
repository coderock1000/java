class shape {
    public double getarea(){
        return 0;
    }    
}

class triangle extends shape {
    private double base;
    private double height;

    public triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getarea() {
        return 0.5 * base * height;
    }
}
class Square extends shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getarea() {
        return side * side;
    }
}

class Area {
    public static void main(String[] args){
      shape[] shapes = new shape[2];
        shapes[0] = new Square(5);
        shapes[1] = new triangle(3, 6);

        System.out.println("Area of Square: " + shapes[0].getarea());
        System.out.println("Area of Triangle: " + shapes[1].getarea());
}
}

