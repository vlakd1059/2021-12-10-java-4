package 자바테스트;

import java.util.Arrays;

public class Test02 {
	public static int[] tmp; // 배열의 값을 잠시 복사해둘 공간

	public static void main(String[] args) {

		int arr[] = { 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		// 원소를 반으로 나누는 함수
		Mergesort(arr, 0, arr.length - 1);

		// 합병 저렬된 배열을 출력하는 함수.
		output_merge_arr(arr);
	}

	public static void Test(int[] arr) {
		tmp = new int[arr.length];
		Mergesort(arr, 0, arr.length - 1);
	}

	public static void Mergesort(int[] arr, int left, int right) { // left :배열 첫, right : 끝
		//
		if (left < right) {
			int mid = (left + right) / 2; // 중앙값을 구함

			// 중앙을 기준으로 2개의 그룹으로 분할
			Mergesort(arr, left, mid);// 정렬
			Mergesort(arr, mid + 1, right);// 정렬
			Merge(arr, left, mid, right);// 정렬 후 병합
		}
	}

	public static void Merge(int[] arr, int left, int mid, int right) {
		tmp = arr.clone();

		int part1 = left; // 왼쪽그룹의 시작 인덱스
		int part2 = mid + 1; // 오른쪽 그룹의 시작 인덱스
		int index = left; // 정렬된 값을 병합된 배열의 어떤 위치에 넣어야하는지

		while (part1 <= mid && part2 <= right) { // 애매
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
			// 배열의 내용을 출력하려면 Arrays.toString() ->[a,b,c,d]

			break;
		}
		System.out.println();
	}
}