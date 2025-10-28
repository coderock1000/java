public class mind_riddler {
    static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("======================Guess the Answer======================");
        System.out.println("Uninary Operator"+(a++));
        System.out.println("Uninary Operator" + (++b));
        System.out.println("Binary Operator");
        System.out.println("1+2="+(1+2));
        System.out.println("1+2=" + 1 + 2);
        System.out.println(1+2 + " =3");
        int increment = ++a * b++;
        System.out.println(increment);
        System.out.println("Ternary Operator");
        int max = (a > b) ? a : b;
        System.out.println("Max value is: " + max);
    }
}
