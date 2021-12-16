public class PersonTest {
    public static void main(String[] args) throws Exception {
        PersonEx Semyon = new PersonEx();
        Semyon.setAge(19);
        Semyon.setHeight(1.8);
        Semyon.setName("Semyon");
        System.out.println(Semyon.info());
    }
}
