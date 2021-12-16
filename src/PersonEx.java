public class PersonEx {
    int age;
    double height;
    String name;
    final int MAX_AGE = 200;
    final double MAX_HEIGHT = 3.2;
    public enum Gender {
        MALE(1, "Men"),
        FEMALE(2, "women"),
        OTHER(1024, "Other");
        private final int value;
        private final String strvalue;

        Gender(int value, String strvalue) {
            this.value = value;
            this.strvalue = strvalue;
        }

        int getValue() {
            return this.value;
        }

        String getStrvalue() {
            return this.strvalue;
        }
    }
    void setAge(int age) throws Exception{
        if(age > MAX_AGE)
        { throw new Exception("Mistake");}
        this.age = age;
    }

    int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(double height) throws Exception{
        if (height > MAX_HEIGHT)
        { throw new Exception("Mistake");}
        this.height = height;
    }
    String info() {
        return "age = " + age + " height = " + height + " name = " + name;
    }



}
