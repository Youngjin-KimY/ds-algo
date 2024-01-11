package solv;

public class Q_392 {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0) return true;
        if(t.length() == 0) return false;

        int idxS = 0;

        for(int idxT=0;idxT < t.length(); idxT ++) {
            if(s.charAt(idxS) == t.charAt(idxT)) {
                idxS++;
                if(idxS == s.length()) {
                    return true;
                }
            }
        }


        return false;
    }
}
