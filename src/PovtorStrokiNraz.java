import java.util.Scanner;
public class PovtorStrokiNraz {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите данные");
        String st = s.nextLine();
        Scanner s1 = new Scanner(System.in);
        System.out.println("введите число");
        int n = s1.nextInt();
        String r = st.repeat(n);

        if(Character.isLetter(r.charAt(0))) {
        System.out.println("vvedeno chislo");}
        else {
            System.out.println(r);
        }


    }
}
