
class StringReverseTask {
    public static void main(String[] args) {
        String str = "hello";
        char[] ch = str.toCharArray();

        System.out.print("Reversed string: ");

        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print(ch[i]);
        }
    }
}
