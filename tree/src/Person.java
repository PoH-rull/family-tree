public class Person {
    private String name;
    private int age;
    private Person left;
    private Person right;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
        this.left = null;
        this.right = null;
    }

}
