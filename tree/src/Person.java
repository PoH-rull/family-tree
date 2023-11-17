public class Person {
    private String name;//name of this person
    private int age;//age of this person
    private String relation;//based to on the person acting as root
    private Person left;//person to the left of this person
    private Person right;//person to the right of this person

    public Person(String name, int age, String relation) {//we also need to make a constructor for a person without any relation (root)
        this.name = name;
        this.age = age;
        this.relation = relation;
        this.left = null;
        this.right = null;
    }

    //get the person to the right of this person
    public Person getRight() {
        return right;
    }

    //get the person to the left of this person
    public Person getLeft() {
        return left;
    }

    //get the name of this person
    public String getName() {
        return name;
    }

    //get the age of this person
    public int getAge() {
        return age;
    }

    //get the relation of this person to the root
    public String getRelation() {
        return relation;
    }

    //return if this person is the same as the other person
    public boolean Equals(Person person){
        if(this.name.equals(person.getName()) && this.age == person.getAge()){
            return true;
        }
        return false;
    }

    //set the person to the right of this person
    public void setRight(Person person) {
        this.right = person;
    }

    //set the person to the left of this person
    public void setLeft(Person person) {
        this.left = person;
    }

    public String toString(){
        return name + " " + age + " " + relation;
    }
}


