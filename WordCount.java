class WordCount {
    public static void main(String args[]) {
        char s[] = {'J','a','v','a',' ','i','s',' ','e','a','s','y'};
        int count = 0;

        for (int i = 0; i < s.length; i++) {
            if (s[i] != ' ' && (i == 0 || s[i - 1] == ' ')) {
                count++;
            }
        }

        System.out.println("Words = " + count);
    }
}