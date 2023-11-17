public class test {
    public static void main(String[] args) {
        //create a root person and 8 people more 4 younger and 4 older with family relations
        Person root = new Person("root", 40, "root");
        Person person = new Person("person", 54, "person");
        Person person2 = new Person("person2", 67, "person");
        Person person3 = new Person("person3", 43, "person");
        Person person4 = new Person("person4", 219, "person");
        Person person5 = new Person("person5", 42, "person");
        Person person6 = new Person("person6", 16, "person");
        Person person7 = new Person("person7", 5, "person");
        Person person8 = new Person("person8", 0, "person");
        FamilyTree tree = new FamilyTree(root);
        tree.add(root);
        tree.add(person);
        tree.add(person7);
        tree.add(person2);
        tree.add(person3);
        tree.add(person4);
        tree.add(person5);
        tree.add(person6);
        tree.add(person8);
        FamilyTree.print(root);
    }
}