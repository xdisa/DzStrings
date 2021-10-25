import java.util.Scanner;
public class Delited1andFinalSymvol {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите данные");
        String st = s.nextLine();
        st=st.substring(1);
        int n = st.length();
        st = st = st.replace(st.substring(st.length()-1), "");
        System.out.println(st);
    }

}
