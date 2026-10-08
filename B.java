import java.util.*;
class B{
	public static void main(String[]args){

		Scanner o = new Scanner(System.in);
		System.out.println("Do you want to watch a movie: ");
		String option = o.nextLine();

		if(option == "Yes") {

		System.out.println("Do you want to have snacks: ");
		String deci  = o.nextLine();
		if(deci == "Yes"){
		System.out.println("Enter  the snack options you wanna have: ");
		String snack  = o.nextLine();



		if(choice == "Popcorn"){

		System.out.println("Enter  the Size: ");
		String size = o.nextLine();
   			if(size == "Large"){
			System.out.println("Your  price is $20 and you earned a free refill!");
			}
			else if(size == "Medium"){
			System.out.println("Your prince is $12");
			}
			else if(size == "small"){
			System.out.println("Your prince is $8");
			}
			else{System.out.println("Noy valid");
			}	
			}

else if(choice == "Other"){
System.out.println("Choose your choices");
}

else{
System.out.println("You may exit the snack counter");
}
}
else{
System.out.println("You may exit the snack counter");

}
}
}

}
