package cn.colg.example._01;

/**
 * 客户端
 *
 * @author colg
 */
public class Client {
    public static void main(String[] args) {
        String type = "histogram";
        Chart chart = new Chart(null, type);
        chart.display();
    }
}
