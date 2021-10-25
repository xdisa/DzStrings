public class initsiali {
    public static void main(String[] args) {

        System.out.println(getInitials("Zukov Oleg Olegovich"));
    }

    public static String getInitials(String str) {
        String[] tempArray = str.split(" ");
        String rezult = tempArray[0] + " ";
        for (int i = 1; i < tempArray.length; i++) {
            rezult += tempArray[i].substring(0, 1).toUpperCase() + ". ";
        }
        return rezult.trim();
    }

}
