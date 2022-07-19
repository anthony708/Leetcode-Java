package String;

/**
 * 657. Robot Return to Origin
 * Easy
 * @author zhuduan
 * 2019/06/17
 */

public class RobotReturnToOrigin {
    public boolean judgeCircle(String moves) {
        int horizon = 0;
        int vertical = 0;

        for (char c: moves.toCharArray()) {
            if (c == 'U') {
                horizon++;
            } else if (c == 'D') {
                horizon--;
            } else if (c == 'L') {
                vertical--;
            } else if (c == 'R') {
                vertical++;
            }
        }
        return horizon == 0 && vertical == 0;
    }
}
