package calendar;

import java.util.Scanner;

import calendar.List;

public class Calendar {

	public static void editingEvent(int num) {
		System.out.println("РЕДАКЦИЯ НА СЪОБЩЕНИЕТО:");
		Scanner sc = new Scanner(System.in);
		System.out.println("1 Редактирай името \n2 Редактирай датата \n3 Редактирай началния час"
				+ "\n4 Редактирай крайния час \n5 Редактирай описанието");
		num = sc.nextInt();
		if (num == 1) {
			eventEnterName(null, num, num, num, num, num, num, num, null, num);
		} else if (num == 2) {
			eventEnterDate(null, num, num, num, num, num, num, num, null, num);
		} else if (num == 3) {
			eventEnterStart(null, num, num, num, num, num, num, num, null, num);
		} else if (num == 4) {
			eventEnterEnd(null, num, num, num, num, num, num, num, null, num);
		} else if (num == 5) {
			eventEnterDescript(null, num, num, num, num, num, num, num, null, num);
		}

	}

	public static void eventEnterName(String name, int day, int month, int year, int start, 
			int mm, int end, int mmn,String des, int num) {
		Scanner sc = new Scanner(System.in);
		if (num == 1) {
			System.out.println("Въведете име: ");
			name = sc.nextLine();
			System.out.println("\nИме: " + name + "\nДата: " + (day - 1) + "." + month + "." + year + "\nНачало от: "
					+ start + "." + mm + "\nКрай до: " + end + "." + mmn + "\n" + "Описание: " + des + "\n");
		}

	}

	public static void eventEnterDate(String name, int day, int month, int year, 
			int start, int mm, int end, int mmn,String des, int num) {
		Scanner sc = new Scanner(System.in);
		if (num == 2) {
			System.out.println("Въведете ден: ");
			day = sc.nextInt();
			System.out.println("Въведете месец: ");
			month = sc.nextInt();
			System.out.println("Въведете година: ");
			year = sc.nextInt();

			// дали годината е високосна
			boolean leapYеar = (year % 4 == 0 && (year % 400 == 0 || year % 100 != 0));
			// валидация на данните
			boolean correctData = true;
			if (day < 0 || day > 31) {
				correctData = false;
			} else if (month < 0 || month > 12) {
				correctData = false;
			} else if (year < 2022 || year > 2023) {// Граница на годината
				correctData = false;
			} else if (day == 29 && month == 2 && !leapYеar) {
				correctData = false;
			}
			int daysInMonth = 31;
			int numOfMonths = 12;
			// ако погледнем броя дни в месеците, виждаме чете са 31 като в четните месеци
			// до 7-мия включително имаме 30дни, а в нечетните от 7-мия нататък пак имаме 30
			// дни
			if ((month % 2 == 0 && month <= 7) || (month % 2 == 1 && month > 7)) {
				daysInMonth = 30;
			}
			// а във февруари имаме 28 или 29 дни
			if (month == 2) {
				daysInMonth = 28;
				if (leapYеar) {
					daysInMonth++;
				}
			}
			day++;
			// увеличаваме месеца като ако дните са минали броя дни в месеца ще получим 1
			// примерно : 32 ден / 31 дена в месеца = 1 и това ще добавим към месеца
			month += day / daysInMonth;
			// ако сме преминали броя дни в месеца с остатък при деление на броя дни ще
			// получим 1-ви ден от новия месец в противен случай деня ще си остане същия
			// примерно 32 ден % 31= 1, т.е. първи ден от новия месец
			day %= daysInMonth;
			// по същия начин процедираме и с годината и месеца
			year += month / numOfMonths;
			month %= numOfMonths;
			if (correctData) {
				
				System.out.println(
						"\nИме: " + name + "\nДата: " + (day - 1) + "." + month + "." + year + "\nНачало от: " + start
								+ "." + mm + "\nКрай до: " + end + "." + mmn + "\n" + "Описание: " + des + "\n");
			} else {
				// ако в кода някъде имаме невалидни данни за въведена дата, то тогава
				// променливата correctData е false.
				System.out.println("\nНевалидна дата");
				System.out.println("Въведи отново\n");
				num = 2;
				eventEnterDate(name, day, month, year, start, mm, end, mmn, des, num);
			}
		}
	}

	public static void eventEnterStart(String name, int day, int month, int year, 
			int start, int mm, int end, int mmn,String des, int num) {
		Scanner sc = new Scanner(System.in);
		if (num == 3) {
			System.out.println("Въведете начален час: ");
			start = sc.nextInt();
			System.out.println("Въведете минути: ");
			mm = sc.nextInt();
		}
		if ((start >= 8 && start <= 17) && (mm >= 0 && mm <= 60)) {
			int start1 = start;
			int mm1 = mm;
			System.out.println("\nИме: " + name + "\nДата: " + (day - 1) + "." + month + "." + year + "\nНачало от: "
					+ start1 + "." + mm1 + "\nКрай до: " + end + "." + mmn + "\n" + "Описание: " + des + "\n");
		} else {
			System.out.println("\nГрешен час \nОпитай отново");
			num = 3;
			eventEnterStart(name, day, month, year, start, mm, end, mmn, des, num);
		}
	}

	public static void eventEnterEnd(String name, int day, int month, int year, 
			int start, int mm, int end, int mmn,String des, int num) {
		Scanner sc = new Scanner(System.in);
		if (num == 4) {
			System.out.println("Въведете краен час: ");
			end = sc.nextInt();
			System.out.println("Въведете минути: ");
			mmn = sc.nextInt();
		}
		if ((end >= 8 && end <= 17) && (mmn >= 0 && mmn <= 60)) {
			int end1 = end;
			int mmn1 = mmn;
			System.out.println("\nИме: " + name + "\nДата: " + (day - 1) + "." + month + "." + year + "\nНачало от: "
					+ start + "." + mm + "\nКрай до: " + end1 + "." + mmn1 + "\n" + "Описание: " + des + "\n");
		} else {
			System.out.println("\nГрешен час \nОпитай отново");
			num = 4;
			eventEnterEnd(name, day, month, year, start, mm, end, mmn, des, num);
		}
	}

	public static void eventEnterDescript(String name, int day, int month, int year, 
			int start, int mm, int end,int mmn, String des, int num) {
		Scanner sc = new Scanner(System.in);

		if (num == 5) {
			System.out.println("Въведете описание: ");
			des = sc.nextLine();
			String des1 = des;
			System.out.println("\nИме: " + name + "\nДата: " + (day - 1) + "." + month + "." + year + "\nНачало от: "
					+ start + "." + mm + "\nКрай до: " + end + "." + mmn + "\n" + "Описание: " + des1 + "\n");
		}
	}

	public static void printArchive(String result) {
		System.out.println("---Налично---");
		String list = new String(result);
		System.out.println(list);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String result = null;
		while (true) {
			System.out.println("  ---МОЯТ КАЛЕНДАР---");
			System.out.println("  --Изберете опция:--\n1 За създаване на събитие:\n"
					+ "2 Редакция на събитието:\n3 Намерете наличност:\n4 Изход");

			int a = sc.nextInt();
			if (a > 0 && a < 4) {
				if (a == 1) {
					System.out.println("Въведете име: ");
					String mn = sc.nextLine();
					String name = sc.nextLine();
					System.out.println("Въведете ден: ");
					int day = sc.nextInt();
					System.out.println("Въведете месец: ");
					int month = sc.nextInt();
					System.out.println("Въведете година: ");
					int year = sc.nextInt();
					// дали годината е високосна
					boolean leapYеar = (year % 4 == 0 && (year % 400 == 0 || year % 100 != 0));
					// валидация на данните
					boolean correctData = true;
					if (day < 0 || day > 31) {
						correctData = false;
					} else if (month < 0 || month > 12) {
						correctData = false;
					} else if (year < 2022 || year > 2023) {// Граница на годината
						correctData = false;
					} else if (day == 29 && month == 2 && !leapYеar) {
						correctData = false;
					}
					int daysInMonth = 31;
					int numOfMonths = 12;
					// ако погледнем броя дни в месеците, виждаме чете са 31 като в четните месеци
					// до 7-мия включително имаме 30дни, а в нечетните от 7-мия нататък пак имаме 30
					// дни
					if ((month % 2 == 0 && month <= 7) || (month % 2 == 1 && month > 7)) {
						daysInMonth = 30;
					}
					// а във февруари имаме 28 или 29 дни
					if (month == 2) {
						daysInMonth = 28;
						if (leapYеar) {
							daysInMonth++;
						}
					}
					day++;
					// увеличаваме месеца като ако дните са минали броя дни в месеца ще получим 1
					// примерно : 32 ден / 31 дена в месеца = 1 и това ще добавим към месеца
					month += day / daysInMonth;
					// ако сме преминали броя дни в месеца с остатък при деление на броя дни ще
					// получим 1-ви ден от новия месец в противен случай деня ще си остане същия
					// примерно 32 ден % 31= 1, т.е. първи ден от новия месец
					day %= daysInMonth;
					// по същия начин процедираме и с годината и месеца
					year += month / numOfMonths;
					month %= numOfMonths;
					if (correctData) {
						// System.out.println("Следващата дата е");
						//System.out.println(
								//"\nИме: " + name + "\nДата: " + (day - 1) + "." + month + "." + year + "\n");
					} else {
						// ако в кода някъде имаме невалидни данни за въведена дата, то тогава
						// променливата correctData е false.
						System.out.println("\nНевалидна дата");
						System.out.println("Въведи отново\n");
						//а = 1;
						//eventEnterDate(name, day, month, year, numOfMonths, numOfMonths, numOfMonths, numOfMonths, name, numOfMonths);
						main(args);
					}
					System.out.println("Въведете начален час: ");
					int start = sc.nextInt();
					System.out.println("Въведете минути: ");
					int mm = sc.nextInt();
					System.out.println("Въведете краен час: ");
					int end = sc.nextInt();
					System.out.println("Въведете минути: ");
					int mmn = sc.nextInt();
					System.out.println("Въведете описание: ");
					mn = sc.nextLine();
					String descript = sc.nextLine();
					
					result = ("\nИме: " + name + "\nДата: " + day + "." + month + "." + year + "\nНачало от: " + start
							+ "." + mm + "\nКрай до: " + end + "." + mmn + "\n" + "Описание: " + descript + "\n");
					System.out.println(result);

				} else if (a == 2) {
					editingEvent(a);
				} else if (a == 3) {
					printArchive(result);
				} else if (a == 4) {
					System.exit(0);
				} else {
					System.err.println("\nТакава опция не съществува?\nОпитай пак:\n");
				}
			}
		}
	}
}
