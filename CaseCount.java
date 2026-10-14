class CaseCount {
    public static void main(String args[]) {
        char s[] = {'J','a','V','a',' ','P','r','o','g','r','a','m'};
        int upper = 0, lower = 0;

        for (int i = 0; i < s.length; i++) {
            if (s[i] >= 'A' && s[i] <= 'Z') {
                upper++;
            } else if (s[i] >= 'a' && s[i] <= 'z') {
                lower++;
            }
        }

        System.out.println("Uppercase = " + upper);
        System.out.println("Lowercase = " + lower);
    }
}