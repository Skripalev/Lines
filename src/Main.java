public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");

        String firstName = "Семён ";
        String middleName = "Семёнович";
        String lastName = "Иванов ";
        String fullName = lastName + firstName + middleName;
        System.out.println("Ф.И.О. сотрудника — " + fullName + ".");

        System.out.println("Task 2");

        String fullNameCorrected = fullName.toUpperCase();
        System.out.println("Ф.И.О. сотрудника — " + fullNameCorrected + ".");

        System.out.println("Task 3");

        String replacingLetter = fullName.replace("ё", "e");
        System.out.println("Ф.И.О. сотрудника — " + replacingLetter + ".");
    }
}