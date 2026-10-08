import java.util.*;

class Theater{
    public static void main(String[] args) {

        Scanner o = new Scanner(System.in);

        System.out.println("Do you want to watch a movie: ");
        String option = o.nextLine();

        if (option.equals("Yes I want to watch")) {

            System.out.println("Enter the snack options you wanna have: ");
            String snack = o.nextLine();

            if (snack.equals("I want snacks")) {

                System.out.println("Enter the Choice: ");
                String choice = o.nextLine();

                if (choice.equals("Popcorn")) {

                    System.out.println("Enter the Size: ");
                    String size = o.nextLine();

                    if (size.equals("Large")) {
                        System.out.println("Your price is $20 and you earned a free refill!");
                    }
                    else if (size.equals("Medium")) {
                        System.out.println("Your price is $12");
                    }
                    else if (size.equals("small")) {
                        System.out.println("Your price is $8");
                    }
                }
                else if (choice.equals("Other")) {
                    System.out.println("Choose your choices");
                }
            }
            else {
                System.out.println("You may exit the snack counter");
            }

            System.out.println("Enter the movie genre you wanna watch: ");
            String genre = o.nextLine();

            if (genre.equals("Soft Romance")) {
                System.out.println("Way Back Home!");
            }
            else if (genre.equals("Dark Romance")) {
                System.out.println("Mine to Hunt");
            }
            else if (genre.equals("Horror")) {
                System.out.println("Conjuring");
            }
            else if (genre.equals("Sci-Fi")) {
                System.out.println("Train to Busan");
            }
            else if (genre.equals("Thriller")) {
                System.out.println("The End of the F***ing World!");
            }
            else {
                System.out.println("You may exit the browser");
            }
        }
    }
}