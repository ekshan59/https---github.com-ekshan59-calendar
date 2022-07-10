package calendar;

import java.util.Scanner;

public class Calendar {

<<<<<<< HEAD
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
=======
	//РР·Р±РѕСЂ Р·Р° СЃСЉР·РґР°РІР°РЅРµ РЅР° СЃСЉР±РёС‚РёРµ
	public static void optionEvent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nРР·Р±РµСЂРё РЅР°С‡РёРЅ РЅР° СЃСЉР·РґР°РІР°РЅРµ:\n1 РЎСЉР·РґР°Р№ СЃСЉСЃ String\n2 РЎСЉР·РґР°Р№ СЃ ArrayList");

		int a = sc.nextInt();
		if (a == 1) {
			createString();
		} else if (a == 2) {
			createArray();
		} else {
			System.err.println("\nРўР°РєР°РІР° РѕРїС†РёСЏ РЅРµ СЃСЉС‰РµСЃС‚РІСѓРІР°?\nРћРїРёС‚Р°Р№ РїР°Рє:\n");
		}
	}

	//РўСЉСЂСЃРµРЅРµ РЅР° СЃСЉР±РёС‚РёРµ РїРѕ РґР°С‚Р°
	public static void eventOption() {
		Scanner sc = new Scanner(System.in);
		System.out
				.println("РќР°РјРµСЂРё СЃСЉР±РёС‚РёРµ РїРѕ РґР°С‚Р°: \n20 " + "Р—Р° СЃСЉР±РёС‚РёРµ РЅР° 20.08.2022Рі.\n26 Р—Р° СЃСЉР±РёС‚РёРµ РЅР° 26.08.2022Рі.");
		int b = sc.nextInt();
		switch (b) {
		case 20:
			readyEvent();
			break;
		case 26:
			newEvent();
			break;
		default:
			System.err.println("\nРўР°РєР°РІР° РѕРїС†РёСЏ РЅРµ СЃСЉС‰РµСЃС‚РІСѓРІР°?\nРћРїРёС‚Р°Р№ РїР°Рє:\n");
		}
	}

	//РР·Р±СЂР°РЅР° РѕРїС†РёСЏ Р·Р° РёР·РїСЉР»РЅРµРЅРёРµ
	public static void chooseEvent(int a) {
		if (a == 1) {
			System.out.println("РњРѕР»СЏ СЃСЉР·РґР°Р№С‚Рµ СЃСЉР±РёС‚РёРµ: ");
			optionEvent();
		} else if (a == 2) {
			listEvent();
		} else if (a == 3) {
			eventOption();
		} else if (a == 4) {
			availableEvent();
		}
	}

	//РќР°Р»РёС‡РЅРё РѕРїС†РёРё
	public static void availableEvent() {
		readyEvent();
		newEvent();
	}

	//РЎСЉР·РґР°РІР°РЅРµ С‡СЂРµР· String
	public static void createString() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Р’СЉРІРµРґРµС‚Рµ РёРјРµ: ");
		String name = (sc.nextLine());

		System.out.println("Р’СЉРІРµРґРµС‚Рµ РґР°С‚Р°: ");
		String date = (sc.nextLine());

		System.out.println("Р’СЉРІРµРґРµС‚Рµ РЅР°С‡Р°Р»РµРЅ С‡Р°СЃ: ");
		String start = (sc.nextLine());

		System.out.println("Р’СЉРІРµРґРµС‚Рµ РєСЂР°РµРЅ С‡Р°СЃ: ");
		String end = (sc.nextLine());

		System.out.println("Р’СЉРІРµРґРµС‚Рµ РѕРїРёСЃР°РЅРёРµ: ");
		String descript = (sc.nextLine());

		String result = ("\nРРјРµ: " + name + "\nР”Р°С‚Р°: " + date + "\nРќР°С‡Р°Р»Рѕ РѕС‚ " 
				+ start + "\nРљСЂР°Р№ РґРѕ " + end + "\n" + "РћРїРёСЃР°РЅРёРµ: " + descript);
		System.out.println(result);
		System.out.println("РЈСЃРїРµС€РЅРѕ СЃСЉР·РґР°РґРµРЅРѕ СЃС‚Р±РёС‚РёРµ!\n");
	}

	//РЎСЉР·РґР°РґРµРЅРѕ СЃСЉР±РёС‚РёРµ 
	public static void readyEvent() {
		ArrayList<String> event = new ArrayList<String>();
		event.add("\nРРјРµ: Р‘Р°РЅРєР° 'Р”РЎРљ'");
		event.add("Р”Р°С‚Р°: 20.08.2022Рі.");
		event.add("РќР°С‡Р°Р»Рѕ РѕС‚: 09.00С‡.");
		event.add("РљСЂР°Р№: РґРѕ 10.00С‡.");
		event.add("РРЅС„РѕСЂРјР°С†РёСЏ Р·Р° РєСЂРµРґРёС‚\n");
		for (String i : event) {
			System.out.println(i);
		}
	}

	//РЎСЉР·РґР°РґРµРЅРѕ СЃСЉР±РёС‚РёРµ
	public static void newEvent() {
		String name = "Р”РёРіРёС‚Р°Р»РЅРѕ РѕР±С‰РµСЃС‚РІРѕ";
		String date = "26.08.2022Рі";
		String start = "13.00С‡.";
		String end = "14.00С‡.";
		String descript = "Р—Р°РїРёСЃРІР°РЅРµ Р·Р° РєСѓСЂСЃ";
		String result = ("\nРРјРµ: " + name + "\nР”Р°С‚Р°: " + date + "\nРќР°С‡Р°Р»Рѕ РћС‚: " + 
				start + "\nРљСЂР°Р№ РґРѕ: " + end + "\n" + "РћРїРёСЃР°РЅРёРµ: " + descript + "\n");
		System.out.println(result);
	}

	//РЎСЉР·РґР°РґРµРЅР° РїСЂРѕРіСЂР°РјР° Р·Р° РґРµРЅСЏ
	public static void listEvent() {
		System.out.println("\n===РџСЂРѕРіСЂР°РјР° Р·Р° РґРµРЅСЏ:===");
		ArrayList<String> event = new ArrayList<String>();
		event.add("РћС‚ 08.00С‡. РґРѕ 09.00С‡. 'РЎСЂРµС‰Р° СЃ РµРєРёРїР°'");
		event.add("РћС‚ 11.00С‡. РґРѕ 12.00С‡. 'РџСЂРёРµРј РЅР° РєР»РёРµРЅС‚'");
		event.add("РћС‚ 14.00С‡. РґРѕ 15.00С‡. 'РџСЂРµРёРЅСЃС‚Р°Р»Р°С†РёСЏ РЅР° РєРѕРјРїСЋС‚СЉСЂ'");
		event.add("РћС‚ 16.00С‡. РґРѕ 17.00С‡. 'РћР±РЅРѕРІСЏРІР°РЅРµ РЅР° СЃР°Р№С‚Р°'");
		event.add("РћС‚ 19/00С‡. РґРѕ 21.00С‡. 'Р’РµС‡РµСЂСЏ РЅР° РѕС‚РєСЂРёС‚Рѕ'\n");
		for (String i : event) {
			System.out.println(i);
		}
>>>>>>> b4212022cd694f243fabb2c0695bd10ef59e6edb

		System.out.println("\nИме " + l.name + "\n" + "Дата " + l.day + "." + l.month + "." + l.year + "\n"
				+ "Начало от " + l.start + "." + l.mm + "\n" + "Край до " + l.end + "." + l.mmn + "\n" + "Описание "
				+ l.descript);
	}

<<<<<<< HEAD
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
=======
	//РЎСЉР·РґР°РІР°РЅРµ С‡СЂРµР· ArrayList
	public static void createArray() {
		
		Scanner sc = new Scanner(System.in);

		ArrayList<String> event = new ArrayList<String>();
		System.out.println("Р’СЉРІРµРґРµС‚Рµ РёРјРµ: ");
		event.add(sc.nextLine());
		System.out.println("Р’СЉРІРµРґРµС‚Рµ РґР°С‚Р°: ");
		event.add(sc.nextLine());
		System.out.println("Р’СЉРІРµРґРµС‚Рµ РЅР°С‡Р°Р»РµРЅ С‡Р°СЃ: ");
		event.add(sc.nextLine());
		System.out.println("Р’СЉРІРµРґРµС‚Рµ РєСЂР°РµРЅ С‡Р°СЃ: ");
		event.add(sc.nextLine());
		System.out.println("Р’СЉРІРµРґРµС‚Рµ РѕРїРёСЃР°РЅРёРµ: ");
		event.add(sc.nextLine());
		System.out.println();
		
		for (String i : event) {
			System.out.println(i);
		}
		System.out.println("РЈСЃРїРµС€РЅРѕ СЃСЉР·РґР°РґРµРЅРѕ СЃС‚Р±РёС‚РёРµ!\n");
	}

	//РР·РІРµР¶РґР°РЅРµ РІ РєРѕРЅР·РѕР»Р°С‚Р°
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("  ---РњРћРЇРў РљРђР›Р•РќР”РђР ---");
			System.out.println("  --РР·Р±РµСЂРµС‚Рµ РѕРїС†РёСЏ:--\n1 Р—Р° СЃСЉР·РґР°РІР°РЅРµ РЅР° СЃСЉР±РёС‚РёРµ:\n"
					+ "2 Р”РЅРµРІРµРЅ РіСЂР°С„РёРє:\n3 РўСЉСЂСЃРµРЅРµ РЅР° СЃСЉР±РёС‚РёРµ:\n4 РќР°РјРµСЂРµС‚Рµ РЅР°Р»РёС‡РЅРѕСЃС‚:\n5 РР·С…РѕРґ");
>>>>>>> b4212022cd694f243fabb2c0695bd10ef59e6edb

				System.out.println("Въведете ден: ");
				l.day = sc.nextInt();

			} else {
<<<<<<< HEAD
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
=======
				System.err.println("\nРўР°РєР°РІР° РѕРїС†РёСЏ РЅРµ СЃСЉС‰РµСЃС‚РІСѓРІР°?\nРћРїРёС‚Р°Р№ РїР°Рє:\n");
>>>>>>> b4212022cd694f243fabb2c0695bd10ef59e6edb
			}
		}
	}
}