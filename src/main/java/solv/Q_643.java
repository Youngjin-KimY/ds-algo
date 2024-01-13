package solv;

public class Q_643 {
    public double findMaxAverage(int[] nums, int k) {

        double sum = 0;
        for(int i=0;i<k;i++) {
            sum += nums[i];
        }

        double max = sum;
        for(int i=k;i<nums.length;i++) {
            sum += (nums[i] - nums[i-k]);
            max = Math.max(max, sum);
        }

        return Math.floor(max/k*100000) / 100000;
    }
}
