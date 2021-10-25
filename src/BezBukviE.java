import java.util.Scanner;
public class BezBukviE {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите данные");
        String st = s.nextLine();
        System.out.println("Вы ввели "+st);

        int indexE = st.indexOf("e");
        if(indexE==-1){
            System.out.println("e ne naydeno");
        }else if(st==null) {
            System.out.println((String) null);
        } else if(st == ""){
            System.out.println((String)"");
        } else
            {
                System.out.println(st.length() - st.replaceAll("e", "").length());
            }

    }

}
