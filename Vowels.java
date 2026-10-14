class Vowels {
    public static void main(String args[]) {
        char s[] = {'E','d','u','c','a','t','i','o','n'};
        int count = 0;

        for (int i = 0; i < s.length; i++) {
            char ch = s[i];

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u' || ch == 'A' ||
                ch == 'E' || ch == 'I' || ch == 'O' ||
                ch == 'U') {
                count++;
            }
        }

        System.out.println("Vowels = " + count);
    }
}