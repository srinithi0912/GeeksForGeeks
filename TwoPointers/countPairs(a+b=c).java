class Solution {
    public int countTriplet(int arr[]) {
        Arrays.sort(arr);
        HashSet<ArrayList<Integer>> set = new HashSet<>();
        int i=0,j=i+1,count=0;
        while(i < arr.length-2){
            ArrayList<Integer> l = new ArrayList<>();
            int sum = arr[i] + arr[j];
            int k = j+1;
            while(k < arr.length && sum > arr[k]){
                k++;
            }
            if(k < arr.length && arr[k] == sum){
                l.add(arr[i]);
                l.add(arr[j]);
                l.add(arr[k]);
                set.add(l);
            }
            j++;
            if(j == arr.length-1){
                i++;
                j = i+1;
            }
        }
        return set.size();
    }
}
