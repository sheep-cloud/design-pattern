package cn.colg.learn._01;

/**
 * 具体目标类
 *
 * @author colg
 */
public class Stock extends AbstractStock {

    @Override
    public void notifyObserver(AbstractStock abstractStock) {
        for (Observer observer : obs) {
            observer.show(abstractStock);
        }
    }
}
