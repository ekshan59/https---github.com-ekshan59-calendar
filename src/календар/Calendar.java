package calendar;

import java.util.Scanner;

/*
 * 5. Ëè÷åí êàëåíäà
*/

public class Calendar {

	// èçáîð íà îïöèÿ
	public static boolean chooseEvent(int a) {

		if (a == 1) {
			System.out.println("Ìîëÿ ñúçäàéòå ñúáèòèå: ");
			enterName();
		} else if (a == 2) {
			graficList();
		} else if (a == 3) {
			searchEvent();
		} else if (a == 4) {
			arhiveEvent();
		}
		return false;
	}

	private static void enterName() {
		System.out.println("Âúâåäåòå èìå: ");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		String[] nds = text.split("[ ,'-]+");

		System.out.println(nds[0].toString());

		enterDate();
	}

	public static void enterDate() {
		System.out.println("Âúâåäåòå äàòà: ");
		Scanner sc = new Scanner(System.in);

		String date = sc.nextLine();
		String[] dds = date.split("[ ,'-]+");

		System.out.println(dds[0].toString());

		enterStartTime();
	}

	public static void enterStartTime() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Âúâåäåòå íà÷àëåí ÷àñ: ");

		String time = sc.nextLine();
		String[] sds = time.split("[ ,'-]+");

		System.out.println(sds[0].toString());

		enterEndTine();
	}

	public static void enterEndTine() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Âúâåäåòå êðàåí ÷àñ: ");

		String end = sc.nextLine();
		String[] eds = end.split("[ ,'-]+");

		System.out.println(eds[0].toString());

		enterDescription();
	}

	// Îïèñàíèå íà ñúáèòèåòî
	public static void enterDescription() {
		System.out.println("Âúâåäåòå îïèñàíèå: ");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		String[] ds = text.split("[ ,'-]+");

		System.out.println(ds[0].toString());

		System.out.println("Óñïåøíî ñúçäàäåíî ñúáèòèå! \n");

		System.out.println();
		main(ds);
	}

	// ãðàôèê íà ñúáèòèå

	public static void graficList() {

	}

	// òúðñåíå íà ñúáèòèå

	public static void searchEvent() {

	}

	// ñúçäàäåíè ñúáèòèÿ

	public static void arhiveEvent() {
		
	}

	public static void main(String[] args) {

		System.out.println("---ÌÎßÒ ÊÀËÅÍÄÀÐ---");
		System.out.println("--Èçáåðåòå îïöèÿ:--\nÇà ñúçäàâàíå íà ñúáèòèå:  1  \n"
				+ "Äíåâåí ãðàôèê: 2  \nÒúðñåíå íà ñúáèòèå: 3  \nÍàìåðåòå íàëè÷íîñò: 4");

		Scanner sc = new Scanner(System.in);
		int event = sc.nextInt();

		while (event == 1 || event == 2 || event == 3 || event == 4) {
			chooseEvent(event);
		}
		System.out.println("Òàêàâà îïöèÿ íå ñúùåñòâóâà?\nÎïèòàé ïàê:");
		System.out.println();
		main(args);
	}
}
