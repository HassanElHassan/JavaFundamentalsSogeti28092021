import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Assignment36 {
    public static void main(String[] args) {
        // Open / create the output file
        try (FileWriter fileWriter = new FileWriter("Course_Part_09/src/dummy.txt");
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            // Write some text to the output fil
            bufferedWriter.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit……");
            bufferedWriter.newLine();
            bufferedWriter.write("Suspendisse vitae tincidunt mi. Curabitur accumsan leo …");
            bufferedWriter.newLine();
            bufferedWriter.write("Quisque euismod at …!");
            bufferedWriter.newLine();
            bufferedWriter.write("Lorem Ipsum is simply dummy text of the printing and typesetting industry.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
