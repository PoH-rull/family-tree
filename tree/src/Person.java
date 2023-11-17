public class Person {
    private String name;
    private int age;
    private String relation;//based to on the person acting as root
    private Person left;
    private Person right;

    public Person(String name, int age, String relation) {
        this.name = name;
        this.age = age;
        this.relation = relation;
        this.left = null;
        this.right = null;
    }

    public Person getRight() {
        return right;
    }

    public Person getLeft() {
        return left;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean Equals(Person person){
        if(this.name.equals(person.getName()) && this.age == person.getAge()){
            return true;
        }
        return false;
    }

    public void setRight(Person person) {
        this.right = person;
    }

    public void setLeft(Person person) {
        this.left = person;
    }

    public String getRelation() {
        return relation;
    }
    public String toString(){
        return name + " " + age + " " + relation;
    }
}


