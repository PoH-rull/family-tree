import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         boolean flag = true;
         System.out.println("this your first person creation please enter your name and age and know that the relation is you so you can write me.\nevery other person you will add you will need to add his relation to you");
         Person root = createPerson();
         FamilyTree tree = new FamilyTree(root);
         int choice=0;
         while(flag)
         {
             printChoice();
             System.out.println("Enter your choice: ");
             choice = sc.nextInt();
             switch (choice) {
                 case 1:
                     tree.add(createPerson());
                     break;
                 case 2:
                     FamilyTree.print(root);
                     break;
                 case 3:
                     flag=false;
                     break;
                 default:
                     System.out.println("Invalid choice");
             }
         }
     }
     public static void printChoice(){
         System.out.println("1. Add Person\n2. Print Tree\n3. Exit");
     }
     public static Person createPerson(){

         Scanner sc = new Scanner(System.in);
         System.out.println("Enter person name: ");
         String name = sc.nextLine();
         System.out.println("Enter person age: ");
         int age = sc.nextInt();
         sc.nextLine();
         System.out.println("Enter person relation: ");
         String relation = sc.nextLine();
         return new Person(name,age,relation);
     }
}
