package cn.colg.learn._01;

/**
 * 具体主题角色 - 数学操作类
 *
 * @author colg
 */
public class MathOperation implements Math {

    @Override
    public int div(int n, int m) {
        return n / m;
    }
}
