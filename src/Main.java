public class Main {
    public static void main(String[] args) {
        byte a = 2;
        short b = 150;
        int c = 40;
        long d = 230;
        b = a; // неявный кастинг

        short k = 256;
        byte m = 0;
//        m = k; // явный кастинг

        float e = 2.5f;
        double h = 3.14;

        char ch = 'D';
        boolean f = false;


        String w = "java";

        System.out.println(2 + 40);
        System.out.println(1050 - 230);
        System.out.println(e + d);
        System.out.println(a + e);
        System.out.println(b + a);


    }

}