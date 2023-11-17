public class FamilyTree {
    private Person head;
    private Person addRecursive(Person person){
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


    }
