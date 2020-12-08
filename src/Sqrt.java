
import java.util.Scanner;


public class Sqrt {
    public static double x;
    private double b1;
    private double b2;

    public Sqrt(double x) {
        System.out.println("Введите число,для вычисления его корня(до миллиона)");
        Scanner in = new Scanner(System.in);
        x=in.nextDouble();
        this.x = x;

    }

    public double getB2() {
        System.out.println(b2);
        return b2;
    }

    public double Ifg() {
        for (int y = 0; y <= 1000; y++) {
            b1 = y * y;

            if ((b1 <= x )&& ((b1 + 1) * (b1 + 1)) >= x) {
                b1 = (b1 + (x / b1)) / 2;
                b2 = (b1 + (x / b1)) / 2;
                int k = (int)b1;
                int k2=(int)b2;
                if (k == k2) {
                    System.out.println(k2);
                    return k2;
                } else {
                    int i = (int)b1;
                    int i2=(int)b2;
                    while ( i  != i2) {
                        b1 = (b2 + x / b2) / 2;
                        b2 = (b1 + x / b1) / 2;
                    }
                    System.out.println(i2);
                    return i2;

                }
            } else {
                continue;
            }

        }

        return 0;
    }


    public static void main(String... args) {
        Sqrt sqrt = new Sqrt(x);
        sqrt.Ifg();
    }
}


