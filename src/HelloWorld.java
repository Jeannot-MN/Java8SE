public class HelloWorld {

    {
        System.out.println("This line is from the initialization block");
    }

    public static void main(String... args) {
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
            while(true){
                if(z >= 10) break outer_loop;
                System.out.println(z++);
            }
        }
    }
}
