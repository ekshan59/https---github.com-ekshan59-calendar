package calendar;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

/*
 * 5. Личен календар
Да се напише компютърна програма, реализираща информационна система, 
която поддържа личен календар. Програмата да поддържа текстов диалогов режим,
позволяващ удобен интерактивен избор на следните операции:

• запазване/отказване на час за среща. Записва се начало на среща (ден, час),
край на среща, име (кратко описание - например "зъболекар”) и коментар
• отпечатване на дневна програма, като по даден ден се извежда хронологичен
списък с всички ангажименти за деня
• промяна на часа и/или мястото на среща по име, като се запази 
останалата информация за събитието
• търсене на среща: по име се извеждат останалите данни се срещата
• намиране на свободно място за среща: по дадена начална дата и
желана продължителност на срещата търси дата, на която е възможно да се запази 
такава среща, но само в работни дни и не преди 8 часа сутринта или след 5 часа вечерта.
• намиране на свободно място за среща  по дадена начална дата, желана продължителност на 
срещата търси дата за запазване на такава среща, но само в работни дни и не преди 
8 часа сутринта или след 5 часа вечерта

Пример:
<< 1
Въведете име на събитието:
<< Лекция по Java
Въведете дата на събитието:
<< 17.06.2021г
Въведете начален час:
<< 18:00ч
Въведете крайния час:
<< 20:00ч
Въведете бележки:
<< На тази лекция ще има проектна задача
Събитието беше създадено успешно!

Моля, изберете какво да правите (1 - Създаване на събитие | 2 - Дневен график | 3 - Търсене на събитие | 4 - Намерете наличност)
<< 2
Въведете дата:
<< 10.06.2021г
• 8:00 - 9:00 Спорт: бягане
• 10:30 - 11:00 Ежедневна среща на екипа
• 12:00 - 13:00 Обедна почивка: в Пица Милеви
• 16:00 - 17:00 Техническо планиране: планиране на пускането на следващите функции

Моля, изберете какво да правите (1 - Създайте събитие |
2 - Дневен график | 3 - Търсене на събитие | 4 - Намерете наличност)
<< 3
Въведете заглавие на събитието:
<<Зъболекар
25.05.2021 15:30 - 16:30 При зъболекар: Оправям ми зъбите с кариес
Искате ли да отмените или редактирате събитие (1 - Отказ |
2 - Редактиране | натиснете всеки друг клавиш, за да продължите)
<< 1
Сигурни ли сте, че искате да отмените събитието 25.05.2021 15:30 - 16:30
При зъболекаря: Оправям си зъбите с кариес? (Да / Да)
<< Да
Събитието беше отменено

Моля, изберете какво да правите (1 - Създайте събитие |
2 - Дневен график | 3 - Търсене на събитие | 4 - Намерете наличност)
<<4
Въведете дата:
<< 20.06.2020г
От време:
<< 13:00ч
Въведете продължителност:
<< 2
Свободен слот за събитието: 20.06.2020 14:30ч
*/

public class Calendar {
	// избор на опция
	public static void chooseEvent(int a) throws IOException {

		switch (a) {
		case 1:
			createEvent();
			break;
		case 2:
			removeEvent();
			break;
		case 3:
			arhiveEvent();
			break;
		}
	} 
	
	public static void enterName() throws FileNotFoundException {
		File file = new File("arhive.txt");
		PrintWriter pw = new PrintWriter(file);
		pw.println("Nomer");
		pw.close();
	}
	
	public static void enterDate() {
		
	}
	
	public static void enterStartTime() {
		
	}
	
	public static void enterEndTine() {
		
	}
	
	public static void enterDescription() {
		
	}

	// създаване на събитие
	public static void createEvent() {
		BufferedReader br = null;
		try {

			File file = new File("arhive.txt");

			if (!file.exists())
				file.createNewFile();

			PrintWriter pw = new PrintWriter(file);
			pw.println("Хотел");
			pw.println("Резервация");
			pw.println("Три дена");
			pw.close();

			br = new BufferedReader(new FileReader("arhive.txt"));
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			System.out.println("error: " + e);
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				System.out.println("error: " + e);
			}
			
		}
	}

	// премахване на събитие
	public static void removeEvent() {

	}

	// създадени събития
	public static void arhiveEvent() throws IOException {
		BufferedReader br = null;
		br = new BufferedReader(new FileReader("arhive.txt"));
		String line;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();
		
	}

	public static void main(String[] args) throws IOException {
		
			
			  System.out.println("---МОЯТ КАЛЕНДАР---"); 
			  Scanner sc = new Scanner(System.in);
			  System.out.println("--Изберете опция:--\nЗа създаване на събитие:  1  \n" +
			  "За премахване на събитие: 2  \nВашите създадени събития: 3");
			  
			  int event = sc.nextInt(); 
			  if (event == 1 || event == 2 || event == 3) {
			  chooseEvent(event); 
			  } else {
			  System.out.println("Такава опция не съществува?\nОпитай пак:");
			  System.out.println(); 
			  main(args); 
			  } sc.close();
			
	}
}
