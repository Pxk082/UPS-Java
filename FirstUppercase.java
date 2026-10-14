class FirstUppercase {
    public static void main(String args[]) {
        char s[] = {'j','a','v','a',' ','p','r','o','g','r','a','m'};

        if (s[0] >= 'a' && s[0] <= 'z') {
            s[0] = (char)(s[0] - 32);
        }

        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]);
        }
    }
}