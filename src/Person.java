/**
 * @author Jeannot
 * This is just a class to reprent a person that is interrating with the system
 */
public class Person {

    static {
        System.out.println("Unfortunately I only run once when the class is loaded");
    }

    {
        this.name = "Init Block";
        System.out.println(this.name);
    }

    private String name = "The Name";
    static int count = 0;

    //All these are valid in Java
    public static final int ssn = 0;
    public final static int even = 1;
    static public final int n0 = 1;
    static final public int odd = 2;
    final static public int mm = 2;
    final public static int n = 0;

    Person() {
        System.out.println("When I call constructor " + this.name);
        count += 1;
        System.out.println("This is person number " + count);
    }

    /**
     * @param name the name of the person
     */
    public Person(String name) {
        this();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void speak() {
        System.out.println("I can't really say much");
    }
}
