package Array;

public class Q05 {

	public static void main(String[] args) {
		//�ִ밪�� �ش� �ε����� ���ؼ� ����غ��ô�.
		int[] nums = new int[] {78,54,89,57,84,95,74,91,84,67,52,94,82};
		int max =0;
		int index =0;
		for(int i =0;i<nums.length;i++) {
			if(max<nums[i]) {
				max=nums[i];
				index = i;
			}
		}
		System.out.println("�ִ�: " + max);
		System.out.println("�ش� �ε���: " + index);
		
	}

}
