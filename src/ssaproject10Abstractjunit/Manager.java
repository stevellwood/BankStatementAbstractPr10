package ssaproject10Abstractjunit;


public class Manager extends Employee {
    
    public String print() {
        return super.print() + " and also a Manager";//this is only useful when the 2 methods ahve the exact same name
    }
    public boolean hasParkingPriv(boolean value) {
        return true;
    }
    public Manager() {//amsal
        //super();//calls this first We don't need to do this!!! It happens automatically
        //only call super if you want to call a special super construct with aparameter
        this.setParkingPriv(true);//this then overrides it 3nd
    }
    public Manager(String name) {
        //it calls the default even though it logically would have called the employee(string)
        // you need to do super(string) to actually access that constructor
    }
}
