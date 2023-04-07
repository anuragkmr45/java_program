public class CombSort{

	int nextGap(int gap){
		gap = (gap * 10) / 13;
		if (gap < 1)
			return 1;
		return gap;
	}

	void Csort(int arr[]) {
		int n = arr.length;

		int gap = n;

		boolean swapped = true;

		while (gap != 1 || swapped == true) {
			gap = nextGap(gap);

			swapped = false;

			for (int i = 0; i < n - gap; i++) {
				if (arr[i] > arr[i + gap]) {
					int temp = arr[i];
					arr[i] = arr[i + gap];
					arr[i + gap] = temp;

					swapped = true;
				}
			}
		}
	}

	public static void main(String args[])
	{
		CombSort a = new CombSort();
		int arr[] = {8,4,6,3,2,5,7,8,54,3};
		a.Csort(arr);

		System.out.println("sorted array");
		for (int i = 0; i < arr.length; ++i){
			System.out.print(arr[i] + " ");
        }
        System.out.println();
	}
}
