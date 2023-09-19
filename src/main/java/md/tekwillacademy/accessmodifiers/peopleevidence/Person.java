package md.tekwillacademy.accessmodifiers.peopleevidence;

public class Person {

    //Class variable
    public static boolean hasHeart = true;

    public static boolean hasBrain;

    //Instance variable because it defines the objects of Person class
    private long idnp;

    //Default - Instance variable
    String maritalStatus;

    //Protected - Instance variable
    protected String name;

    //Public - Instance variable
    public boolean isRetired;

    public Person(){
        System.out.println("This is a defined constructor without params");
    }

    public Person (long idnp, String nameInput){
        this.idnp = idnp;
        this.name = nameInput;
        System.out.println("This is a defined constructor with 2 params");
    }
    public Person(long idnp, String maritalStatus, String name, boolean isRetired){
        this.idnp = idnp;
        this.maritalStatus = maritalStatus;
        this.name = name;
        this.isRetired = isRetired;
        System.out.println("This is a defined constructor with all the params");
    }

}
