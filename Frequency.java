class Frequency {
    public static void main(String args[]) {
        char s[] = {'b','a','n','a','n','a'};

        for (int i = 0; i < s.length; i++) {
            int count = 1;
            int flag = 0;

            for (int k = 0; k < i; k++) {
                if (s[k] == s[i]) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 1) {
                continue;
            }

            for (int j = i + 1; j < s.length; j++) {
                if (s[i] == s[j]) {
                    count++;
                }
            }

            System.out.println(s[i] + " = " + count);
        }
    }
}