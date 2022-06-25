package calendar;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Calendar {

	//Избор за създаване на събитие
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

	//Търсене на събитие по дата
	public static void eventOption() {
		Scanner sc = new Scanner(System.in);
		System.out
				.println("Намери събитие по дата: \n20 " + "За събитие на 20.08.2022г.\n26 За събитие на 26.08.2022г.");
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

	//Избрана опция за изпълнение
	public static void chooseEvent(int a) {
		if (a == 1) {
			System.out.println("Моля създайте събитие: ");
			optionEvent();
		} else if (a == 2) {
			listEvent();
		} else if (a == 3) {
			eventOption();
		} else if (a == 4) {
			availableEvent();
		}
	}

	//Налични опции
	public static void availableEvent() {
		readyEvent();
		newEvent();
	}

	//Създаване чрез String
	public static void createString() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Въведете име: ");
		String name = (sc.nextLine());

		System.out.println("Въведете дата: ");
		String date = (sc.nextLine());

		System.out.println("Въведете начален час: ");
		String start = (sc.nextLine());

		System.out.println("Въведете краен час: ");
		String end = (sc.nextLine());

		System.out.println("Въведете описание: ");
		String descript = (sc.nextLine());

		String result = ("\nИме: " + name + "\nДата: " + date + "\nНачало от " 
				+ start + "\nКрай до " + end + "\n" + "Описание: " + descript);
		System.out.println(result);
		System.out.println("Успешно създадено стбитие!\n");
	}

	//Създадено събитие 
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

	//Създадено събитие
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

	//Създадена програма за деня
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

	}

	//Създаване чрез ArrayList
	public static void createArray() {
		
		Scanner sc = new Scanner(System.in);

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
		System.out.println("Успешно създадено стбитие!\n");
	}

	//Извеждане в конзолата
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
	}
}
