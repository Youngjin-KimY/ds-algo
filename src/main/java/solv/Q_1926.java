package solv;

import java.util.LinkedList;
import java.util.Queue;

public class Q_1926 {
//    class Pair{
//        int first;
//        int second;
//        int step;
//        Pair(int fst,int scnd,int step){
//            this.first=fst;
//            this.second=scnd;
//            this.step=step;
//        }
//    }
//
//    public int nearestExit(char[][] maze, int[] entrance) {
//        int n=maze.length;
//        int m=maze[0].length;
//
//        int x=entrance[0];
//        int y=entrance[1];
//
//        int delRow[]={1,-1,0,0};
//        int delCol[]={0,0,1,-1};
//
//        int ans=0;
//
//        Queue<Pair> q=new LinkedList<Pair>();
//        q.add(new Pair(x,y,0));
//
//        while(!q.isEmpty()){
//            int row=q.peek().first;
//            int col=q.peek().second;
//            int step=q.peek().step;
//            maze[row][col]='+';
//
//
//            q.poll();
//
//            for(int i=0;i<4;i++){
//                int nrow=row+delRow[i];
//                int ncol=col+delCol[i];
//
//                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && maze[nrow][ncol]=='.'){
//                    maze[nrow][ncol]='+';
//                    q.add(new Pair(nrow,ncol,step+1));
//
//
//                    if(nrow==0 || ncol==0 || nrow==n-1 || ncol==m-1){
//                        ans=step+1;
//                        return ans;
//                    }
//
//                }
//
//            }
//
//        }
//        return -1;
//
//
//    }
    class Pair<T,X,Y> {
        public Pair(T first, X second, Y step) {
            this.first = first;
            this.second = second;
            this.step = step;
        }

        private T first;
        private X second;

        private Y step;
    }

    private int step = 0;
    private boolean exit = false;
    private Queue<Pair<Integer, Integer, Integer>> q = new LinkedList<Pair<Integer, Integer, Integer>>();
    private boolean[][] visited;

    private boolean checkerExitDoor(char[][] maze) {
        boolean res = false;
        for(int i=0;i<maze.length;i+=maze.length-1) {
            for(int j=0;j<maze[0].length; j++) {
                if(maze[i][j] == '.')
                    return true;
            }
        }

        for(int i=0;i< maze.length;i++) {
            for (int j = 0; j < maze[0].length; j += maze[0].length - 1) {
                if (maze[i][j] == '.')
                    return true;
            }
        }
        return res;
    }

    private boolean[][] init(int row, int col) {
        visited = new boolean[row][col];

        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                visited[i][j] = false;
            }
        }
        return visited;
    }

    public int nearestExit(char[][] maze, int[] entrance) {
        init(maze.length,maze[0].length);
//        if(!checkerExitDoor(maze)) return -1;

        int[] dx = new int[]{-1, 0, 1, 0};
        int[] dy = new int[]{0, 1, 0, -1};

        int cx = entrance[1];
        int cy = entrance[0];
        int step = 0;

        q.add(new Pair<>(cx,cy,step));
        visited[cy][cx] = true;
        while(!q.isEmpty()) {
            Pair<Integer, Integer, Integer> np = q.poll();
            cy = np.second;
            cx = np.first;
            step = np.step;
            if((cy ==  0 || cy == maze.length-1 || cx == 0 || cx == maze[0].length-1)
            && (cy != entrance[0] || cx != entrance[1])) {
                return step;
//                exit = true;
//                minstep = Math.min(minstep, step);
//
//                if(minstep == 1) return minstep;
            }



            for (int i = 0; i < 4; i++) {

                int nx = cx + dx[i];
                int ny = cy + dy[i];
//                if(ny < 0 || nx < 0) continue;
//                if(ny >= maze.length || nx >= maze[0].length) continue;
                if(ny >= 0 && nx >= 0 && ny < maze.length && nx < maze[0].length && maze[ny][nx] == '.' && !visited[ny][nx]) {
                    visited[ny][nx] = true;
                    q.add(new Pair(nx, ny, step + 1));
                }
            }

        }

        return -1;
    }
}
