package calendar;

/*
<<<<<<< HEAD:src/calendar/Calendar.java
 *  Ëè÷åí êàëåíäàð
*/

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
=======
 * 5. Ð›Ð¸Ñ‡ÐµÐ½ ÐºÐ°Ð»ÐµÐ½Ð´Ð°Ñ€
*/

public class Calendar {

	// Ð¸Ð·Ð±Ð¾Ñ€ Ð½Ð° Ð¾Ð¿Ñ†Ð¸Ñ
	public static boolean chooseEvent(int a) {
>>>>>>> fd622c10d9be80a32827d094e7d9943809304c0b:src/ÐºÐ°Ð»ÐµÐ½Ð´Ð°Ñ€/Calendar.java

public class Calendar {
	
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
	
	public static void eventOption() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Íàìåðè ñúáèòèå ïî äàòà: \n20 "
		+ "Çà ñúáèòèå íà 20.08.2022ã.\n26 Çà ñúáèòèå íà 26.08.2022ã.");
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
		
	public static void chooseEvent(int a) {
		if (a == 1) {
<<<<<<< HEAD:src/calendar/Calendar.java
			System.out.println("Ìîëÿ ñúçäàéòå ñúáèòèå: ");
			optionEvent();
=======
			System.out.println("ÐœÐ¾Ð»Ñ ÑÑŠÐ·Ð´Ð°Ð¹Ñ‚Ðµ ÑÑŠÐ±Ð¸Ñ‚Ð¸Ðµ: ");
			enterName();
>>>>>>> fd622c10d9be80a32827d094e7d9943809304c0b:src/ÐºÐ°Ð»ÐµÐ½Ð´Ð°Ñ€/Calendar.java
		} else if (a == 2) {
			listEvent();
		} else if (a == 3) {
			eventOption();
		} else if (a == 4) {
			availableEvent();
		}
	}
<<<<<<< HEAD:src/calendar/Calendar.java
	
	public static void availableEvent() {
		readyEvent();
		newEvent();
	}

	public static void createString() {
=======

	private static void enterName() {
		System.out.println("Ð’ÑŠÐ²ÐµÐ´ÐµÑ‚Ðµ Ð¸Ð¼Ðµ: ");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		String[] nds = text.split("[ ,'-]+");

		System.out.println(nds[0].toString());

		enterDate();
	}

	public static void enterDate() {
		System.out.println("Ð’ÑŠÐ²ÐµÐ´ÐµÑ‚Ðµ Ð´Ð°Ñ‚Ð°: ");
		Scanner sc = new Scanner(System.in);

		String date = sc.nextLine();
		String[] dds = date.split("[ ,'-]+");
>>>>>>> fd622c10d9be80a32827d094e7d9943809304c0b:src/ÐºÐ°Ð»ÐµÐ½Ð´Ð°Ñ€/Calendar.java

		Scanner sc = new Scanner(System.in);

<<<<<<< HEAD:src/calendar/Calendar.java
		System.out.println("Âúâåäåòå èìå: ");
		String name = (sc.nextLine());
=======
		System.out.println("Ð’ÑŠÐ²ÐµÐ´ÐµÑ‚Ðµ Ð½Ð°Ñ‡Ð°Ð»ÐµÐ½ Ñ‡Ð°Ñ: ");

		String time = sc.nextLine();
		String[] sds = time.split("[ ,'-]+");
>>>>>>> fd622c10d9be80a32827d094e7d9943809304c0b:src/ÐºÐ°Ð»ÐµÐ½Ð´Ð°Ñ€/Calendar.java

		System.out.println("Âúâåäåòå äàòà: ");
		String date = (sc.nextLine());

		System.out.println("Âúâåäåòå íà÷àëåí ÷àñ: ");
		String start = (sc.nextLine());

<<<<<<< HEAD:src/calendar/Calendar.java
		System.out.println("Âúâåäåòå êðàåí ÷àñ: ");
		String end = (sc.nextLine());

		System.out.println("Âúâåäåòå îïèñàíèå: ");
		String descript = (sc.nextLine());

		String result = ("\nÈìå: " + name + "\nÄàòà: " + date + "\nÎò " + 
		start + " äî " + end + "\n" + "Îïèñàíèå: " + descript + "\n");
		System.out.println(result);
	}
	
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
=======
	public static void enterEndTine() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ð’ÑŠÐ²ÐµÐ´ÐµÑ‚Ðµ ÐºÑ€Ð°ÐµÐ½ Ñ‡Ð°Ñ: "); 

		String end = sc.nextLine();
		String[] eds = end.split("[ ,'-]+");

		System.out.println(eds[0].toString());

		enterDescription();
	}

	// ÐžÐ¿Ð¸ÑÐ°Ð½Ð¸Ðµ Ð½Ð° ÑÑŠÐ±Ð¸Ñ‚Ð¸ÐµÑ‚Ð¾
	public static void enterDescription() {
		System.out.println("Ð’ÑŠÐ²ÐµÐ´ÐµÑ‚Ðµ Ð¾Ð¿Ð¸ÑÐ°Ð½Ð¸Ðµ: ");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		String[] ds = text.split("[ ,'-]+");

		System.out.println(ds[0].toString());

		System.out.println("Ð£ÑÐ¿ÐµÑˆÐ½Ð¾ ÑÑŠÐ·Ð´Ð°Ð´ÐµÐ½Ð¾ ÑÑŠÐ±Ð¸Ñ‚Ð¸Ðµ! \n");

		System.out.println();
		main(ds);
	}

	// Ð³Ñ€Ð°Ñ„Ð¸Ðº Ð½Ð° ÑÑŠÐ±Ð¸Ñ‚Ð¸Ðµ

	public static void graficList() {

	}

	// Ñ‚ÑŠÑ€ÑÐµÐ½Ðµ Ð½Ð° ÑÑŠÐ±Ð¸Ñ‚Ð¸Ðµ

	public static void searchEvent() {

	}

	// ÑÑŠÐ·Ð´Ð°Ð´ÐµÐ½Ð¸ ÑÑŠÐ±Ð¸Ñ‚Ð¸Ñ

	public static void arhiveEvent() {
>>>>>>> fd622c10d9be80a32827d094e7d9943809304c0b:src/ÐºÐ°Ð»ÐµÐ½Ð´Ð°Ñ€/Calendar.java
		
	}
	
	public static void createArray() {

		Scanner sc = new Scanner(System.in);

<<<<<<< HEAD:src/calendar/Calendar.java
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
		System.out.println();
	}
=======
		System.out.println("---ÐœÐžÐ¯Ð¢ ÐšÐÐ›Ð•ÐÐ”ÐÐ ---");
		System.out.println("--Ð˜Ð·Ð±ÐµÑ€ÐµÑ‚Ðµ Ð¾Ð¿Ñ†Ð¸Ñ:--\nÐ—Ð° ÑÑŠÐ·Ð´Ð°Ð²Ð°Ð½Ðµ Ð½Ð° ÑÑŠÐ±Ð¸Ñ‚Ð¸Ðµ:  1  \n"
				+ "Ð”Ð½ÐµÐ²ÐµÐ½ Ð³Ñ€Ð°Ñ„Ð¸Ðº: 2  \nÐ¢ÑŠÑ€ÑÐµÐ½Ðµ Ð½Ð° ÑÑŠÐ±Ð¸Ñ‚Ð¸Ðµ: 3  \nÐÐ°Ð¼ÐµÑ€ÐµÑ‚Ðµ Ð½Ð°Ð»Ð¸Ñ‡Ð½Ð¾ÑÑ‚: 4");
>>>>>>> fd622c10d9be80a32827d094e7d9943809304c0b:src/ÐºÐ°Ð»ÐµÐ½Ð´Ð°Ñ€/Calendar.java

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
<<<<<<< HEAD:src/calendar/Calendar.java
=======
		System.out.println("Ð¢Ð°ÐºÐ°Ð²Ð° Ð¾Ð¿Ñ†Ð¸Ñ Ð½Ðµ ÑÑŠÑ‰ÐµÑÑ‚Ð²ÑƒÐ²Ð°?\nÐžÐ¿Ð¸Ñ‚Ð°Ð¹ Ð¿Ð°Ðº:");
		System.out.println();
		main(args);
>>>>>>> fd622c10d9be80a32827d094e7d9943809304c0b:src/ÐºÐ°Ð»ÐµÐ½Ð´Ð°Ñ€/Calendar.java
	}
}
