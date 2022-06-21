package calendar;

import java.io.*;
import java.util.Scanner;

/*
 * 5. ����� ��������
*/

public class Calendar {
	// ����� �� �����
	public static void chooseEvent(int a) {

		if (a == 1) {
			enterName();
		} else if (a == 2) {
			removeEvent();
		} else if (a == 3) {
			arhiveEvent();
		}

		/*
		 * switch (a) { case 1: enterName(); break; case 2: removeEvent(); break; case
		 * 3: arhiveEvent(); break; }
		 */
	}

	public static void myScanner() {
		Scanner sc = new Scanner(System.in);
		PrintStream pw = null;
		pw.println(sc.next());
		//sc.close();
		//pw.close();
	}

	public static void enterName() {
		System.out.println("�������� ���: ");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		String[] words = text.split("[ ,'-]+");
		
		System.out.println(words.toString());
		sc.close();	
	}

	public static void enterDate() {
		System.out.println("�������� ����: ");
		createEvent();
		// enterStartTime();
	}

	public static void enterStartTime() {
		Scanner sc = new Scanner(System.in);

		System.out.println("�������� ����: ");

		try {
			File file = new File("arhive.txt");
			PrintWriter pw = new PrintWriter(file);
			pw.println(sc.next());
			pw.close();
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void enterEndTine() {

	}

	// �������� �� ���������
	public static void enterDescription() {
		/*
		 * System.out.println("�������� ��������: "); Scanner sc = new
		 * Scanner(System.in);
		 * 
		 * BufferedReader br = null; try { File file = new File("arhive.txt"); if
		 * (!file.exists()) file.createNewFile(); PrintWriter pw = new
		 * PrintWriter(file); pw.println(sc.next()); pw.println("����������");
		 * pw.close(); sc.close();
		 * 
		 * br = new BufferedReader(new FileReader("arhive.txt")); String line; while
		 * ((line = br.readLine()) != null) { System.out.println(line); } } catch
		 * (IOException e) { System.out.println("error: " + e); } finally { try {
		 * br.close(); } catch (IOException e) { System.out.println("error: " + e); }
		 * 
		 * }
		 */
	}

	// ��������� �� �������
	public static void createEvent() {
		System.out.println("�������� ���: ");
		Scanner sc = new Scanner(System.in);
		// BufferedReader br = null;
		PrintWriter pw;

		File file = new File("arhive.txt");

		if (!file.exists())
			try {
				file.createNewFile();
			} catch (IOException e) {
				
				e.printStackTrace();
			}

		try {
			pw = new PrintWriter(file);
			pw.println(sc.next());

			System.out.println("�������� ����: ");
			pw.println(sc.next());

			System.out.println("�������� ������� ���: ");
			pw.println(sc.next());

			System.out.println("�������� ����� ���: ");
			pw.println(sc.next());

			System.out.println("�������� ��������: ");
			pw.println(sc.next());

			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		sc.close();
		//System.out.print("�������: ", arhiveEvent());

		/*
		 * br = new BufferedReader(new FileReader("arhive.txt")); String line; while
		 * ((line = br.readLine()) != null) { System.out.println(line); } } catch
		 * (IOException e) { System.out.println("error: " + e); } finally { try {
		 * br.close(); } catch (IOException e) { System.out.println("error: " + e); }
		 * 
		 * }
		 */
	}

	// ���������� �� �������
	public static void removeEvent() {

	}

	// ��������� �������
	public static void arhiveEvent() {

		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader("arhive.txt"));
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		String line;

		try {
			while ((line = br.readLine()) != null) {
				System.out.println(line);

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		System.out.println("---���� ��������---");
		System.out.println("--�������� �����:--\n�� ��������� �� �������:  1  \n"
				+ "�� ���������� �� �������: 2  \n������ ��������� �������: 3");

		Scanner sc = new Scanner(System.in);

		int event = sc.nextInt();

		if (event == 1 || event == 2 || event == 3) {
			chooseEvent(event);
		} else {
			System.out.println("������ ����� �� ����������?\n������ ���:");
			System.out.println();
			main(args);
		}

		sc.close();

	}
}
