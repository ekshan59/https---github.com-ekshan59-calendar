package calendar;

/*
<<<<<<< HEAD:src/calendar/Calendar.java
 *  ����� ��������
*/

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
=======
 * 5. Личен календар
*/

public class Calendar {

	// избор на опция
	public static boolean chooseEvent(int a) {
>>>>>>> fd622c10d9be80a32827d094e7d9943809304c0b:src/календар/Calendar.java

public class Calendar {
	
	public static void optionEvent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n������ ����� �� ���������:\n1 ������ ��� String\n2 ������ � ArrayList");
		
		int a = sc.nextInt();
		if (a == 1) {
			createString();
		} else if (a == 2) {
			createArray();
		} else {
			System.err.println("\n������ ����� �� ����������?\n������ ���:\n");
		}
	}
	
	public static void eventOption() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ������� �� ����: \n20 "
		+ "�� ������� �� 20.08.2022�.\n26 �� ������� �� 26.08.2022�.");
		int b = sc.nextInt();
		switch (b) {
		  case 20:
			readyEvent();
			break;
		  case 26:
			newEvent();
			break;
			default:
			System.err.println("\n������ ����� �� ����������?\n������ ���:\n");
		}
	}
		
	public static void chooseEvent(int a) {
		if (a == 1) {
<<<<<<< HEAD:src/calendar/Calendar.java
			System.out.println("���� �������� �������: ");
			optionEvent();
=======
			System.out.println("Моля създайте събитие: ");
			enterName();
>>>>>>> fd622c10d9be80a32827d094e7d9943809304c0b:src/календар/Calendar.java
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
>>>>>>> fd622c10d9be80a32827d094e7d9943809304c0b:src/календар/Calendar.java

		Scanner sc = new Scanner(System.in);

<<<<<<< HEAD:src/calendar/Calendar.java
		System.out.println("�������� ���: ");
		String name = (sc.nextLine());
=======
		System.out.println("Въведете начален час: ");

		String time = sc.nextLine();
		String[] sds = time.split("[ ,'-]+");
>>>>>>> fd622c10d9be80a32827d094e7d9943809304c0b:src/календар/Calendar.java

		System.out.println("�������� ����: ");
		String date = (sc.nextLine());

		System.out.println("�������� ������� ���: ");
		String start = (sc.nextLine());

<<<<<<< HEAD:src/calendar/Calendar.java
		System.out.println("�������� ����� ���: ");
		String end = (sc.nextLine());

		System.out.println("�������� ��������: ");
		String descript = (sc.nextLine());

		String result = ("\n���: " + name + "\n����: " + date + "\n�� " + 
		start + " �� " + end + "\n" + "��������: " + descript + "\n");
		System.out.println(result);
	}
	
	public static void readyEvent() {
		ArrayList<String> event = new ArrayList<String>();
		event.add("\n���: ����� '���'");
		event.add("����: 20.08.2022�.");
		event.add("������ ��: 09.00�.");
		event.add("����: �� 10.00�.");
		event.add("���������� �� ������\n");
		for (String i : event) {
		      System.out.println(i);
		    }	
	}
	
	public static void newEvent() {
		String name = "��������� ��������";
		String date = "26.08.2022�";
		String start = "13.00�.";
		String end = "14.00�.";
		String descript = "��������� �� ����";
		String result = ("\n���: " + name + "\n����: " + date + "\n������ ��: " + 
		start + "\n���� ��: " + end + "\n" + "��������: " + descript + "\n");
			System.out.println(result);
	}
	
	public static void listEvent() {
		System.out.println("\n===�������� �� ����:===");
		ArrayList<String> event = new ArrayList<String>();
		event.add("�� 08.00�. �� 09.00�. '����� � �����'");
		event.add("�� 11.00�. �� 12.00�. '����� �� ������'");
		event.add("�� 14.00�. �� 15.00�. '������������� �� ��������'");
		event.add("�� 16.00�. �� 17.00�. '���������� �� �����'");
		event.add("�� 19/00�. �� 21.00�. '������ �� �������'\n");
		for (String i : event) {
		      System.out.println(i);
		    }	
=======
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
>>>>>>> fd622c10d9be80a32827d094e7d9943809304c0b:src/календар/Calendar.java
		
	}
	
	public static void createArray() {

		Scanner sc = new Scanner(System.in);

<<<<<<< HEAD:src/calendar/Calendar.java
		ArrayList<String> event = new ArrayList<String>();
		System.out.println("�������� ���: ");
		event.add(sc.nextLine());
		System.out.println("�������� ����: ");
		event.add(sc.nextLine());
		System.out.println("�������� ������� ���: ");
		event.add(sc.nextLine());
		System.out.println("�������� ����� ���: ");
		event.add(sc.nextLine());
		System.out.println("�������� ��������: ");
		event.add(sc.nextLine());
		System.out.println();
		for (String i : event) {
		      System.out.println(i);
		    }
		System.out.println();
	}
=======
		System.out.println("---МОЯТ КАЛЕНДАР---");
		System.out.println("--Изберете опция:--\nЗа създаване на събитие:  1  \n"
				+ "Дневен график: 2  \nТърсене на събитие: 3  \nНамерете наличност: 4");
>>>>>>> fd622c10d9be80a32827d094e7d9943809304c0b:src/календар/Calendar.java

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("  ---���� ��������---");
			System.out.println("  --�������� �����:--\n1 �� ��������� �� �������:\n"
			+ "2 ������ ������:\n3 ������� �� �������:\n4 �������� ���������:\n5 �����");

			int command = sc.nextInt();

			if (command == 1 || command == 2 || command == 3 || command == 4) {
				chooseEvent(command);
			} else if (command == 5) {
				System.exit(0);
			} else {
				System.err.println("\n������ ����� �� ����������?\n������ ���:\n");
			}
		}
<<<<<<< HEAD:src/calendar/Calendar.java
=======
		System.out.println("Такава опция не съществува?\nОпитай пак:");
		System.out.println();
		main(args);
>>>>>>> fd622c10d9be80a32827d094e7d9943809304c0b:src/календар/Calendar.java
	}
}
