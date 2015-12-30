package seattle.algostar.ps.acmicpc.greedy;

import java.util.Scanner;

public class Problem11047_JW {
	public static void main(String[] args) {
		new Problem11047_JW().run();
	}

	private void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) A[i] = sc.nextInt();
		
		int cnt = 0;
		for (int i = N-1; i >= 0; i--) {
			cnt += K / A[i];
			K %= A[i];
		}
		System.out.println(cnt);
	}
}
