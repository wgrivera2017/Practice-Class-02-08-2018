import java.util.Scanner;
public class CardTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Card card1Type1 = new Card(1, "Diamonds"); // 1st Type
		System.out.println(card1Type1.number + card1Type1.suit);
		
		Card card2Type1 = new Card(4, "Hearts");
		System.out.println(card2Type1.number + card2Type1.suit);
		
		Card card3Type1	= new Card(3, "Clubs");
		System.out.println(card3Type1.number + card3Type1.suit);
		
		Card card1Type2 = new Card(2, "Spades"); // 2nd Type
		System.out.println(card1Type2.number + card1Type2.suit);
		
		Card card2Type2 = new Card(8, "Hearts"); //Lucky Card
		System.out.println(card2Type2.number + card2Type2.suit);
		
		Card card3Type2 = new Card(7, "Spades");
		System.out.println(card3Type2.number + card3Type2.suit);
		
		Card card1Type3 = new Card(5, "Clubs"); //3rd Type
		System.out.println(card1Type3.number + card1Type3.suit);
		
		Card card2Type3 = new Card(6, "Spades");
		System.out.println(card2Type3.number + card2Type3.suit);
		
		Card card3Type3 = new Card(8, "Diamonds");
		System.out.println(card3Type3.number + card3Type3.suit);
		
		System.out.println("Pick a suit");
		String su = scanner.nextLine();
		
		System.out.println("Pick a number");
		int nu = scanner.nextInt();
				
		if((nu == card2Type2.number ) && (su.equals(card2Type2.suit))) {
			System.out.println("You Win :D ");
		}
		else {
			System.out.println("You Lose D: ");
		}
		
	}

}
