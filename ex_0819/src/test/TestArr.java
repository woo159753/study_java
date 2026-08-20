package test;

public class TestArr {
    public static void main(String[] args) {
        int a = 100;
        int[] b = new int[2];
        b[0] = 200;
        b[1] = 300;
        System.out.println(a);
        System.out.println(b);
        System.out.println(b[1]);
        TestSub ts = new TestSub();
        System.out.println(ts.tt(a,b));
        System.out.println(a);
        System.out.println(b[1]);

    }
}
