import java.util.Scanner;

public class flowerSell {
	private final static double roseP = 3.0;
	private final static double jasmineP = 1.5;
	private final static double daisyP = 1.0;
	private final static double carnationP = 2.5;
	private final static double tulipP = 2.5;
	private final static double babysbreathP = 1.0;
	private final static double lavenderP = 1.5;
	private final static double lilyP = 2.0;
	
	
	static Flower rose = new Flower(100, roseP);
	static Flower jasmine = new Flower(100, jasmineP);
	static Flower daisy = new Flower(100, daisyP);
	static Flower carnation = new Flower(100, carnationP);
	static Flower tulip = new Flower(100, tulipP);
	static Flower babysbreath = new Flower(100, babysbreathP);
	static Flower lavender = new Flower(100, lavenderP);
	static Flower lily = new Flower(100, lilyP);
	
	
	public static double totalPrice = 0.0;
	public final static double priceOfPackage = 2.0;
	public final static double priceOfCard = 1.5;
	
	public static void print() {
		System.out.println("We have 1.Rose  2.Jasmine  3.Daisy  4.Carnation  5.Tulip  6.baby's Breath  7.lavender  8.lily");
		System.out.println("Please enter the number before the flower you want to choose: ");
		Scanner scan  = new Scanner(System.in);
		int flowerChoose = scan.nextInt();
		
		switch(flowerChoose) {
		case 1: 
			System.out.println("There are " + rose.getStock() + " roses. The price is " + rose.getPrice() + " dollars each.");
			System.out.println("Please enter the amount you want: ");
			int amountRose = scan.nextInt();
			if (amountRose <= rose.getStock()) {
				rose.setAmount(amountRose);
				rose.setStock();
				totalPrice += rose.getAmount()*rose.getPrice();
				System.out.println("The charge for rose is " + rose.getAmount()*rose.getPrice() + ". The total charge is " + totalPrice);
			} else {
				System.out.println("Invalid input");
			}
			break;
		case 2: 
			System.out.println("There are " + jasmine.getStock() + " jasmines. The price is " + jasmine.getPrice() + " dollars each.");
			System.out.println("Please enter the amount you want: ");
			int amountJasmine = scan.nextInt();
			if (amountJasmine <= jasmine.getStock()) {
				jasmine.setAmount(amountJasmine);
				jasmine.setStock();
				totalPrice += jasmine.getAmount()*jasmine.getPrice();
				System.out.println("The charge for jasmine is " + jasmine.getAmount()*jasmine.getPrice() + ". The total charge is " + totalPrice);
			} else {
				System.out.println("Invalid input");
			}
			break;
		case 3:
			System.out.println("There are " + daisy.getStock() + " daisies. The price is " + daisy.getPrice() + " dollars each.");
			System.out.println("Please enter the amount you want: ");
			int amountDaisy = scan.nextInt();
			if (amountDaisy <= daisy.getStock()) {
				daisy.setAmount(amountDaisy);
				daisy.setStock();
				totalPrice += daisy.getAmount()*daisy.getPrice();
				System.out.println("The charge for daisy is " + daisy.getAmount()*daisy.getPrice() + ". The total charge is " + totalPrice);
			} else {
				System.out.println("Invalid input");
			}
			break;
		case 4:
			System.out.println("There are " + carnation.getStock() + " carnations. The price is " + carnation.getPrice() + " dollars each.");
			System.out.println("Please enter the amount you want: ");
			int amountCarnation = scan.nextInt();
			if (amountCarnation <= carnation.getStock()) {
				carnation.setAmount(amountCarnation);
				carnation.setStock();
				totalPrice += carnation.getAmount()*carnation.getPrice();
				System.out.println("The charge for carnation is " + carnation.getAmount()*carnation.getPrice() + ". The total charge is " + totalPrice);
			} else {
				System.out.println("Invalid input");
			}
			break;
		case 5:
			System.out.println("There are " + tulip.getStock() + " tulips. The price is " + tulip.getPrice() + " dollars each.");
			System.out.println("Please enter the amount you want: ");
			int amountTulip = scan.nextInt();
			if (amountTulip <= tulip.getStock()) {
				tulip.setAmount(amountTulip);
				tulip.setStock();
				totalPrice += tulip.getAmount()*tulip.getPrice();
				System.out.println("The charge for tulip is " + tulip.getAmount()*tulip.getPrice() + ". The total charge is " + totalPrice);
			} else {
				System.out.println("Invalid input");
			}
			break;
		case 6:
			System.out.println("There are " + babysbreath.getStock() + " baby's breath. The price is " + babysbreath.getPrice() + " dollars each.");
			System.out.println("Please enter the amount you want: ");
			int amountBabysbreath = scan.nextInt();
			if (amountBabysbreath <= babysbreath.getStock()) {
				babysbreath.setAmount(amountBabysbreath);
				babysbreath.setStock();
				totalPrice += babysbreath.getAmount()*babysbreath.getPrice();
				System.out.println("The charge for baby's breath is " + babysbreath.getAmount()*babysbreath.getPrice() + ". The total charge is " + totalPrice);
			} else {
				System.out.println("Invalid input");
			}
			break;
		case 7:
			System.out.println("There are " + lavender.getStock() + " lavender. The price is " + lavender.getPrice() + " dollars each.");
			System.out.println("Please enter the amount you want: ");
			int amountLavender = scan.nextInt();
			if (amountLavender <= lavender.getStock()) {
				lavender.setAmount(amountLavender);
				lavender.setStock();
				totalPrice += lavender.getAmount()*lavender.getPrice();
				System.out.println("The charge for lavender is " + lavender.getAmount()*lavender.getPrice() + ". The total charge is " + totalPrice);
			} else {
				System.out.println("Invalid input");
			}
			break;
		case 8:
			System.out.println("There are " + lily.getStock() + " lilies.  The price is " + lily.getPrice() + "dollars each.");
			System.out.println("Please enter the amount you want: ");
			int amountLily = scan.nextInt();
			if (amountLily <= lily.getStock()) {
				lily.setAmount(amountLily);
				lily.setStock();
				totalPrice += lily.getAmount()*lily.getPrice();
				System.out.println("The charge for lily is " + lily.getAmount()*lily.getPrice() + ". The total charge is " + totalPrice);
			} else {
				System.out.println("Invalid input");
			}
			break;
		default:
			System.out.println("Invalid input.");
			break;
		}
	}
	
	public static void otherFlower() {
		boolean choice = true;
		while (choice) {
			System.out.println("Do you want other kinds of flowers in this bunch? 1.YES; 2.NO.");
			Scanner scan1  = new Scanner(System.in);
			int kindChoose = scan1.nextInt();
			if (kindChoose==1) {
				print();
			} else if (kindChoose==2){
				choice = false;
				Package();
				card();
				System.out.println("Thank you!");
			}else {
				System.out.println("Invaid input. Please try again.");
			}	
		}	
	}
	
	
	
	
	public static void otherBunch() {
		boolean choice = true;
		while (choice) {
			System.out.println("Do you want another bunch? 1.YES; 2.NO.");
			Scanner scan  = new Scanner(System.in);
			int bunchChoose = scan.nextInt();
			if (bunchChoose == 1) {
				print();
				otherFlower();
			} else if(bunchChoose == 2){
				choice = false;
				System.out.println("Thank you!");
			} else {
				System.out.println("Invaid input. Please try again.");
			}
		}
	}
	
	
	
	public static void Package(){
		System.out.println("Do you want to package this bunch of flowers? The charge is 2 dollars per bunch. 1. YES; 2.NO."); 
		Scanner scan  = new Scanner(System.in);
		int packageChoose = scan.nextInt();
		if (packageChoose ==1) {
			totalPrice += priceOfPackage;
			System.out.println("The total charge is " + (totalPrice) + " dallars.");
		}
	}
	
	public static void card(){
		System.out.println("Do you want a card for this bunch of flowers? The cahrge is 1.5 dollars each. 1. YES; 2.NO."); 
		Scanner scan  = new Scanner(System.in);
		int cardChoose = scan.nextInt();
		if (cardChoose ==1) {
			totalPrice += priceOfCard;
			System.out.println("The total charge is " + (totalPrice) + " dallars.");
		}
	}
	

	public static void main(String[] args) {
		System.out.println("Welcome to Flower Store!");
		print();
		otherFlower();
		otherBunch();
		System.out.println("Your total charge is " + totalPrice);
		
		
	}

}
