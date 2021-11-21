import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Assignment35 {
    public static void main(String[] args) {
        // Classic BufferedReader and FileReader using try-with-resources construct
        try (FileReader reader = new FileReader("Course_Part_09/src/dummy.txt");
             BufferedReader bufferedReader = new BufferedReader(reader)) {

            // read line by line
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

