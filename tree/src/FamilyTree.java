public class FamilyTree {
    private Person root;
    public FamilyTree (Person root){
        this.root = root;

    }
    private Person addRecursive(Person root ,Person person){
        if(person == null){
            return null;
        }
        if(person.getMother() != null){
            person.setMother(addRecursive(person.getMother()));
        }
        if(person.getFather() != null){
            person.setFather(addRecursive(person.getFather()));
        }
        return person;
    }
    public  void add (Person person){
        this.root = addRecursive(person);
    }


    }
