import java.io.*;

public class Main {
    public static void main(String[] args) {
        String filePath = "src/data.txt";
        String[] data = {"5", "10", "20", "12", "33"};

        try {

            File file = new File(filePath);

            FileWriter writer = new FileWriter(file);

            for (String datum : data) {
                writer.write(datum + "\n");
            }
            writer.close();

            System.out.println("File Created: " + file.getAbsolutePath());
        } catch (IOException e) {
            System.err.println("Error Creating File: " + e.getMessage());
        }

        int total = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                int number = Integer.parseInt(line);
                total += number;
            }
            System.out.println("Sum Total Of Numbers Read From The File => " + total);
        } catch (IOException e) {
            System.err.println("Error Reading File: " + e.getMessage());
        }
    }
}