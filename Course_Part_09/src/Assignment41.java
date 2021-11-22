import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Assignment41 {
    public static void main(String[] args) {

        String fileName = "dummy2.txt";
        // Classic BufferedReader and FileReader using try-with-resources construct
        try (FileReader reader = new FileReader("Course_Part_09/src/" + fileName);
             BufferedReader bufferedReader = new BufferedReader(reader)) {

            int wordCount = 0;
            int upperCount = 0;
            // read line by line
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split(" ");
                // wordCount += words.length; // to count outside the for loop
                for (String word : words) {
                    wordCount++;
                    if (Character.isUpperCase(word.charAt(0))) upperCount++;
                }
            }

            System.out.printf("The file %s contains %d words, of which %d words start with an uppercase character.",
                    fileName,
                    wordCount,
                    upperCount
            );


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
