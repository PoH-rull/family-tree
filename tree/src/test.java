public class test {
    public static void main(String[] args) {
        Person person = new Person("John", 25);
        person.getMother().setName("Jane");
        person.getMother().setAge(30);
        FamilyTree tree = new FamilyTree();
        tree.add(person);
}