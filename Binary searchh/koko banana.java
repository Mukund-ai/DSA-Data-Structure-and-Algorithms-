//koko have given []piles and time h ;
// she have to eats k bananas / hour , find minimum K to finish banana in h hours 
//Each hour, she chooses one pile and eats k bananas from it
// Each hour, she chooses one pile and eats k bananas from it
// If the pile has less than k, she eats all bananas in that pile and stops for that hour

// You are given an integer h, representing the total number of hours available.






class Solution {
    public int minEatingSpeed(int[] piles, int h) {
         int low =1, high = 0;
         for(int p: piles){
            high = Math.max(high,p);
         }
         while(low<=high){
            int mid = (low+high)/2;
            if (canEat(piles, h, mid)){
                high = mid;
            }
            else{
                low = mid+1;
            }
         }
         return low;
    }
    private boolean canEat(itn []piles , int h , int k ){
        int hours =0;
        for(int p :piles){
            hours += (p+k-1)/k;
        }
        return hours <= h;
    }
}