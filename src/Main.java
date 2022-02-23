public class Main {

    public static void main(String[] args) {

        System.out.println("App calculator");
        System.out.println("Version 1.0");
        int a = 6;
        int b = 2;
        int d = division(a, b);
        System.out.println(d);
    }

    private static int division(int a, int b) {
        return a / b;
    }
}
