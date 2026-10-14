class VowelCountTask {
    public static void main(String[] args) {
        String str = "education";
        char[] ch = str.toCharArray();
        int count = 0;

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'a' || ch[i] == 'e' ||
                ch[i] == 'i' || ch[i] == 'o' ||
                ch[i] == 'u' || ch[i] == 'A' ||
                ch[i] == 'E' || ch[i] == 'I' ||
                ch[i] == 'O' || ch[i] == 'U') {
                count++;
            }
        }

        System.out.println("Vowel count: " + count);
    }
}
