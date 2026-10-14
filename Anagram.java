class Anagram {
    public static void main(String args[]) {
        char a[] = {'l','i','s','t','e','n'};
        char b[] = {'s','i','l','e','n','t'};
        int count = 0;

        if (a.length != b.length) {
            System.out.println("Not Anagrams");
        } else {
            for (int i = 0; i < a.length; i++) {
                int found = 0;

                for (int j = 0; j < b.length; j++) {
                    if (a[i] == b[j]) {
                        b[j] = '*';
                        found = 1;
                        break;
                    }
                }

                if (found == 1) {
                    count++;
                } else {
                    break;
                }
            }

            if (count == a.length) {
                System.out.println("Anagrams");
            } else {
                System.out.println("Not Anagrams");
            }
        }
    }
}