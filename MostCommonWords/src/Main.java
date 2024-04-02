import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Metin Girin: ");
        String text = scanner.nextLine();
        System.out.println();

        Map<String, Integer> wordCountMap = new HashMap<>();

        String[] Words = text.split("\\s+");


        for (String word : Words) {
            int count = wordCountMap.getOrDefault(word, 0);
            wordCountMap.put(word, count + 1);
        }

        String FrequentWord = null;
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                FrequentWord = entry.getKey();
            }
        }

        if (FrequentWord != null) {
            System.out.println("En sık kullanılan sözcük: " + FrequentWord);
            System.out.println("Bu sözcük " + maxCount + " kez geçiyor.");
        } else {
            System.out.println("Boş Metin.");
        }
    }
}