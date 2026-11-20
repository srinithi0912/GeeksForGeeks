class Solution {
    public ArrayList<Integer> findIntersection(int[] a, int[] b) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int a1[] = Arrays.copyOf(a,a.length);
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0,j=0;
        while(i < a.length && j < b.length){
            if(a[i] < b[j]){
                i++;
            }
            else if(b[j] < a[i]){
                j++;
            }
            else{
                set.add(a[i]);
                i++;
                j++;
            }
        }
        for(int val : a1){
            if(set.contains(val)){
                ans.add(val);
            }
        }
        return ans;
    }
}
