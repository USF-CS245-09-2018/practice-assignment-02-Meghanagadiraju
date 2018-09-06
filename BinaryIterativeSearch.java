public class BinaryIterativeSearch implements Practice2Search
{


	public String searchName()
	{
		return "Binary Iterative Search";
	}
	public int search(int [] arr, int target)
	{
		int low = 0;
		int mid;
		int up = arr.length-1;

		while (low <= up)
		{
			mid = (low+up)/2;
			if (target == arr[mid])
			{
				return mid;
			}
			else if (target < arr[mid])
			{
				up = mid-1;
				mid = (up+low)/2;
			}
			else 
			{
				low = mid+1;
				mid = (low +up)/2;
			}

			
		}

		return -1;
	}
}