class Solution {
    void solve(int index,int k,int n,List<Integer> temp,List<List<Integer>> res,int []nums){
        if(n<0){
            return;
        }
        if(temp.size()==k&&n==0){
            res.add(new ArrayList<>(temp));
            return;
        }
        if(temp.size()>k){
            return;
        }
        for(int i=index;i<nums.length;i++){
            temp.add(nums[i]);
            solve(i+1,k,n-nums[i],temp,res,nums);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
       
        List<List<Integer>> res = new ArrayList<>();
        if(k>n){
            return new ArrayList<>();
        }
        int []nums = new int[9];
        int temp=0;
        for(int i=1;i<=9;i++){
            nums[temp]=i;
            temp++;
        }
        solve(0,k,n,new ArrayList<>(),res,nums);
        return res;
    }
}
