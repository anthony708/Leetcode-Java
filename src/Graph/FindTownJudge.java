package Graph;

/**
 * 997. Find the Town Judge
 * Easy
 * @author zhuduan
 * 2019/05/15
 */

/**
  Consider trust as a graph, all pairs are directed edge.
  The point with in-degree - out-degree = N - 1 become the judge.
 **/

public class FindTownJudge {
    public static int findJudge(int N, int[][] trust) {
        if (N == 1 && trust.length == 0) return 1;

        int count[] = new int[N+1];
        for (int[] t: trust) {
            count[t[0]]--;
            count[t[1]]++;
        }

        for (int i = 0; i <= N; i++) {
            if (count[i] == N-1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
//        int N = 4;
//        int[][] trust = {{1,3},{1,4},{2,3},{2,4},{4,3}};

//        int N = 3;
//        int [][] trust = {{1,3},{2,3}};

        int N = 1;
        int[][] trust = {};

        System.out.println(findJudge(N, trust));
    }
}
