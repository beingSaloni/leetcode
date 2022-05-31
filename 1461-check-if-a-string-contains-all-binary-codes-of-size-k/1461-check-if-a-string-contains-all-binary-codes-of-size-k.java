class Solution {
	public boolean hasAllCodes(String s, int k) {
		int combinations = (int)Math.pow(2,k);
		HashSet<String> set = new HashSet<>();
		for(int i=0;i<s.length()-k+1;i++){
			set.add(s.substring(i,i+k));
		}
		return set.size()==combinations;
	}
}