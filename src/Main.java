public class Main {
    public static void main(String[] args) {
        System.out.println("Задача #1");
        String firstName = "Иванов";
        String middleName = "Семён";
        String lastName = "Семёнович";
        String fullName = firstName + ' ' + middleName + ' ' + lastName;
        System.out.println(fullName);
        System.out.println();
        System.out.println("Задача #2");
        String fullNameUp = fullName.toUpperCase();
        System.out.println(fullNameUp);
        System.out.println();
        System.out.println("Задача #3");
        fullName = fullName.replace('ё', 'е');
        System.out.println(fullName);
    }
}