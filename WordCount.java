import java.util.*;

class WordCount {
    public static void main(String[] args) {
        String str = "java is easy and java is powerful";
        HashMap<String, Integer> map = new HashMap<>();

        str = str.toLowerCase().trim();

        if (str.isEmpty()) {
            System.out.println("Empty sentence");
            return;
        }

        String[] words = str.split("\\s+");

        for (int i = 0; i < words.length; i++) {
            map.put(words[i], map.getOrDefault(words[i], 0) + 1);
        }

        System.out.println(map);

        String most = "";
        int max = 0;

        for (String word : map.keySet()) {
            if (map.get(word) > max) {
                max = map.get(word);
                most = word;
            }
        }

        System.out.println("Most frequent word: " + most);
        System.out.println("Count: " + max);
    }
}