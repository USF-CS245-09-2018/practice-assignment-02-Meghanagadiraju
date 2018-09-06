public class BinaryRecursiveSearch implements Practice2Search
{
	public String searchName()
	{
		return "Binary Recursive Search";
	}
	public int search(int [] arr, int target, int low, int up)
	{
		if (low>up)
		{
			return -1;
		}
		int mid = (low+up)/2;

		if (a[mid] = target)
		{
			return mid;
		}
		else if (target < mid)
		{
			return  search (arr, target, low, mid -1);
		}
		else
		{
			return search (arr, target, mid+1, up);
		}
		

	}
}