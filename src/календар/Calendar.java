package calendar;

/*
<<<<<<< HEAD:src/calendar/Calendar.java
 *  Личен календар
*/

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
=======
 * 5. Р›РёС‡РµРЅ РєР°Р»РµРЅРґР°СЂ
*/

public class Calendar {

	// РёР·Р±РѕСЂ РЅР° РѕРїС†РёСЏ
	public static boolean chooseEvent(int a) {
>>>>>>> fd622c10d9be80a32827d094e7d9943809304c0b:src/РєР°Р»РµРЅРґР°СЂ/Calendar.java

public class Calendar {
	
	public static void optionEvent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nИзбери начин на създаване:\n1 Създай със String\n2 Създай с ArrayList");
		
		int a = sc.nextInt();
		if (a == 1) {
			createString();
		} else if (a == 2) {
			createArray();
		} else {
			System.err.println("\nТакава опция не съществува?\nОпитай пак:\n");
		}
	}
	
	public static void eventOption() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Намери събитие по дата: \n20 "
		+ "За събитие на 20.08.2022г.\n26 За събитие на 26.08.2022г.");
		int b = sc.nextInt();
		switch (b) {
		  case 20:
			readyEvent();
			break;
		  case 26:
			newEvent();
			break;
			default:
			System.err.println("\nТакава опция не съществува?\nОпитай пак:\n");
		}
	}
		
	public static void chooseEvent(int a) {
		if (a == 1) {
<<<<<<< HEAD:src/calendar/Calendar.java
			System.out.println("Моля създайте събитие: ");
			optionEvent();
=======
			System.out.println("РњРѕР»СЏ СЃСЉР·РґР°Р№С‚Рµ СЃСЉР±РёС‚РёРµ: ");
			enterName();
>>>>>>> fd622c10d9be80a32827d094e7d9943809304c0b:src/РєР°Р»РµРЅРґР°СЂ/Calendar.java
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
		System.out.println("Р’СЉРІРµРґРµС‚Рµ РёРјРµ: ");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		String[] nds = text.split("[ ,'-]+");

		System.out.println(nds[0].toString());

		enterDate();
	}

	public static void enterDate() {
		System.out.println("Р’СЉРІРµРґРµС‚Рµ РґР°С‚Р°: ");
		Scanner sc = new Scanner(System.in);

		String date = sc.nextLine();
		String[] dds = date.split("[ ,'-]+");
>>>>>>> fd622c10d9be80a32827d094e7d9943809304c0b:src/РєР°Р»РµРЅРґР°СЂ/Calendar.java

		Scanner sc = new Scanner(System.in);

<<<<<<< HEAD:src/calendar/Calendar.java
		System.out.println("Въведете име: ");
		String name = (sc.nextLine());
=======
		System.out.println("Р’СЉРІРµРґРµС‚Рµ РЅР°С‡Р°Р»РµРЅ С‡Р°СЃ: ");

		String time = sc.nextLine();
		String[] sds = time.split("[ ,'-]+");
>>>>>>> fd622c10d9be80a32827d094e7d9943809304c0b:src/РєР°Р»РµРЅРґР°СЂ/Calendar.java

		System.out.println("Въведете дата: ");
		String date = (sc.nextLine());

		System.out.println("Въведете начален час: ");
		String start = (sc.nextLine());

<<<<<<< HEAD:src/calendar/Calendar.java
		System.out.println("Въведете краен час: ");
		String end = (sc.nextLine());

		System.out.println("Въведете описание: ");
		String descript = (sc.nextLine());

		String result = ("\nИме: " + name + "\nДата: " + date + "\nОт " + 
		start + " до " + end + "\n" + "Описание: " + descript + "\n");
		System.out.println(result);
	}
	
	public static void readyEvent() {
		ArrayList<String> event = new ArrayList<String>();
		event.add("\nИме: Банка 'ДСК'");
		event.add("Дата: 20.08.2022г.");
		event.add("Начало от: 09.00ч.");
		event.add("Край: до 10.00ч.");
		event.add("Информация за кредит\n");
		for (String i : event) {
		      System.out.println(i);
		    }	
	}
	
	public static void newEvent() {
		String name = "Дигитално общество";
		String date = "26.08.2022г";
		String start = "13.00ч.";
		String end = "14.00ч.";
		String descript = "Записване за курс";
		String result = ("\nИме: " + name + "\nДата: " + date + "\nНачало От: " + 
		start + "\nКрай до: " + end + "\n" + "Описание: " + descript + "\n");
			System.out.println(result);
	}
	
	public static void listEvent() {
		System.out.println("\n===Програма за деня:===");
		ArrayList<String> event = new ArrayList<String>();
		event.add("От 08.00ч. до 09.00ч. 'Среща с екипа'");
		event.add("От 11.00ч. до 12.00ч. 'Прием на клиент'");
		event.add("От 14.00ч. до 15.00ч. 'Преинсталация на компютър'");
		event.add("От 16.00ч. до 17.00ч. 'Обновяване на сайта'");
		event.add("От 19/00ч. до 21.00ч. 'Вечеря на открито'\n");
		for (String i : event) {
		      System.out.println(i);
		    }	
=======
	public static void enterEndTine() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Р’СЉРІРµРґРµС‚Рµ РєСЂР°РµРЅ С‡Р°СЃ: ");

		String end = sc.nextLine();
		String[] eds = end.split("[ ,'-]+");

		System.out.println(eds[0].toString());

		enterDescription();
	}

	// РћРїРёСЃР°РЅРёРµ РЅР° СЃСЉР±РёС‚РёРµС‚Рѕ
	public static void enterDescription() {
		System.out.println("Р’СЉРІРµРґРµС‚Рµ РѕРїРёСЃР°РЅРёРµ: ");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		String[] ds = text.split("[ ,'-]+");

		System.out.println(ds[0].toString());

		System.out.println("РЈСЃРїРµС€РЅРѕ СЃСЉР·РґР°РґРµРЅРѕ СЃСЉР±РёС‚РёРµ! \n");

		System.out.println();
		main(ds);
	}

	// РіСЂР°С„РёРє РЅР° СЃСЉР±РёС‚РёРµ

	public static void graficList() {

	}

	// С‚СЉСЂСЃРµРЅРµ РЅР° СЃСЉР±РёС‚РёРµ

	public static void searchEvent() {

	}

	// СЃСЉР·РґР°РґРµРЅРё СЃСЉР±РёС‚РёСЏ

	public static void arhiveEvent() {
>>>>>>> fd622c10d9be80a32827d094e7d9943809304c0b:src/РєР°Р»РµРЅРґР°СЂ/Calendar.java
		
	}
	
	public static void createArray() {

		Scanner sc = new Scanner(System.in);

<<<<<<< HEAD:src/calendar/Calendar.java
		ArrayList<String> event = new ArrayList<String>();
		System.out.println("Въведете име: ");
		event.add(sc.nextLine());
		System.out.println("Въведете дата: ");
		event.add(sc.nextLine());
		System.out.println("Въведете начален час: ");
		event.add(sc.nextLine());
		System.out.println("Въведете краен час: ");
		event.add(sc.nextLine());
		System.out.println("Въведете описание: ");
		event.add(sc.nextLine());
		System.out.println();
		for (String i : event) {
		      System.out.println(i);
		    }
		System.out.println();
	}
=======
		System.out.println("---РњРћРЇРў РљРђР›Р•РќР”РђР ---");
		System.out.println("--РР·Р±РµСЂРµС‚Рµ РѕРїС†РёСЏ:--\nР—Р° СЃСЉР·РґР°РІР°РЅРµ РЅР° СЃСЉР±РёС‚РёРµ:  1  \n"
				+ "Р”РЅРµРІРµРЅ РіСЂР°С„РёРє: 2  \nРўСЉСЂСЃРµРЅРµ РЅР° СЃСЉР±РёС‚РёРµ: 3  \nРќР°РјРµСЂРµС‚Рµ РЅР°Р»РёС‡РЅРѕСЃС‚: 4");
>>>>>>> fd622c10d9be80a32827d094e7d9943809304c0b:src/РєР°Р»РµРЅРґР°СЂ/Calendar.java

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("  ---МОЯТ КАЛЕНДАР---");
			System.out.println("  --Изберете опция:--\n1 За създаване на събитие:\n"
			+ "2 Дневен график:\n3 Търсене на събитие:\n4 Намерете наличност:\n5 Изход");

			int command = sc.nextInt();

			if (command == 1 || command == 2 || command == 3 || command == 4) {
				chooseEvent(command);
			} else if (command == 5) {
				System.exit(0);
			} else {
				System.err.println("\nТакава опция не съществува?\nОпитай пак:\n");
			}
		}
<<<<<<< HEAD:src/calendar/Calendar.java
=======
		System.out.println("РўР°РєР°РІР° РѕРїС†РёСЏ РЅРµ СЃСЉС‰РµСЃС‚РІСѓРІР°?\nРћРїРёС‚Р°Р№ РїР°Рє:");
		System.out.println();
		main(args);
>>>>>>> fd622c10d9be80a32827d094e7d9943809304c0b:src/РєР°Р»РµРЅРґР°СЂ/Calendar.java
	}
}
