package calendar;

import java.util.Scanner;

import calendar.List;

public class Calendar {

	// Промяна на името
	public static void changesName(List l) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете име: ");
		l.name = sc.nextLine();

		System.out.println("\nИме " + l.name + "\n" + "Дата " + l.day + "." + l.month + "." + l.year + "\n"
				+ "Начало от " + l.start + "." + l.mm + "\n" + "Край до " + l.end + "." + l.mmn + "\n" + "Описание "
				+ l.descript);
	}

	// Промяна на датата
	public static void changesDate(List l) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете ден: ");
		l.day = sc.nextInt();
		System.out.println("Въведете месец: ");
		l.month = sc.nextInt();
		System.out.println("Въведете година: ");
		l.year = sc.nextInt();

		// дали годината е високосна
		boolean leapYеar = (l.year % 4 == 0 && (l.year % 400 == 0 || l.year % 100 != 0));
		// валидация на данните
		boolean correctData = true;
		if (l.day < 0 || l.day > 31) {
			correctData = false;
		} else if (l.month < 0 || l.month > 12) {
			correctData = false;
		} else if (l.year < 2022 || l.year > 2023) {// Граница на годината
			correctData = false;
		} else if (l.day == 29 && l.month == 2 && !leapYеar) {
			correctData = false;
		}
		int daysInMonth = 31;
		int numOfMonths = 12;
		// ако погледнем броя дни в месеците, виждаме чете са 31 като в четните месеци
		// до 7-мия включително имаме 30дни, а в нечетните от 7-мия нататък пак имаме 30
		// дни
		if ((l.month % 2 == 0 && l.month <= 7) || (l.month % 2 == 1 && l.month > 7)) {
			daysInMonth = 30;
		}
		// а във февруари имаме 28 или 29 дни
		if (l.month == 2) {
			daysInMonth = 28;
			if (leapYеar) {
				daysInMonth++;
			}
		}
		l.day++;
		// увеличаваме месеца като ако дните са минали броя дни в месеца ще получим 1
		// примерно : 32 ден / 31 дена в месеца = 1 и това ще добавим към месеца
		l.month += l.day / daysInMonth;
		// ако сме преминали броя дни в месеца с остатък при деление на броя дни ще
		// получим 1-ви ден от новия месец в противен случай деня ще си остане същия
		// примерно 32 ден % 31= 1, т.е. първи ден от новия месец
		l.day %= daysInMonth;
		// по същия начин процедираме и с годината и месеца
		l.year += l.month / numOfMonths;
		l.month %= numOfMonths;
		if (correctData) {
			System.out.println("Следващата дата е");
			System.out.println("\nИме: " + l.name + "\nДата: " + (l.day - 1) + "." + l.month + "." + l.year
					+ "\nНачало от: " + l.start + "." + l.mm + "\nКрай до: " + l.end + "." + l.mmn + "\n" + "Описание: "
					+ l.descript + "\n");
		} else if (correctData == false) {
			// ако в кода някъде имаме невалидни данни за въведена дата, то тогава
			// променливата correctData е false.
			System.out.println("\nНевалидна дата");
			System.out.println("Въведи отново\n");

			changesDate(l);

		} else {
			// дали годината е високосна
			leapYеar = (l.year % 4 == 0 && (l.year % 400 == 0 || l.year % 100 != 0));
			// валидация на данните
			correctData = true;
			if (l.day < 0 || l.day > 31) {
				correctData = false;
			} else if (l.month < 0 || l.month > 12) {
				correctData = false;
			} else if (l.year < 2022 || l.year > 2023) {// Граница на годината
				correctData = false;
			} else if (l.day == 29 && l.month == 2 && !leapYеar) {
				correctData = false;
			}
			daysInMonth = 31;
			numOfMonths = 12;
			// ако погледнем броя дни в месеците, виждаме чете са 31 като в четните месеци
			// до 7-мия включително имаме 30дни, а в нечетните от 7-мия нататък пак имаме 30
			// дни
			if ((l.month % 2 == 0 && l.month <= 7) || (l.month % 2 == 1 && l.month > 7)) {
				daysInMonth = 30;
			}
			// а във февруари имаме 28 или 29 дни
			if (l.month == 2) {
				daysInMonth = 28;
				if (leapYеar) {
					daysInMonth++;
				}
			}
			l.day++;
			// увеличаваме месеца като ако дните са минали броя дни в месеца ще получим 1
			// примерно : 32 ден / 31 дена в месеца = 1 и това ще добавим към месеца
			l.month += l.day / daysInMonth;
			// ако сме преминали броя дни в месеца с остатък при деление на броя дни ще
			// получим 1-ви ден от новия месец в противен случай деня ще си остане същия
			// примерно 32 ден % 31= 1, т.е. първи ден от новия месец
			l.day %= daysInMonth;
			// по същия начин процедираме и с годината и месеца
			l.year += l.month / numOfMonths;
			l.month %= numOfMonths;
			if (correctData) {
				System.out.println("Следващата дата е");

				System.out.println("\nИме: " + l.name + "\nДата: " + (l.day - 1) + "." + l.month + "." + l.year
						+ "\nНачало от: " + l.start + "." + l.mm + "\nКрай до: " + l.end + "." + l.mmn + "\n"
						+ "Описание: " + l.descript + "\n");

			} else {
				// ако в кода някъде имаме невалидни данни за въведена дата, то тогава
				// променливата correctData е false.
				System.out.println("Невалидна дата");
				System.out.println("Въведи отново\n");
				int num = 2;
				changesDate(l);

			}
		}
	}

	// Промяна на начален час
	public static void changesStart(List l) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете начален час: ");
		l.start = sc.nextInt();
		System.out.println("Въведете минути: ");
		l.mm = sc.nextInt();

		System.out.println("\nИме " + l.name + "\n" + "Дата " + l.day + "." + l.month + "." + l.year + "\n"
				+ "Начало от " + l.start + "." + l.mm + "\n" + "Край до " + l.end + "." + l.mmn + "\n" + "Описание "
				+ l.descript);
	}

	// Промяна на краен час
	public static void changesEnd(List l) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете краен час: ");
		l.end = sc.nextInt();
		System.out.println("Въведете минути: ");
		l.mmn = sc.nextInt();

		System.out.println("\nИме " + l.name + "\n" + "Дата " + l.day + "." + l.month + "." + l.year + "\n"
				+ "Начало от " + l.start + "." + l.mm + "\n" + "Край до " + l.end + "." + l.mmn + "\n" + "Описание "
				+ l.descript);
	}

	// Прпомяна на описанието
	public static void changesDesctipt(List l) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете описание: ");
		l.descript = sc.nextLine();

		System.out.println("\nИме " + l.name + "\n" + "Дата " + l.day + "." + l.month + "." + l.year + "\n"
				+ "Начало от " + l.start + "." + l.mm + "\n" + "Край до " + l.end + "." + l.mmn + "\n" + "Описание "
				+ l.descript);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			List l = new List();
			System.out.println("Въведете име: ");
			l.name = sc.nextLine();
			System.out.println("Въведете ден: ");
			l.day = sc.nextInt();
			System.out.println("Въведете месец: ");
			l.month = sc.nextInt();
			System.out.println("Въведете година: ");
			l.year = sc.nextInt();

			// дали годината е високосна
			boolean leapYеar = (l.year % 4 == 0 && (l.year % 400 == 0 || l.year % 100 != 0));
			// валидация на данните
			boolean correctData = true;
			if (l.day < 0 || l.day > 31) {
				correctData = false;
			} else if (l.month < 0 || l.month > 12) {
				correctData = false;
			} else if (l.year < 2022 || l.year > 2023) {// Граница на годината
				correctData = false;
			} else if (l.day == 29 && l.month == 2 && !leapYеar) {
				correctData = false;
			}
			int daysInMonth = 31;
			int numOfMonths = 12;
			// ако погледнем броя дни в месеците, виждаме чете са 31 като в четните месеци
			// до 7-мия включително имаме 30дни, а в нечетните от 7-мия нататък пак имаме 30
			// дни
			if ((l.month % 2 == 0 && l.month <= 7) || (l.month % 2 == 1 && l.month > 7)) {
				daysInMonth = 30;
			}
			// а във февруари имаме 28 или 29 дни
			if (l.month == 2) {
				daysInMonth = 28;
				if (leapYеar) {
					daysInMonth++;
				}
			}
			l.day++;
			// увеличаваме месеца като ако дните са минали броя дни в месеца ще получим 1
			// примерно : 32 ден / 31 дена в месеца = 1 и това ще добавим към месеца
			l.month += l.day / daysInMonth;
			// ако сме преминали броя дни в месеца с остатък при деление на броя дни ще
			// получим 1-ви ден от новия месец в противен случай деня ще си остане същия
			// примерно 32 ден % 31= 1, т.е. първи ден от новия месец
			l.day %= daysInMonth;
			// по същия начин процедираме и с годината и месеца
			l.year += l.month / numOfMonths;
			l.month %= numOfMonths;
			if (correctData) {
				System.out.println("Следващата дата е");
				System.out.println("\nИме: " + l.name + "\nДата: " + (l.day - 1) + "." + l.month + "." + l.year
						+ "\nНачало от: " + l.start + "." + l.mm + "\nКрай до: " + l.end + "." + l.mmn + "\n"
						+ "Описание: " + l.descript + "\n");
			} else if (correctData == false) {
				// ако в кода някъде имаме невалидни данни за въведена дата, то тогава
				// променливата correctData е false.
				System.out.println("\nНевалидна дата");
				System.out.println("Въведи отново\n");

				System.out.println("Въведете ден: ");
				l.day = sc.nextInt();

			} else {
				// дали годината е високосна
				leapYеar = (l.year % 4 == 0 && (l.year % 400 == 0 || l.year % 100 != 0));
				// валидация на данните
				correctData = true;
				if (l.day < 0 || l.day > 31) {
					correctData = false;
				} else if (l.month < 0 || l.month > 12) {
					correctData = false;
				} else if (l.year < 2022 || l.year > 2023) {// Граница на годината
					correctData = false;
				} else if (l.day == 29 && l.month == 2 && !leapYеar) {
					correctData = false;
				}
				daysInMonth = 31;
				numOfMonths = 12;
				// ако погледнем броя дни в месеците, виждаме чете са 31 като в четните месеци
				// до 7-мия включително имаме 30дни, а в нечетните от 7-мия нататък пак имаме 30
				// дни
				if ((l.month % 2 == 0 && l.month <= 7) || (l.month % 2 == 1 && l.month > 7)) {
					daysInMonth = 30;
				}
				// а във февруари имаме 28 или 29 дни
				if (l.month == 2) {
					daysInMonth = 28;
					if (leapYеar) {
						daysInMonth++;
					}
				}
				l.day++;
				// увеличаваме месеца като ако дните са минали броя дни в месеца ще получим 1
				// примерно : 32 ден / 31 дена в месеца = 1 и това ще добавим към месеца
				l.month += l.day / daysInMonth;
				// ако сме преминали броя дни в месеца с остатък при деление на броя дни ще
				// получим 1-ви ден от новия месец в противен случай деня ще си остане същия
				// примерно 32 ден % 31= 1, т.е. първи ден от новия месец
				l.day %= daysInMonth;
				// по същия начин процедираме и с годината и месеца
				l.year += l.month / numOfMonths;
				l.month %= numOfMonths;
				if (correctData) {
					System.out.println("Следващата дата е");

					System.out.println("\nИме: " + l.name + "\nДата: " + (l.day - 1) + "." + l.month + "." + l.year
							+ "\nНачало от: " + l.start + "." + l.mm + "\nКрай до: " + l.end + "." + l.mmn + "\n"
							+ "Описание: " + l.descript + "\n");

				} else if (correctData == false) {
					// ако в кода някъде имаме невалидни данни за въведена дата, то тогава
					// променливата correctData е false.
					System.out.println("Невалидна дата");
					System.out.println("Въведи отново\n");
					// int num = 2;
					// changesDate(l);
					System.out.println("Въведете ден: ");
					l.day = sc.nextInt();

				} else {

					System.out.println("Въведете начален час: ");
					l.start = sc.nextInt();
					System.out.println("Въведете минути: ");
					l.mm = sc.nextInt();
					System.out.println("Въведете краен час: ");
					l.end = sc.nextInt();
					System.out.println("Въведете минути: ");
					l.mmn = sc.nextInt();
					System.out.println("Въведете описание: ");
					l.descript = sc.nextLine();
					l.descript = sc.nextLine();

					System.out.println("\nИме " + l.name + "\n" + "Дата " + l.day + "." + l.month + "." + l.year + "\n"
							+ "Начало от " + l.start + "." + l.mm + "\n" + "Край до " + l.end + "." + l.mmn + "\n"
							+ "Описание " + l.descript);

					// main(args);
					// changesName(l);
				}
			}
		}
	}
}
