import java.util.Scanner;
public class Dz1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите данные");
        String st = s.nextLine();
        System.out.println("Вы ввели "+st);

        st = st.replaceAll("\\s+","");
        System.out.println("probeli ydaleni");
        System.out.println(st);
    }

}







