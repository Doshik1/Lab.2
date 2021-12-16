import jdk.dynalink.NamespaceOperation;

final public class Emploee extends AbstractPerson {
    String department = "";
    public enum Position {
        CEO,
        MANAGER,
        ACCOUNTANT,
        DEVELOPER,
        CLEANER;
    }

    public Emploee(String name) {
        super(name);
        this.department = department;
    }

    @Override
    public String think() {
        return "I am an emploee";
    }
}
