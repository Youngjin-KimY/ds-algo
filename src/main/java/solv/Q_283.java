package solv;

public class Q_283 {
    public void moveZeros(int[] num) {
        int lastZeroPosition = 0;
        for(int i=0;i<num.length;i++) {
            if(num[i] != 0){
                num[lastZeroPosition] = num[i];
                lastZeroPosition ++;
            }
        }

        for(int i=lastZeroPosition; i<num.length;i++) {
            num[i] = 0;
        }
    }
}
