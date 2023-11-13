public class Person {
    private String name;
    private int age;
    private Person mother;
    private Person father;
    private Person left;
    private Person right;

    public Person(String name, int age, Person mother, Person father) {
        this.name = name;
        this.age = age;
        this.mother = mother;
        this.father = father;
        this.left = null;
        this.right = null;
    }

    public Person (String name, int age) {
        this.name = name;
        this.age = age;
        this.left = null;
        this.right = null;
    }

    public Person getMother() {
        return mother;
    }

    public Person getFather() {
        return father;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
