package calendar;

/*
 *  ����� ��������
*/

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

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
			System.out.println("���� �������� �������: ");
			optionEvent();
		} else if (a == 2) {
			listEvent();
		} else if (a == 3) {
			eventOption();
		} else if (a == 4) {
			availableEvent();
		}
	}
	
	public static void availableEvent() {
		readyEvent();
		newEvent();
	}

	public static void createString() {

		Scanner sc = new Scanner(System.in);

		System.out.println("�������� ���: ");
		String name = (sc.nextLine());

		System.out.println("�������� ����: ");
		String date = (sc.nextLine());

		System.out.println("�������� ������� ���: ");
		String start = (sc.nextLine());

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
		
	}
	
	public static void createArray() {

		Scanner sc = new Scanner(System.in);

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
	}
}
