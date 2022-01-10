
public class Unique_Element_In_Array {

	public static void find(int[] nums, int target) {

		for (int i = 0; i <= nums.length - 1; i++)

		{
			for (int j = i + 1; j <= nums.length; j++)

				if (nums[i] + nums[j] == target) {
					System.out.println("Pair Found " + " " + nums[i] + " " + nums[j]);
				}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = { 3, 4, 5, 6, 7 };
		int target = 10;

		Unique_Element_In_Array a = new Unique_Element_In_Array();

		a.find(nums, target);

	}

}
