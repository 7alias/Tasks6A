public class Cat {
    private String name;
    private int age;
    private String owner;

    public Cat(String name, int age, String owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    @Override
    public String toString() {
        String string = "The cat " + name + " is already " + age + ". Her master " + owner + " takes care of her.";
        return string;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getOwner() {
        return owner;
    }
    void eat(){}
    void run(){}
}
