package cn.colg.example._03;

/**
 * 客户端
 *
 * @author colg
 */
public class Client {

    public static void main(String[] args) {
        Chart chart;
        // 通过静态工厂方法创建产品
        chart = ChartFactory.getChart("histogram");
        chart.display();

        /*
         * colg  [简单工厂模式（三）]
         * 
         *  使用工厂类的静态工厂方法创建产品对象，如果需要更换产品，只需修改静态工厂方法中的参数即可
         */

        chart = ChartFactory.getChart("pie");
        chart.display();

        chart = ChartFactory.getChart("line");
        chart.display();
    }
}
