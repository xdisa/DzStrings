import java.util.Arrays;
import java.util.Scanner;
public class ZeroOne {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("vvedite dannie");

        int N = s1.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i += 2) {
            a[i] = 1;
        }
        int result = 0;

        for (int i =a.length -1 , nn = 0; i >= 0; --i, nn++) {
            int pos = (int)Math.pow(10, i);
            result += a[nn] * pos;
        }
        System.out.println(result);





    }

}
