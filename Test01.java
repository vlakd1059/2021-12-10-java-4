package �ڹ��׽�Ʈ;

public class Test01 {

	public static void main(String[] args) {

		// �Ǻ���ġ ����
		int input = 8; // 8�����

		fibo(input);

	}

	public static void fibo(int i) {
		int[] arr = new int[8];
		arr[0] = 1;
		arr[1] = 1;
		for (int j = 2; j < arr.length; j++) {
			arr[j] = arr[j - 2] + arr[j - 1];

		}
		for (int a = 0; a < arr.length; a++) {
			System.out.print(arr[a] + " ");
		}
	}
}
