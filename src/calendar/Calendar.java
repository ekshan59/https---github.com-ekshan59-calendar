package calendar;

import java.util.Scanner;

public class Calendar {

	// ������� �� �����
	public static void changesName(List l) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ���: ");
		l.name = sc.nextLine();

		System.out.println("\n��� " + l.name + "\n" + "���� " + l.day + "." + l.month + "." + l.year + "\n"
				+ "������ �� " + l.start + "." + l.mm + "\n" + "���� �� " + l.end + "." + l.mmn + "\n" + "�������� "
				+ l.descript);
	}

	// ������� �� ������
	public static void changesDate(List l) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ���: ");
		l.day = sc.nextInt();
		System.out.println("�������� �����: ");
		l.month = sc.nextInt();
		System.out.println("�������� ������: ");
		l.year = sc.nextInt();

		// ���� �������� � ���������
		boolean leapY�ar = (l.year % 4 == 0 && (l.year % 400 == 0 || l.year % 100 != 0));
		// ��������� �� �������
		boolean correctData = true;
		if (l.day < 0 || l.day > 31) {
			correctData = false;
		} else if (l.month < 0 || l.month > 12) {
			correctData = false;
		} else if (l.year < 2022 || l.year > 2023) {// ������� �� ��������
			correctData = false;
		} else if (l.day == 29 && l.month == 2 && !leapY�ar) {
			correctData = false;
		}
		int daysInMonth = 31;
		int numOfMonths = 12;
		// ��� ��������� ���� ��� � ��������, ������� ���� �� 31 ���� � ������� ������
		// �� 7-��� ����������� ����� 30���, � � ��������� �� 7-��� ������� ��� ����� 30
		// ���
		if ((l.month % 2 == 0 && l.month <= 7) || (l.month % 2 == 1 && l.month > 7)) {
			daysInMonth = 30;
		}
		// � ��� �������� ����� 28 ��� 29 ���
		if (l.month == 2) {
			daysInMonth = 28;
			if (leapY�ar) {
				daysInMonth++;
			}
		}
		l.day++;
		// ����������� ������ ���� ��� ����� �� ������ ���� ��� � ������ �� ������� 1
		// �������� : 32 ��� / 31 ���� � ������ = 1 � ���� �� ������� ��� ������
		l.month += l.day / daysInMonth;
		// ��� ��� ��������� ���� ��� � ������ � ������� ��� ������� �� ���� ��� ��
		// ������� 1-�� ��� �� ����� ����� � �������� ������ ���� �� �� ������ �����
		// �������� 32 ��� % 31= 1, �.�. ����� ��� �� ����� �����
		l.day %= daysInMonth;
		// �� ����� ����� ����������� � � �������� � ������
		l.year += l.month / numOfMonths;
		l.month %= numOfMonths;
		if (correctData) {
			System.out.println("���������� ���� �");
			System.out.println("\n���: " + l.name + "\n����: " + (l.day - 1) + "." + l.month + "." + l.year
					+ "\n������ ��: " + l.start + "." + l.mm + "\n���� ��: " + l.end + "." + l.mmn + "\n" + "��������: "
					+ l.descript + "\n");
		} else if (correctData == false) {
			// ��� � ���� ������ ����� ��������� ����� �� �������� ����, �� ������
			// ������������ correctData � false.
			System.out.println("\n��������� ����");
			System.out.println("������ ������\n");

			changesDate(l);

		} else {
			// ���� �������� � ���������
			leapY�ar = (l.year % 4 == 0 && (l.year % 400 == 0 || l.year % 100 != 0));
			// ��������� �� �������
			correctData = true;
			if (l.day < 0 || l.day > 31) {
				correctData = false;
			} else if (l.month < 0 || l.month > 12) {
				correctData = false;
			} else if (l.year < 2022 || l.year > 2023) {// ������� �� ��������
				correctData = false;
			} else if (l.day == 29 && l.month == 2 && !leapY�ar) {
				correctData = false;
			}
			daysInMonth = 31;
			numOfMonths = 12;
			// ��� ��������� ���� ��� � ��������, ������� ���� �� 31 ���� � ������� ������
			// �� 7-��� ����������� ����� 30���, � � ��������� �� 7-��� ������� ��� ����� 30
			// ���
			if ((l.month % 2 == 0 && l.month <= 7) || (l.month % 2 == 1 && l.month > 7)) {
				daysInMonth = 30;
			}
			// � ��� �������� ����� 28 ��� 29 ���
			if (l.month == 2) {
				daysInMonth = 28;
				if (leapY�ar) {
					daysInMonth++;
				}
			}
			l.day++;
			// ����������� ������ ���� ��� ����� �� ������ ���� ��� � ������ �� ������� 1
			// �������� : 32 ��� / 31 ���� � ������ = 1 � ���� �� ������� ��� ������
			l.month += l.day / daysInMonth;
			// ��� ��� ��������� ���� ��� � ������ � ������� ��� ������� �� ���� ��� ��
			// ������� 1-�� ��� �� ����� ����� � �������� ������ ���� �� �� ������ �����
			// �������� 32 ��� % 31= 1, �.�. ����� ��� �� ����� �����
			l.day %= daysInMonth;
			// �� ����� ����� ����������� � � �������� � ������
			l.year += l.month / numOfMonths;
			l.month %= numOfMonths;
			if (correctData) {
				System.out.println("���������� ���� �");

				System.out.println("\n���: " + l.name + "\n����: " + (l.day - 1) + "." + l.month + "." + l.year
						+ "\n������ ��: " + l.start + "." + l.mm + "\n���� ��: " + l.end + "." + l.mmn + "\n"
						+ "��������: " + l.descript + "\n");

			} else {
				// ��� � ���� ������ ����� ��������� ����� �� �������� ����, �� ������
				// ������������ correctData � false.
				System.out.println("��������� ����");
				System.out.println("������ ������\n");
				int num = 2;
				changesDate(l);

			}
		}
	}

	// ������� �� ������� ���
	public static void changesStart(List l) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ������� ���: ");
		l.start = sc.nextInt();
		System.out.println("�������� ������: ");
		l.mm = sc.nextInt();

		System.out.println("\n��� " + l.name + "\n" + "���� " + l.day + "." + l.month + "." + l.year + "\n"
				+ "������ �� " + l.start + "." + l.mm + "\n" + "���� �� " + l.end + "." + l.mmn + "\n" + "�������� "
				+ l.descript);
	}

	// ������� �� ����� ���
	public static void changesEnd(List l) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ����� ���: ");
		l.end = sc.nextInt();
		System.out.println("�������� ������: ");
		l.mmn = sc.nextInt();

		System.out.println("\n��� " + l.name + "\n" + "���� " + l.day + "." + l.month + "." + l.year + "\n"
				+ "������ �� " + l.start + "." + l.mm + "\n" + "���� �� " + l.end + "." + l.mmn + "\n" + "�������� "
				+ l.descript);
	}

	// �������� �� ����������
	public static void changesDesctipt(List l) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ��������: ");
		l.descript = sc.nextLine();

		System.out.println("\n��� " + l.name + "\n" + "���� " + l.day + "." + l.month + "." + l.year + "\n"
				+ "������ �� " + l.start + "." + l.mm + "\n" + "���� �� " + l.end + "." + l.mmn + "\n" + "�������� "
				+ l.descript);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			List l = new List();
			System.out.println("�������� ���: ");
			l.name = sc.nextLine();
			System.out.println("�������� ���: ");
			l.day = sc.nextInt();
			System.out.println("�������� �����: ");
			l.month = sc.nextInt();
			System.out.println("�������� ������: ");
			l.year = sc.nextInt();

			// ���� �������� � ���������
			boolean leapY�ar = (l.year % 4 == 0 && (l.year % 400 == 0 || l.year % 100 != 0));
			// ��������� �� �������
			boolean correctData = true;
			if (l.day < 0 || l.day > 31) {
				correctData = false;
			} else if (l.month < 0 || l.month > 12) {
				correctData = false;
			} else if (l.year < 2022 || l.year > 2023) {// ������� �� ��������
				correctData = false;
			} else if (l.day == 29 && l.month == 2 && !leapY�ar) {
				correctData = false;
			}
			int daysInMonth = 31;
			int numOfMonths = 12;
			// ��� ��������� ���� ��� � ��������, ������� ���� �� 31 ���� � ������� ������
			// �� 7-��� ����������� ����� 30���, � � ��������� �� 7-��� ������� ��� ����� 30
			// ���
			if ((l.month % 2 == 0 && l.month <= 7) || (l.month % 2 == 1 && l.month > 7)) {
				daysInMonth = 30;
			}
			// � ��� �������� ����� 28 ��� 29 ���
			if (l.month == 2) {
				daysInMonth = 28;
				if (leapY�ar) {
					daysInMonth++;
				}
			}
			l.day++;
			// ����������� ������ ���� ��� ����� �� ������ ���� ��� � ������ �� ������� 1
			// �������� : 32 ��� / 31 ���� � ������ = 1 � ���� �� ������� ��� ������
			l.month += l.day / daysInMonth;
			// ��� ��� ��������� ���� ��� � ������ � ������� ��� ������� �� ���� ��� ��
			// ������� 1-�� ��� �� ����� ����� � �������� ������ ���� �� �� ������ �����
			// �������� 32 ��� % 31= 1, �.�. ����� ��� �� ����� �����
			l.day %= daysInMonth;
			// �� ����� ����� ����������� � � �������� � ������
			l.year += l.month / numOfMonths;
			l.month %= numOfMonths;
			if (correctData) {
				System.out.println("���������� ���� �");
				System.out.println("\n���: " + l.name + "\n����: " + (l.day - 1) + "." + l.month + "." + l.year
						+ "\n������ ��: " + l.start + "." + l.mm + "\n���� ��: " + l.end + "." + l.mmn + "\n"
						+ "��������: " + l.descript + "\n");
			} else if (correctData == false) {
				// ��� � ���� ������ ����� ��������� ����� �� �������� ����, �� ������
				// ������������ correctData � false.
				System.out.println("\n��������� ����");
				System.out.println("������ ������\n");

				System.out.println("�������� ���: ");
				l.day = sc.nextInt();

			} else {
				// ���� �������� � ���������
				leapY�ar = (l.year % 4 == 0 && (l.year % 400 == 0 || l.year % 100 != 0));
				// ��������� �� �������
				correctData = true;
				if (l.day < 0 || l.day > 31) {
					correctData = false;
				} else if (l.month < 0 || l.month > 12) {
					correctData = false;
				} else if (l.year < 2022 || l.year > 2023) {// ������� �� ��������
					correctData = false;
				} else if (l.day == 29 && l.month == 2 && !leapY�ar) {
					correctData = false;
				}
				daysInMonth = 31;
				numOfMonths = 12;
				// ��� ��������� ���� ��� � ��������, ������� ���� �� 31 ���� � ������� ������
				// �� 7-��� ����������� ����� 30���, � � ��������� �� 7-��� ������� ��� ����� 30
				// ���
				if ((l.month % 2 == 0 && l.month <= 7) || (l.month % 2 == 1 && l.month > 7)) {
					daysInMonth = 30;
				}
				// � ��� �������� ����� 28 ��� 29 ���
				if (l.month == 2) {
					daysInMonth = 28;
					if (leapY�ar) {
						daysInMonth++;
					}
				}
				l.day++;
				// ����������� ������ ���� ��� ����� �� ������ ���� ��� � ������ �� ������� 1
				// �������� : 32 ��� / 31 ���� � ������ = 1 � ���� �� ������� ��� ������
				l.month += l.day / daysInMonth;
				// ��� ��� ��������� ���� ��� � ������ � ������� ��� ������� �� ���� ��� ��
				// ������� 1-�� ��� �� ����� ����� � �������� ������ ���� �� �� ������ �����
				// �������� 32 ��� % 31= 1, �.�. ����� ��� �� ����� �����
				l.day %= daysInMonth;
				// �� ����� ����� ����������� � � �������� � ������
				l.year += l.month / numOfMonths;
				l.month %= numOfMonths;
				if (correctData) {
					System.out.println("���������� ���� �");

					System.out.println("\n���: " + l.name + "\n����: " + (l.day - 1) + "." + l.month + "." + l.year
							+ "\n������ ��: " + l.start + "." + l.mm + "\n���� ��: " + l.end + "." + l.mmn + "\n"
							+ "��������: " + l.descript + "\n");

				} else if (correctData == false) {
					// ��� � ���� ������ ����� ��������� ����� �� �������� ����, �� ������
					// ������������ correctData � false.
					System.out.println("��������� ����");
					System.out.println("������ ������\n");
					// int num = 2;
					// changesDate(l);
					System.out.println("�������� ���: ");
					l.day = sc.nextInt();

				} else {

					System.out.println("�������� ������� ���: ");
					l.start = sc.nextInt();
					System.out.println("�������� ������: ");
					l.mm = sc.nextInt();
					System.out.println("�������� ����� ���: ");
					l.end = sc.nextInt();
					System.out.println("�������� ������: ");
					l.mmn = sc.nextInt();
					System.out.println("�������� ��������: ");
					l.descript = sc.nextLine();
					l.descript = sc.nextLine();

					System.out.println("\n��� " + l.name + "\n" + "���� " + l.day + "." + l.month + "." + l.year + "\n"
							+ "������ �� " + l.start + "." + l.mm + "\n" + "���� �� " + l.end + "." + l.mmn + "\n"
							+ "�������� " + l.descript);

					// main(args);
					// changesName(l);
				}
			}
		}
	}
}