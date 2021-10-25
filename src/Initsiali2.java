public class Initsiali2 {
    private void printInitials(String name) {
        String[] nameParts = name.split(" ");
        String firstName = nameParts[0];
        char firstNameChar = firstName.charAt(0);
        if (nameParts.length > 1) {
            System.out.println("First character of first name: " + firstNameChar);
            String lastName = nameParts[nameParts.length - 1];
            char lastNameChar = lastName.charAt(0);
            System.out.println("First character of last name: " + lastNameChar);
        }
        else {
            System.out.println("First character name: " + firstNameChar);
        }
    }

    public static void main(String[] args) {

    }
}
