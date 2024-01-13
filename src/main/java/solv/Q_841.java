package solv;

import java.util.List;
import java.util.Stack;

public class Q_841 {

    private boolean[] visited;

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        this.visited = new boolean[rooms.size()];
        for (int i = 0; i < visited.length; i++) {
            visited[i] = false;
        }
        runDfs(rooms, 0);
        for (int i = 0; i < visited.length; i++) {
            if (!visited[i]) return false;
        }
        return true;
    }
    private void runDfs(List<List<Integer>> rooms, int roomNumber) {
        if(!visited[roomNumber]) {
            visited[roomNumber] = true;
            for(int i=0;i<rooms.get(roomNumber).size();i++) {
                int nextRoomCandidate  = rooms.get(roomNumber).get(i);
                if(!visited[nextRoomCandidate]){
                    runDfs(rooms, nextRoomCandidate);
                }
            }
        }
    }
}
