public class Person {

    {
        this.name  = "Init Block";
        System.out.println(this.name);
    }

    private String name = "Amen";

    public Person() {
        System.out.println("When I call constructor "+ this.name);
    }

    public Person(String name) {
        System.out.println("When I call constructor "+ this.name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
