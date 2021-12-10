package �ڹ��׽�Ʈ;

import java.util.Arrays;

public class Test02 {
	public static int[] tmp; // �迭�� ���� ��� �����ص� ����

	public static void main(String[] args) {

		int arr[] = { 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		// ���Ҹ� ������ ������ �Լ�
		Mergesort(arr, 0, arr.length - 1);

		// �պ� ���ĵ� �迭�� ����ϴ� �Լ�.
		output_merge_arr(arr);
	}

	public static void Test(int[] arr) {
		tmp = new int[arr.length];
		Mergesort(arr, 0, arr.length - 1);
	}

	public static void Mergesort(int[] arr, int left, int right) { // left :�迭 ù, right : ��
		//
		if (left < right) {
			int mid = (left + right) / 2; // �߾Ӱ��� ����

			// �߾��� �������� 2���� �׷����� ����
			Mergesort(arr, left, mid);// ����
			Mergesort(arr, mid + 1, right);// ����
			Merge(arr, left, mid, right);// ���� �� ����
		}
	}

	public static void Merge(int[] arr, int left, int mid, int right) {
		tmp = arr.clone();

		int part1 = left; // ���ʱ׷��� ���� �ε���
		int part2 = mid + 1; // ������ �׷��� ���� �ε���
		int index = left; // ���ĵ� ���� ���յ� �迭�� � ��ġ�� �־���ϴ���

		while (part1 <= mid && part2 <= right) { // �ָ�
			if (tmp[part1] <= tmp[part2]) {
				arr[index] = tmp[part1];
				part1++;
			} else {
				arr[index] = tmp[part2];
				part2++;
			}
			index++;
		}

		for (int i = 0; i <= mid - part1; i++) {
			arr[index + i] = tmp[part1 + i];
		}
	}

	public static void output_merge_arr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Merge : " + Arrays.toString(arr) + " ");
			// �迭�� ������ ����Ϸ��� Arrays.toString() ->[a,b,c,d]

			break;
		}
		System.out.println();
	}
}