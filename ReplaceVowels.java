class ReplaceVowels {
    public static void main(String args[]) {
        char s[] = {'E','d','u','c','a','t','i','o','n'};

        for (int i = 0; i < s.length; i++) {
            if (s[i] == 'a' || s[i] == 'e' || s[i] == 'i' ||
                s[i] == 'o' || s[i] == 'u' || s[i] == 'A' ||
                s[i] == 'E' || s[i] == 'I' || s[i] == 'O' ||
                s[i] == 'U') {
                s[i] = '*';
            }
        }

        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]);
        }
    }
}