public class FamilyTree {
    private Person root;
    public FamilyTree (Person root){
        this.root = root;

    }
    private Person addRecursive(Person root ,Person person){
        if(root == null){
            return person;
        }
        if(root.Equals(person)){
            return root;
        }
        if(root.getAge() < person.getAge()){
            root.setRight(addRecursive(root.getRight(),person));
        }else{
            root.setLeft(addRecursive(root.getLeft(),person));
        }
        return root;
    }
    public  void add (Person person){
        this.root = addRecursive(person);
    }
    public static int print(person root){
        if(root == null){
            return 0;
        }
        return 1 + print(root.getLeft()) + print(root.getRight());

    }
