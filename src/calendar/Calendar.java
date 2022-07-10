package calendar;

import java.util.Scanner;

public class Calendar {

<<<<<<< HEAD
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
=======
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
>>>>>>> b4212022cd694f243fabb2c0695bd10ef59e6edb

		System.out.println("\n��� " + l.name + "\n" + "���� " + l.day + "." + l.month + "." + l.year + "\n"
				+ "������ �� " + l.start + "." + l.mm + "\n" + "���� �� " + l.end + "." + l.mmn + "\n" + "�������� "
				+ l.descript);
	}

<<<<<<< HEAD
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
=======
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
>>>>>>> b4212022cd694f243fabb2c0695bd10ef59e6edb

				System.out.println("�������� ���: ");
				l.day = sc.nextInt();

			} else {
<<<<<<< HEAD
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
=======
				System.err.println("\nТакава опция не съществува?\nОпитай пак:\n");
>>>>>>> b4212022cd694f243fabb2c0695bd10ef59e6edb
			}
		}
	}
}