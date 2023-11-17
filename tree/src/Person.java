public class Person {
    private String name;
    private int age;
    private Person left;
    private Person right;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.left = null;
        this.right = null;
    }

    public Person (String name, int age) {
        this.name = name;
        this.age = age;
        this.left = null;
        this.right = null;
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
}


}
