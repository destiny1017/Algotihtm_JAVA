package Programmers;
import java.util.*;

public class Test1 {
	
//	# K��° ��
//	
//	���� ����
//	�迭 array�� i��° ���ں��� j��° ���ڱ��� �ڸ��� �������� ��, k��°�� �ִ� ���� ���Ϸ� �մϴ�.
//
//	���� ��� array�� [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3�̶��
//
//	array�� 2��°���� 5��°���� �ڸ��� [5, 2, 6, 3]�Դϴ�.
//	1���� ���� �迭�� �����ϸ� [2, 3, 5, 6]�Դϴ�.
//	2���� ���� �迭�� 3��° ���ڴ� 5�Դϴ�.
//	�迭 array, [i, j, k]�� ���ҷ� ���� 2���� �迭 commands�� �Ű������� �־��� ��, commands�� ��� ���ҿ� ���� �ռ� ������ ������ �������� �� ���� ����� �迭�� ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.
//
//	���ѻ���
//	array�� ���̴� 1 �̻� 100 �����Դϴ�.
//	array�� �� ���Ҵ� 1 �̻� 100 �����Դϴ�.
//	commands�� ���̴� 1 �̻� 50 �����Դϴ�.
//	commands�� �� ���Ҵ� ���̰� 3�Դϴ�.
    
	public static int[] solution(int[] arr, int[][] com) {
   
		int[] answer = new int[com.length];
		int[][] temp = new int[com.length][];
		
		for(int i=0; i<com.length; i++) {
			temp[i] = Arrays.copyOfRange(arr, com[i][0]-1, com[i][1]);
			Arrays.sort(temp[i]);
			answer[i] = temp[i][com[i][2]-1];
		}
        return answer;
    }	
    
    public static void main(String[] args) {
		
		int arr[] = {4,6,7,3,2,5,9};
		int com[][] = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int answer[] = solution(arr, com);
		System.out.println(Arrays.toString(answer));
	}
}