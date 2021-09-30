public class Assignment03_TypeCasting {

    public static void main(String[] args) {

        // Widening Casting
        System.out.println("Widening Casting");
        int myInt1 = 100;
        System.out.println(((Object)myInt1).getClass().getSimpleName());
        System.out.println(myInt1);
        long myLong1 = myInt1; //int -> long
        System.out.println(((Object)myLong1).getClass().getSimpleName());
        System.out.println(myLong1);
        float myFloat1 = myLong1; //long -> float
        System.out.println(((Object)myFloat1).getClass().getSimpleName());
        System.out.println(myFloat1);

        // Narrowing Casting
        System.out.println("Narrowing Casting");
        double myDouble2 = 66.78;
        System.out.println(((Object)myDouble2).getClass().getSimpleName());
        System.out.println(myDouble2);
        long myLong2 = (long) myDouble2; // double -> long
        System.out.println(((Object)myLong2).getClass().getSimpleName());
        System.out.println(myLong2);
        int myInt2 = (int) myLong2; // long -> int
        System.out.println(((Object)myInt2).getClass().getSimpleName());
        System.out.println(myLong2);

    }
}
