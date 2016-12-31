

/**
 * 给定一个排序数组，删除重复数据
 */
public class RemoveDuplicatesfromSortedArray{
	
	public static void main(String[] args) {
		int[] sorts = {1,1,2,2,3,3,3,5,6,6};
		RemoveDuplicatesfromSortedArray sortArray = new RemoveDuplicatesfromSortedArray();
		int index = sortArray.removeDuplicates(sorts);
		System.out.println(index);
		
	}

	public int removeDuplicates(int[] sorts){
		if (sorts.length ==0)  return 0;

		int index =0;
		for (int i=1; i<sorts.length;i++) {
			if (sorts[i] != sorts[index]) {
				index++;
				sorts[index] = sorts[i];
			}
			
		}
		return index + 1;
	}
}