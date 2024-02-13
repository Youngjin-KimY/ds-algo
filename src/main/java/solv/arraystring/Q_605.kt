package solv.arraystring

class Q_605 {

    //이 문제는 엣지를 많이 놓친문제
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        var cnt = 0

        if(flowerbed.isEmpty()) {
            return false
        }

        if(flowerbed.size == 1) {
            if(flowerbed[0] == 0 && n == 1) return true
            else if(flowerbed[0] == 0 && n == 0) return true
            else if(flowerbed[0] == 1 && n == 1) return false
            else return true
        }

        if(flowerbed[0] == 0 && flowerbed[1] == 0) {
            flowerbed[0] = 1
            cnt ++
        }

        if(flowerbed.size >= 2 && flowerbed[flowerbed.size-1] == 0 && flowerbed[flowerbed.size-2] == 0) {
            flowerbed[flowerbed.size - 1] = 1
            cnt ++
        }


        for(idx: Int in flowerbed.indices) {
            if(flowerbed[idx] == 0 ) {
                if(idx-1 < 0 || idx+1 > flowerbed.size-1) continue
                if(flowerbed[idx-1]==0 && flowerbed[idx+1]==0){
                    cnt ++
                    flowerbed[idx] = 1
                }
            }

            if(cnt >= n) {
                return true
            }
        }

        return false
    }
}