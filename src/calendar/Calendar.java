package calendar;

import java.util.Scanner;

/*
 * 5. ����� ��������
*/

public class Calendar {

	// ����� �� �����
	public static boolean chooseEvent(int a) {

		if (a == 1) {
			System.out.println("���� �������� �������: ");
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
		System.out.println("�������� ���: ");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		String[] nds = text.split("[ ,'-]+");

		System.out.println(nds[0].toString());

		enterDate();
	}

	public static void enterDate() {
		System.out.println("�������� ����: ");
		Scanner sc = new Scanner(System.in);

		String date = sc.nextLine();
		String[] dds = date.split("[ ,'-]+");

		System.out.println(dds[0].toString());

		enterStartTime();
	}

	public static void enterStartTime() {
		Scanner sc = new Scanner(System.in);

		System.out.println("�������� ������� ���: ");

		String time = sc.nextLine();
		String[] sds = time.split("[ ,'-]+");

		System.out.println(sds[0].toString());

		enterEndTine();
	}

	public static void enterEndTine() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ����� ���: ");

		String end = sc.nextLine();
		String[] eds = end.split("[ ,'-]+");

		System.out.println(eds[0].toString());

		enterDescription();
	}

	// �������� �� ���������
	public static void enterDescription() {
		System.out.println("�������� ��������: ");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		String[] ds = text.split("[ ,'-]+");

		System.out.println(ds[0].toString());

		System.out.println("������� ��������� �������! \n");

		System.out.println();
		main(ds);
	}

	// ������ �� �������

	public static void graficList() {

	}

	// ������� �� �������

	public static void searchEvent() {

	}

	// ��������� �������

	public static void arhiveEvent() {
		
	}

	public static void main(String[] args) {

		System.out.println("---���� ��������---");
		System.out.println("--�������� �����:--\n�� ��������� �� �������:  1  \n"
				+ "������ ������: 2  \n������� �� �������: 3  \n�������� ���������: 4");

		Scanner sc = new Scanner(System.in);
		int event = sc.nextInt();

		while (event == 1 || event == 2 || event == 3 || event == 4) {
			chooseEvent(event);
		}
		System.out.println("������ ����� �� ����������?\n������ ���:");
		System.out.println();
		main(args);
	}
}
