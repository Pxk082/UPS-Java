import java.util.Scanner;
public class FirstNonRepeating {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 String str = sc.nextLine();
 char result = '\0';
for (int i = 0; i < str.length(); i++) {
int count = 0;
for (int j = 0; j < str.length(); j++) {
 if (str.charAt(i) == str.charAt(j)) {
    count++;
  }
 }
  if (count == 1) {
 result = str.charAt(i);
   break;
 }
}
 if (result != '\0') {
 System.out.println("First non-repeating character: " + result);
  } 
else {
  System.out.println("No non-repeating character found.");
        }
}
}


