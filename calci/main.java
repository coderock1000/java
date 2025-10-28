class main {
    public static void main(String[] args) {
       int a = 10;
       int b = 20;
       int sum = a + b;
       int difference = b - a;
       int product = a * b;
       int division = b / a;
       String magic = "abracadabra";
       System.out.println("======================Magic======================");
       System.out.println("=======================Method1 " );
        System.out.println("Sum: " + sum);
       System.out.println("Difference: " + difference);
       System.out.println("Product: " + product);
       System.out.println("Division: " + division);
       System.out.println("=======================Method2================");
       System.out.println("Sum " + (a + b));
       System.out.println("Difference " + (b - a));
       System.out.println("Product " + (a * b));
       System.out.println("Division " + (b / a));
       System.out.println(magic);
       System.out.println("sum: "+(a+b)+" difference: "+(a-b)+" product: "+(a*b)+" division: "+(a/b));
    }
}