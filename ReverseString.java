class ReverseString {
    public static void main(String args[]) {
        char s[] = {'J','a','v','a'};

        System.out.print("Reverse = ");

        for (int i = s.length - 1; i >= 0; i--) {
            System.out.print(s[i]);
        }
    }
}