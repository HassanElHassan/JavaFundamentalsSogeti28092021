import java.util.Locale;

public class Assignment04_StringMethods {

    public static void main(String[] args) {
        String myStr = "Today is a nice day.     ";
        System.out.println("Str: " + myStr);
        System.out.println("Str length: " + myStr.length());
        System.out.println("Character at index 3: " + myStr.charAt(3));
        System.out.println("Character 'x' in str?: " + myStr.contains("x"));
        System.out.println("Str starts with 'Tod'?: " + myStr.startsWith("Tod"));
        System.out.println("Str ends with 'day.'?: " + myStr.endsWith("day."));
        System.out.println("Str is equal to 'today is a bad day.'?: " + myStr.equals("today is a bad day."));
        System.out.println("Index of char 'd': " + myStr.indexOf("d"));
        System.out.println("Str is empty?: " + myStr.isEmpty());
        System.out.println("Replace char 'a' with '9': " + myStr.replace("a", "9"));
        System.out.println("Get substring starting from index 11: " + myStr.substring(11));
        System.out.println("Str in lower case: " + myStr.toLowerCase());
        System.out.println("Str in upper case: " + myStr.toUpperCase());
        System.out.println("Trim leading and trailing spaces: " + myStr.trim());

    }
}
