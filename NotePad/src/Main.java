import java.io.*;
import java.util.Scanner;

public class Main {
    private static final String FILE_PATH = "notes.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String lastSavedText = ReadLatestTextEntry();
        if (lastSavedText != null) {
            System.out.println("Last Saved Entry: " + lastSavedText);
        } else {
            System.out.println("No Entries Detected.");
        }
        System.out.print("Enter New Text: ");
        String newText = scanner.nextLine();


        WriteToFile(newText);
    }

       private static void WriteToFile(String text) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_PATH))) {
            writer.println(text);
            System.out.println("Input Text Successfully Saved To File.");
        } catch (IOException e) {
            System.err.println("Error Writing The File: " + e.getMessage());
        }
    }


    private static String ReadLatestTextEntry() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            StringBuilder text = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                text.append(line).append("\n");
            }
            return text.toString();
        } catch (IOException e) {
            System.err.println("Error Reading The File: " + e.getMessage());
            return null;
        }
    }
}