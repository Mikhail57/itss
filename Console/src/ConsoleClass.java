import java.io.*;
import java.util.*;

public class ConsoleClass {
	public static void main(String[] args) {
		// ��������� ����������� �����-������
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		// �������� ���������
		// ////////////////////////////////////////////////////////////////////

		// ��������� ��� ������������� ���������� � ����� �������� � ����������
		int a = in.nextInt();
		int b = in.nextInt();

		// ��������� ��� ����� �� a �� b ������������, ������� ����
		int i = a;
		while (i <= b) {
			if (i % 3 == 0) {
				out.println(i);

			}
			// ������������� i
			i++;
		}

		// //////////////////////////////////////////////////////////////////////

		// ����������� �����-������ ������������
		in.close();
		out.flush();
		out.close();
	}
}