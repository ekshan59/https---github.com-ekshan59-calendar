package calendar;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

/*
 * 5. ����� ��������
�� �� ������ ���������� ��������, ����������� ������������� �������, 
����� �������� ����� ��������. ���������� �� �������� ������� �������� �����,
���������� ������ ������������ ����� �� �������� ��������:

� ���������/��������� �� ��� �� �����. ������� �� ������ �� ����� (���, ���),
���� �� �����, ��� (������ �������� - �������� "���������) � ��������
� ����������� �� ������ ��������, ���� �� ����� ��� �� ������� ������������
������ � ������ ����������� �� ����
� ������� �� ���� �/��� ������� �� ����� �� ���, ���� �� ������ 
���������� ���������� �� ���������
� ������� �� �����: �� ��� �� �������� ���������� ����� �� �������
� �������� �� �������� ����� �� �����: �� ������ ������� ���� �
������ ��������������� �� ������� ����� ����, �� ����� � �������� �� �� ������ 
������ �����, �� ���� � ������� ��� � �� ����� 8 ���� �������� ��� ���� 5 ���� �������.
� �������� �� �������� ����� �� ����� �� ������ ������� ����, ������ ��������������� �� 
������� ����� ���� �� ��������� �� ������ �����, �� ���� � ������� ��� � �� ����� 
8 ���� �������� ��� ���� 5 ���� �������

������:
<< 1
�������� ��� �� ���������:
<< ������ �� Java
�������� ���� �� ���������:
<< 17.06.2021�
�������� ������� ���:
<< 18:00�
�������� ������� ���:
<< 20:00�
�������� �������:
<< �� ���� ������ �� ��� �������� ������
��������� ���� ��������� �������!

����, �������� ����� �� ������� (1 - ��������� �� ������� | 2 - ������ ������ | 3 - ������� �� ������� | 4 - �������� ���������)
<< 2
�������� ����:
<< 10.06.2021�
� 8:00 - 9:00 �����: ������
� 10:30 - 11:00 ��������� ����� �� �����
� 12:00 - 13:00 ������ �������: � ���� ������
� 16:00 - 17:00 ���������� ���������: ��������� �� ��������� �� ���������� �������

����, �������� ����� �� ������� (1 - �������� ������� |
2 - ������ ������ | 3 - ������� �� ������� | 4 - �������� ���������)
<< 3
�������� �������� �� ���������:
<<���������
25.05.2021 15:30 - 16:30 ��� ���������: ������� �� ������ � ������
������ �� �� �������� ��� ����������� ������� (1 - ����� |
2 - ����������� | ��������� ����� ���� ������, �� �� ����������)
<< 1
������� �� ���, �� ������ �� �������� ��������� 25.05.2021 15:30 - 16:30
��� ����������: ������� �� ������ � ������? (�� / ��)
<< ��
��������� ���� ��������

����, �������� ����� �� ������� (1 - �������� ������� |
2 - ������ ������ | 3 - ������� �� ������� | 4 - �������� ���������)
<<4
�������� ����:
<< 20.06.2020�
�� �����:
<< 13:00�
�������� ���������������:
<< 2
�������� ���� �� ���������: 20.06.2020 14:30�
*/

public class Calendar {
	// ����� �� �����
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

	// ��������� �� �������
	public static void createEvent() {
		BufferedReader br = null;
		try {

			File file = new File("arhive.txt");

			if (!file.exists())
				file.createNewFile();

			PrintWriter pw = new PrintWriter(file);
			pw.println("�����");
			pw.println("����������");
			pw.println("��� ����");
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

	// ���������� �� �������
	public static void removeEvent() {

	}

	// ��������� �������
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
		
			
			  System.out.println("---���� ��������---"); 
			  Scanner sc = new Scanner(System.in);
			  System.out.println("--�������� �����:--\n�� ��������� �� �������:  1  \n" +
			  "�� ���������� �� �������: 2  \n������ ��������� �������: 3");
			  
			  int event = sc.nextInt(); 
			  if (event == 1 || event == 2 || event == 3) {
			  chooseEvent(event); 
			  } else {
			  System.out.println("������ ����� �� ����������?\n������ ���:");
			  System.out.println(); 
			  main(args); 
			  } sc.close();
			
	}
}
