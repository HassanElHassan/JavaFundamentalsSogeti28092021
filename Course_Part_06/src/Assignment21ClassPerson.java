public class Assignment21ClassPerson {

    public static void main(String[] args) {

        Person jan = new Person();
        System.out.println(jan.name);
        jan.name = "Jan";
        System.out.println(jan.name);
        jan.greet();

        Person henk = new Person();
        henk.name = "Henk";
        henk.greet();

    }

}
