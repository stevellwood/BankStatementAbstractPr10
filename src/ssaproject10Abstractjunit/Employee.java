package ssaproject10Abstractjunit;

public class Employee {
    
    private int id;
    private String name;
    private String gradeLevel;
    private boolean hasParkingPriv = true;
    
    public String print() {
        return this.getName() + " is an employee";
    }
    public boolean hasParkingPriv() {
        return hasParkingPriv;
    }

    public void setParkingPriv(boolean hasParkingPriv) {
        this.hasParkingPriv = hasParkingPriv;
    }
    
        public int getEmployeeId() {
        return this.getId();
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGradeLevel() {
        return gradeLevel;
    }
    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }
    
    public Employee() {
        this.setId(0);
        this.setName("New Employee");
        this.setGradeLevel("GS01");
        this.setParkingPriv(false);
    }
    public Employee(String name) {
        this.setName(name);
        this.setParkingPriv(true);
    }

}
