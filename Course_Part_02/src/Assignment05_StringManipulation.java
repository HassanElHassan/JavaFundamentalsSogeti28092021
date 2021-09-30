
public class Assignment05_StringManipulation{

    public static void main(String[] args) {

        String firstName = "James";
        String lastName = "Dean";
        int age = 24;
        String fullStr = String.format(
                "The American actor %s %s was %d years when he died.%n",
                firstName,
                lastName,
                age);
        System.out.println(fullStr);

        double dblTemperature = 28.53;
        System.out.println(((Object)dblTemperature).getClass().getSimpleName());
        System.out.println(dblTemperature);
        String strTemperature = String.valueOf(dblTemperature);
        System.out.println(((Object)strTemperature).getClass().getSimpleName());
        System.out.println(strTemperature);

        String strHumidity = "54.65";
        System.out.println(((Object)strHumidity).getClass().getSimpleName());
        System.out.println(strHumidity);
        float fltHumidity = Float.parseFloat(strHumidity);
        System.out.println(((Object)fltHumidity).getClass().getSimpleName());
        System.out.println(fltHumidity);

    }

}
