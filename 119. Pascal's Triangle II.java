public class Solution {
    public List<Integer> getRow(int rowIndex) {
        rowIndex++;
		List<Integer> result = new ArrayList<Integer>();
		if(rowIndex<0)
			return result;
		result.add(1);
		for(int i=1;i<rowIndex;i++){
			int last = result.get(0);
			for(int j=1;j<i;j++){
				int tmp = result.get(j);
				result.set(j, result.get(j)+last);
				last = tmp;
			}
			result.add(1);
		}
		return result;
    }
}