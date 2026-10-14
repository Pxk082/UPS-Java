class Palindrome {
    public static void main(String args[]) {
        char s[] = {'m','a','d','a','m'};
        int flag = 0;

        for (int i = 0; i < s.length / 2; i++) {
            if (s[i] != s[s.length - 1 - i]) {
                flag = 1;
                break;
            }
        }

        if (flag == 0) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}