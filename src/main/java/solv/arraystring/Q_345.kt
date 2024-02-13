package solv.arraystring

class Q_345 {

    private val vowels = mutableListOf("a","e","i","o","u","A","E","I","O","U")

    fun reverseVowels(s: String): String {
        var frontIdxPointer = 0
        var endIdxPointer = s.length - 1
        var resStringTmp = StringBuilder(s)
        var frontVowelsCheck = false
        var endVowelsCheck = false

        while(frontIdxPointer < endIdxPointer) {


            while(frontIdxPointer < s.length - 1) {
                if(vowels.contains(resStringTmp[frontIdxPointer].toString())) {
                    frontVowelsCheck = true
                    break
                }
                frontIdxPointer++
            }

            while(endIdxPointer > -1) {
                if(vowels.contains(resStringTmp[endIdxPointer].toString())) {
                    endVowelsCheck = true
                    break
                }
                endIdxPointer --
            }

            if(endIdxPointer < frontIdxPointer) continue

            if(endVowelsCheck && frontVowelsCheck) {
                var tmp = resStringTmp[endIdxPointer]
                resStringTmp[endIdxPointer] = resStringTmp.get(frontIdxPointer)
                resStringTmp[frontIdxPointer] = tmp
                endVowelsCheck = false
                frontVowelsCheck = false
            }

            frontIdxPointer ++
            endIdxPointer --
        }

        return resStringTmp.toString()
    }
}