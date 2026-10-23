import java.util.Scanner;
public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine().replaceAll(" ", "").toLowerCase();
        String s2 = sc.nextLine().replaceAll(" ", "").toLowerCase();
if (s1.length() != s2.length()) {
            System.out.println("The strings are not anagrams.");
            return;
        }
        int[] freq = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s2.length(); i++) {
            freq[s2.charAt(i) - 'a']--;
        }

        boolean anagram = true;
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                anagram = false;
                break;
            }
        }
        if (anagram) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }
}