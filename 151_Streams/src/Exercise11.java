import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Exercise11 {

    public static void main(String[] args) {

        List<String> inputTextLines = readLines("assets/inputText.txt");
        List<String> linesWithoutPunctuation = removePunctuation(inputTextLines);
        List<String> words = getAllWords(linesWithoutPunctuation);
        HashMap<String, Integer> wordsCount = getHashMap(words);
        TreeMap<String, Integer> sortedWords = sortByKey(wordsCount);
        printAll(sortedWords);


//        String fullText = readedLines.stream()
//                .map(l -> l.replaceAll("[^a-zA-Z ]", ""))
//                .collect(Collectors.joining());
//
//        Map<String, Long> wordsCounter = Arrays.asList(fullText.split(" ")).stream()
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    public static List<String> readLines(String filePath) {
        try {
            return Files.readAllLines(Paths.get(filePath));
        } catch (IOException e) {
            System.err.println("File cannot be read.");
        }
        return new ArrayList<>();
    }

    public static List<String> removePunctuation(List<String> inputTextLines) {
        for (String line : inputTextLines) {
//            line.replaceAll("[^a-zA-Z ]", "");
//
//            line.replace("\"", "");
//            line.replace("'", "");
//            line.replace("(", "");
//            line.replace(")", "");
//            line.replace("-", "");
//            line.replace(".", "");
//            line.replace("_", "");
//            line.replace("?", "");
//            line.replace("!", "");
        }
        return inputTextLines;
    }

    public static List<String> getAllWords(List<String> inputTextLines) {
        List<String> words = new ArrayList<>();
        for (String line : inputTextLines) {
            words.addAll(Arrays.asList(line.split(" ")));
        }
        return words;
    }

    public static HashMap<String, Integer> getHashMap(List<String> words) {
        HashMap<String, Integer> wordsCount = new HashMap<>();
        for (String word : words) {
            if (!wordsCount.containsKey(word)) {
                wordsCount.put(word, 1);
            } else {
                wordsCount.replace(word, wordsCount.get(word) + 1);
            }
        }
        return wordsCount;
    }

    public static TreeMap<String, Integer> sortByKey(HashMap<String, Integer> unsorted) {
        TreeMap<String, Integer> sorted = new TreeMap<>();
        sorted.putAll(unsorted);
        return sorted;
    }

    public static void printAll(TreeMap<String, Integer> sortedWords) {
        for (Map.Entry<String, Integer> entry : sortedWords.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println(sortedWords.size());
    }


}
