package cn.colg.example._02;

/**
 * 客户端
 *
 * @author colg
 */
public class Client {
    public static void main(String[] args) {
        AbstractPen pen1, pen2, pen3;
        pen1 = new BigPen();
        pen1.setColor(new Red());
        pen1.draw();

        pen2 = new MiddlePen();
        pen2.setColor(new Green());
        pen2.draw();

        pen3 = new SmallPen();
        pen3.setColor(new Blue());
        pen3.draw();
    }
}
