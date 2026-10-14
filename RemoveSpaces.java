class RemoveSpaces {
    public static void main(String args[]) {
        char s[] = {'J','a','v','a',' ','i','s',' ','e','a','s','y'};

        for (int i = 0; i < s.length; i++) {
            if (s[i] != ' ') {
                System.out.print(s[i]);
            }
        }
    }
}