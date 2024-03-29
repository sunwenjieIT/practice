package xyz.wenjiesx.leetcode.medium;

/**
 *
 * 有 n 位乘客即将登机，飞机正好有 n 个座位。第一位乘客的票丢了，他随便选了一个座位坐下。
 *
 * 剩下的乘客将会：
 *
 * 如果他们自己的座位还空着，就坐到自己的座位上，
 *
 * 当他们自己的座位被占用时，随机选择其他座位
 * 第 n 位乘客坐在自己的座位上的概率是多少？
 *
 *
 * 示例 1：
 *
 * 输入：n = 1
 * 输出：1.00000
 * 解释：第一个人只会坐在自己的位置上。
 * 示例 2：
 *
 * 输入: n = 2
 * 输出: 0.50000
 * 解释：在第一个人选好座位坐下后，第二个人坐在自己的座位上的概率是 0.5。
 *
 * 提示：
 *
 * 1 <= n <= 10^5
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/airplane-seat-assignment-probability
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author wenji
 * @Date 2021/4/24
 */
public class NthPersonGetsNthSeat {


    public static void main(String[] args) {

        for (int i = 1; i < 10000; i++) {
            System.out.println(nthPersonGetsNthSeat(i));
        }

    }

    /**
     *
     *
     *
     * @param n
     * @return
     */
    public static double nthPersonGetsNthSeat(int n) {
        if (n == 1)
            return 1;

        double tmp = 0;
        double d = 1 / (double) n;
        for (int i = 1; i < n; i++) {
            if (i == 1) {
                tmp += d;
            } else {
                tmp += d * (nthPersonGetsNthSeat(n - i + 1));
            }
        }
        return tmp;
    }
}
