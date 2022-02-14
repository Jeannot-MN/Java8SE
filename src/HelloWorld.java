public class HelloWorld {

    {
        System.out.println("This line is from the initialization block");
    }
    public static  void main(String ...args){
        Person person = new Person();
        System.out.println(person.getName());
    }
}
