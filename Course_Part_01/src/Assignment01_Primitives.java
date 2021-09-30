
public class Assignment01_Primitives {

    public static void main(String[] args) {

        /*
         * byte
         * Min: -128
         * Max: 127
         * Default: 0
         */
        byte byteVariable = 101;
        System. out . println("Byte value is " + byteVariable);

        /*
         * short
         * Min: -32,768
         * Max: 32,767
         * Default: 0
         */
        short shortVariable = 30_000;
        System. out . println("Short value is " + shortVariable);

        /*
         * int
         * Min: -2,147,483,648
         * Max: 2,147,483,647
         * Default: 0
         */
        int intVariable = 2_000_676_782;
        System. out . println("Int value is " + intVariable);

        /*
         * long
         * Min: -2^63
         * Max: 2^63 – 1
         * Default: 0L
         */
        long longVariable = 9_000_676_782_456_657_643L;
        System. out . println("Long value is " + longVariable);

        /*
         * float
         * approximately ±3.40282347E+38F
         * Default: 0.0f
         */
        float floatVariable = 340_176_876_724_223_242_857_987_984_938_342_234_234.0f;
        System. out . println("Float value is " + floatVariable);

        /*
         * double
         * approximately ±1.79769313486231570E+308
         * Default: 0.0
         */
        double doubleVariable = 940_176_876_724_223_242_857_987_984_938_342_234_234.0;
        System. out . println("Double value is " + doubleVariable);

        /*
         * boolean
         * true or false, only two values
         * Default: false
         */
        boolean booleanVariable = true;
        System. out . println("Boolean value is " + booleanVariable);

        /*
         * char
         * 16-bit Unicode UTF-16 character
         * Default: false
         */
        char charVariable = 'h';
        System. out . println("Char value is " + charVariable);

    }
}
