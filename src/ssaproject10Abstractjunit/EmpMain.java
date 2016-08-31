package ssaproject10Abstractjunit;
public class EmpMain{
public static void main(String[] args) {
    // TODO Auto-generated method stub
    Employee gd = new Employee();
    gd.setId(1);
    gd.setName("Greg Doud");
    gd.setGradeLevel("GS1");
    boolean hasIt = gd.hasParkingPriv();
    System.out.println("Name is " + gd.getName() + " grade is " + gd.getGradeLevel());
    System.out.println(" has parking priv " + hasIt);
    //
    // Manager
    Manager amsal = new Manager();
    amsal.setId(2);
    //amsal.setName("Amsal");
    //amsal.setGradeLevel("GS15");
    //boolean alsoHasPriv = amsal.hasParkingPriv();
    System.out.println("Manager " + amsal.getName() + " has parking priv " + amsal.hasParkingPriv());
    System.out.println("Name is " + amsal.getName() + " grade is " + amsal.getGradeLevel());
   // System.out.println(" has parking priv " + alsoHasPriv);
    //
    // turning an employee into a manager
    //
    Manager newManager = new Manager("Lori Manager");
    System.out.println("NewManager parking priv is " + newManager.hasParkingPriv());
    System.out.println("NewManager name is " + newManager.getName());
    //
    System.out.println(newManager.print());
}

}

