public class FamilyTree {
    private Person root;
    private static  boolean rootPrint=true;
    private static int recursive=0;

    public FamilyTree(Person root) {
        this.root = root;

    }

    private Person addRecursive(Person root, Person person) {
        if (root == null) {
            return person;
        }
        if (root.Equals(person)) {
            return root;
        }
        if (root.getAge() < person.getAge()) {
            if (root.getRight() != null) {
                if (root.getRight().getAge() > person.getAge()) {
                    Person temp = root.getRight();
                    root.setRight(person);
                    root.setRight(addRecursive(root.getRight(), temp));
                }
            }
            root.setRight(addRecursive(root.getRight(), person));
        } else {
            if (root.getLeft() != null) {
                if (root.getLeft().getAge() < person.getAge()) {
                    Person temp = root.getLeft();
                    root.setLeft(person);
                    root.setLeft(addRecursive(root.getLeft(), temp));
                }
            }
            root.setLeft(addRecursive(root.getLeft(), person));
        }
        return root;
    }

    public void add(Person person) {
        this.root = addRecursive(root, person);
    }

    public static int printRight(Person root) {
        if (root == null) {
            recursive = 1;
            return 0;
        }
        printRight(root.getRight());
        if (recursive == 1) {
            System.out.println(root);
        }

        return 1;
    }

    public static int printLeft(Person root) {

        if (root != null) {
            if (rootPrint) {
                rootPrint = false;
                printLeft(root.getLeft());
            } else {
                System.out.println(root);
                printLeft(root.getLeft());
            }

        }
            return 0;
    }

    public static void print(Person root) {
        printRight(root);
        printLeft(root);
    }
}

