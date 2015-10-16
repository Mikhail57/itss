import java.io.*;
import java.util.*;

public class ConsoleClass {
	public static void main(String[] args) {
		// создаются инструменты ввода-вывода
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		// ОСНОВНАЯ ПРОГРАММА
		// ////////////////////////////////////////////////////////////////////

		// заводятся две целочисленные переменные и сразу читаются с клавиатуры
		int a = in.nextInt();
		int b = in.nextInt();

		// выводятся все числа от a до b включительно, кратные трем
		int i = a;
		while (i <= b) {
			if (i % 3 == 0) {
				out.println(i);

			}
			// увеличивается i
			i++;
		}

		// //////////////////////////////////////////////////////////////////////

		// инструменты ввода-вывода уничтожаются
		in.close();
		out.flush();
		out.close();
	}
}