package cn.colg.example._02;

/**
 * 客户端
 *
 * @author colg
 */
public class Client {
    public static void main(String[] args) {
        AbstractPen pen1, pen2, pen3;
        pen1 = new BigPen(new Red());
        pen1.draw();

        pen2 = new MiddlePen(new Green());
        pen2.draw();

        pen3 = new SmallPen(new Blue());
        pen3.draw();
    }
}
