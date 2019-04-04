package io.badadal.sumanth;

/**
 * @author sbadadal
 *
 * A small frog wants to get to the other side of the road. The frog is currently located at position X and wants to
 * get to a position greater than or equal to Y. The small frog always jumps a fixed distance, D.
 */
public class FrogJump {

    public static void main(String[] args) {
        FrogJump frogJump = new FrogJump();
        frogJump.solution(10, 85, 30);
    }

    public int solution(int x, int y, int d) {
        if (((y - x) % d) == 0) {
            return (y - x) / d;
        } else {
            return ((y - x) / d) + 1;
        }
    }

}
