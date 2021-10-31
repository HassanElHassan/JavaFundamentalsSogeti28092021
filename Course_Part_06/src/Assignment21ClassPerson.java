public class Assignment21ClassPerson {

    public static void main(String[] args) {

        // Person object jan
        Person jan = new Person();
        // the following will print a null because name is not set yet
        System.out.println(jan.name);
        jan.name = "Jan";
        System.out.println(jan.name);
        jan.greet();

        // Person object henk
        Person henk = new Person();
        henk.name = "Henk";
        henk.greet();
    }

}
