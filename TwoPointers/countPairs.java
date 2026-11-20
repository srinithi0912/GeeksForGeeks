class Solution {
    int countPairs(int arr[], int target) {
        int count=0;
        int left = 0,right=arr.length-1;
        while(left < right){
            if(arr[left] + arr[right] < target){
                left++;
            }
            else if(arr[left] + arr[right] > target){
                right--;
            }
            else{
                if(arr[left] == arr[right]){
                    int n = (right-left)+1;
                    count += (n *(n-1))/2;
                    return count;
                }
                else{
                    int left_c=1,right_c=1;
                    while(left < right && arr[left] == arr[left+1]){
                        left++;
                        left_c++;
                    }
                    while(left < right-1 && arr[right] == arr[right-1]){
                        right--;
                        right_c++;
                    }
                    count += (left_c * right_c);
                    left++;
                    right--;
                }
            }
        }
        return count;
    }
}
