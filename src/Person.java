public class Person {

    {
        this.name  = "Init Block";
        System.out.println(this.name);
    }

    private String name = "Amen";
    static int count = 0;

    public Person() {
        System.out.println("When I call constructor "+ this.name);
        count += 1;
        System.out.println("This is person number "+ count);
    }

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

    public static void speak(){
        System.out.println("I can't really say much");
    }
}
