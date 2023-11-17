public class test {
    public static void main(String[] args) {
        Person root = new Person("harel", 16);
        Person person = new Person("John", 25);
        Person person7 = new Person("dan", 52);
        Person person2 = new Person("Jane", 30);
        Person person3 = new Person("Mike", 40);
        Person person4 = new Person("Emily", 20);
        //create  2 person that will go to the left branch of harel
        Person person5 = new Person("Alice", 18);
        Person person6 = new Person("Bob", 22);
        FamilyTree tree = new FamilyTree();
        root=tree.add(root);
        tree.add(person);
        tree.add(person7);
        tree.add(person2);
        tree.add(person3);
        tree.add(person4);
        tree.add(person5);
        tree.add(person6);
        FamilyTree.printTree(root);
}