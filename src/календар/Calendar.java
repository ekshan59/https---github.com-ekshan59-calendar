package calendar;

import java.util.Scanner;

/*
 * 5. Личен календар
*/

public class Calendar {

	// избор на опция
	public static boolean chooseEvent(int a) {

		if (a == 1) {
			System.out.println("Моля създайте събитие: ");
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
		System.out.println("Въведете име: ");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		String[] nds = text.split("[ ,'-]+");

		System.out.println(nds[0].toString());

		enterDate();
	}

	public static void enterDate() {
		System.out.println("Въведете дата: ");
		Scanner sc = new Scanner(System.in);

		String date = sc.nextLine();
		String[] dds = date.split("[ ,'-]+");

		System.out.println(dds[0].toString());

		enterStartTime();
	}

	public static void enterStartTime() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Въведете начален час: ");

		String time = sc.nextLine();
		String[] sds = time.split("[ ,'-]+");

		System.out.println(sds[0].toString());

		enterEndTine();
	}

	public static void enterEndTine() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете краен час: ");

		String end = sc.nextLine();
		String[] eds = end.split("[ ,'-]+");

		System.out.println(eds[0].toString());

		enterDescription();
	}

	// Описание на събитието
	public static void enterDescription() {
		System.out.println("Въведете описание: ");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		String[] ds = text.split("[ ,'-]+");

		System.out.println(ds[0].toString());

		System.out.println("Успешно създадено събитие! \n");

		System.out.println();
		main(ds);
	}

	// график на събитие

	public static void graficList() {

	}

	// търсене на събитие

	public static void searchEvent() {

	}

	// създадени събития

	public static void arhiveEvent() {
		
	}

	public static void main(String[] args) {

		System.out.println("---МОЯТ КАЛЕНДАР---");
		System.out.println("--Изберете опция:--\nЗа създаване на събитие:  1  \n"
				+ "Дневен график: 2  \nТърсене на събитие: 3  \nНамерете наличност: 4");

		Scanner sc = new Scanner(System.in);
		int event = sc.nextInt();

		while (event == 1 || event == 2 || event == 3 || event == 4) {
			chooseEvent(event);
		}
		System.out.println("Такава опция не съществува?\nОпитай пак:");
		System.out.println();
		main(args);
	}
}
