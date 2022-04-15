import java.util.function.Predicate;

public class HelloWorld {

    {
        System.out.println("This line is from the initialization block");
    }

    public static void main(String... args) {

//        Test1.main(args);
        Person person = new Person();
        System.out.println(person.getName());

        Person person2 = new Person();

        //With static members no NullPointerException are thrown
        //And not that count was not increment because we never created a third object
        // but created a reference to NOTHING
        Person person3 = null;
        person3.speak();
        System.out.println(person3.count);


        //EVEN MORE AMAZING 🤣🤣🤣🤣
        person3.count = 7;

        person:
        System.out.println(person3.count);


        //Labels
        outer_loop:
        while (true) {
            int z = 0;
            while (true) {
                if (z >= 10) break outer_loop;
                System.out.println(z++);
            }
        }

        //YES We are passing by value (Well in this case String are immutable that's why not change)
        String name = "John";
        tryChangeTheValue(name);
        System.out.println(name);

        System.out.println(isAllowedToAccessVenue(p -> p.getName().equalsIgnoreCase("The Name"), person));
    }

    private static void tryChangeTheValue(String value) {
        value += " You see I am new!!!!";
    }


    private static boolean isAllowedToAccessVenue(Predicate<Person> predicate, Person person) {
        return predicate.test(person);
    }
}
