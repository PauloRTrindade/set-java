package application;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Set<Integer> A = new TreeSet<>();
		Set<Integer> B = new TreeSet<>();
		Set<Integer> C = new TreeSet<>();

		System.out.print("How many students for course A: ");
		int a = sc.nextInt();
		for (int i = 0; i < a; i++) {
			A.add(sc.nextInt());
		}

		System.out.print("How many students for course B: ");
		int b = sc.nextInt();
		for (int i = 0; i < b; i++) {
			B.add(sc.nextInt());
		}

		System.out.print("How many students for course C: ");
		int c = sc.nextInt();
		for (int i = 0; i < c; i++) {
			C.add(sc.nextInt());
		}

		Set<Integer> D = new TreeSet<>(A);
		D.addAll(C);
		D.addAll(B);

		System.out.println("Total students: " + D.size());

		sc.close();

	}

}
