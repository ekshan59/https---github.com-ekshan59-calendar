package calendar;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Calendar {

	//Èçáîð çà ñúçäàâàíå íà ñúáèòèå
	public static void optionEvent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nÈçáåðè íà÷èí íà ñúçäàâàíå:\n1 Ñúçäàé ñúñ String\n2 Ñúçäàé ñ ArrayList");

		int a = sc.nextInt();
		if (a == 1) {
			createString();
		} else if (a == 2) {
			createArray();
		} else {
			System.err.println("\nÒàêàâà îïöèÿ íå ñúùåñòâóâà?\nÎïèòàé ïàê:\n");
		}
	}

	//Òúðñåíå íà ñúáèòèå ïî äàòà
	public static void eventOption() {
		Scanner sc = new Scanner(System.in);
		System.out
				.println("Íàìåðè ñúáèòèå ïî äàòà: \n20 " + "Çà ñúáèòèå íà 20.08.2022ã.\n26 Çà ñúáèòèå íà 26.08.2022ã.");
		int b = sc.nextInt();
		switch (b) {
		case 20:
			readyEvent();
			break;
		case 26:
			newEvent();
			break;
		default:
			System.err.println("\nÒàêàâà îïöèÿ íå ñúùåñòâóâà?\nÎïèòàé ïàê:\n");
		}
	}

	//Èçáðàíà îïöèÿ çà èçïúëíåíèå
	public static void chooseEvent(int a) {
		if (a == 1) {
			System.out.println("Ìîëÿ ñúçäàéòå ñúáèòèå: ");
			optionEvent();
		} else if (a == 2) {
			listEvent();
		} else if (a == 3) {
			eventOption();
		} else if (a == 4) {
			availableEvent();
		}
	}

	//Íàëè÷íè îïöèè
	public static void availableEvent() {
		readyEvent();
		newEvent();
	}

	//Ñúçäàâàíå ÷ðåç String
	public static void createString() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Âúâåäåòå èìå: ");
		String name = (sc.nextLine());

		System.out.println("Âúâåäåòå äàòà: ");
		String date = (sc.nextLine());

		System.out.println("Âúâåäåòå íà÷àëåí ÷àñ: ");
		String start = (sc.nextLine());

		System.out.println("Âúâåäåòå êðàåí ÷àñ: ");
		String end = (sc.nextLine());

		System.out.println("Âúâåäåòå îïèñàíèå: ");
		String descript = (sc.nextLine());

		String result = ("\nÈìå: " + name + "\nÄàòà: " + date + "\nÍà÷àëî îò " 
				+ start + "\nÊðàé äî " + end + "\n" + "Îïèñàíèå: " + descript);
		System.out.println(result);
		System.out.println("Óñïåøíî ñúçäàäåíî ñòáèòèå!\n");
	}

	//Ñúçäàäåíî ñúáèòèå 
	public static void readyEvent() {
		ArrayList<String> event = new ArrayList<String>();
		event.add("\nÈìå: Áàíêà 'ÄÑÊ'");
		event.add("Äàòà: 20.08.2022ã.");
		event.add("Íà÷àëî îò: 09.00÷.");
		event.add("Êðàé: äî 10.00÷.");
		event.add("Èíôîðìàöèÿ çà êðåäèò\n");
		for (String i : event) {
			System.out.println(i);
		}
	}

	//Ñúçäàäåíî ñúáèòèå
	public static void newEvent() {
		String name = "Äèãèòàëíî îáùåñòâî";
		String date = "26.08.2022ã";
		String start = "13.00÷.";
		String end = "14.00÷.";
		String descript = "Çàïèñâàíå çà êóðñ";
		String result = ("\nÈìå: " + name + "\nÄàòà: " + date + "\nÍà÷àëî Îò: " + 
				start + "\nÊðàé äî: " + end + "\n" + "Îïèñàíèå: " + descript + "\n");
		System.out.println(result);
	}

	//Ñúçäàäåíà ïðîãðàìà çà äåíÿ
	public static void listEvent() {
		System.out.println("\n===Ïðîãðàìà çà äåíÿ:===");
		ArrayList<String> event = new ArrayList<String>();
		event.add("Îò 08.00÷. äî 09.00÷. 'Ñðåùà ñ åêèïà'");
		event.add("Îò 11.00÷. äî 12.00÷. 'Ïðèåì íà êëèåíò'");
		event.add("Îò 14.00÷. äî 15.00÷. 'Ïðåèíñòàëàöèÿ íà êîìïþòúð'");
		event.add("Îò 16.00÷. äî 17.00÷. 'Îáíîâÿâàíå íà ñàéòà'");
		event.add("Îò 19/00÷. äî 21.00÷. 'Âå÷åðÿ íà îòêðèòî'\n");
		for (String i : event) {
			System.out.println(i);
		}

	}

	//Ñúçäàâàíå ÷ðåç ArrayList
	public static void createArray() {
		
		Scanner sc = new Scanner(System.in);

		ArrayList<String> event = new ArrayList<String>();
		System.out.println("Âúâåäåòå èìå: ");
		event.add(sc.nextLine());
		System.out.println("Âúâåäåòå äàòà: ");
		event.add(sc.nextLine());
		System.out.println("Âúâåäåòå íà÷àëåí ÷àñ: ");
		event.add(sc.nextLine());
		System.out.println("Âúâåäåòå êðàåí ÷àñ: ");
		event.add(sc.nextLine());
		System.out.println("Âúâåäåòå îïèñàíèå: ");
		event.add(sc.nextLine());
		System.out.println();
		
		for (String i : event) {
			System.out.println(i);
		}
		System.out.println("Óñïåøíî ñúçäàäåíî ñòáèòèå!\n");
	}

	//Èçâåæäàíå â êîíçîëàòà
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("  ---ÌÎßÒ ÊÀËÅÍÄÀÐ---");
			System.out.println("  --Èçáåðåòå îïöèÿ:--\n1 Çà ñúçäàâàíå íà ñúáèòèå:\n"
					+ "2 Äíåâåí ãðàôèê:\n3 Òúðñåíå íà ñúáèòèå:\n4 Íàìåðåòå íàëè÷íîñò:\n5 Èçõîä");

			int command = sc.nextInt();

			if (command == 1 || command == 2 || command == 3 || command == 4) {
				chooseEvent(command);
			} else if (command == 5) {
				System.exit(0);
			} else {
				System.err.println("\nÒàêàâà îïöèÿ íå ñúùåñòâóâà?\nÎïèòàé ïàê:\n");
			}
		}
	}
} 
