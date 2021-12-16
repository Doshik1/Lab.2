class Person {
    int age;
    double height;
    String name;
    final int MAX_AGE = 200;
    final double MAX_HEIGHT = 3.2;
    void setAge(int age) {
        this.age = age;
    }

    int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(float height) {
        this.height = height;
    }
    String info() {
       /* System.out.println("age = " + age);
        System.out.println("height = " + height);
        System.out.println("name = " + name);*/
        return "age = " + age + " height = " + height + " name = " + name;
    }

    boolean valid() {
        if (age > MAX_AGE || height > MAX_HEIGHT) return false;
        else return true;
    }

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
}
