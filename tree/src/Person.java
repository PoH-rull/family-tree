public class Person {
    private String name;
    private int age;
    private String relation;
    private Person left;
    private Person right;
    public Person(String name, int age, String relation) {
        this.name = name;
        this.age = age;
        this.relation = relation;
        this.left = null;
        this.right = null;
    }


}
