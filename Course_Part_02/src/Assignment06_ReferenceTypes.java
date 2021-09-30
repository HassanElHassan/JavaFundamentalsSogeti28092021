public class Assignment06_ReferenceTypes {

    public static void main(String[] args) {

        // StringBuffer
        System.out.println("StringBuffer");
        StringBuffer strBuf = new StringBuffer("Hello Java World");
        System.out.println(strBuf.append(", programming in Java is fun."));

        // StringBuilder
        System.out.println("StringBuilder");
        StringBuilder strBuid = new StringBuilder("Hello Java World");
        System.out.println(strBuid.delete(6,11));

        // Integer
        Integer myInt = 10;
        System.out.println(myInt.doubleValue());

        // Double
        Double myDouble = 11.89;
        System.out.println(myDouble.intValue());

    }
}
