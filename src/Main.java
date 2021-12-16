import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int age = scan.nextInt();
        float height = scan.nextFloat();
        String name = scan.next();
        Person person = new Person();
        try {
            person.setAge(age);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            person.setName(name);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            person.setHeight(height);
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }
}
