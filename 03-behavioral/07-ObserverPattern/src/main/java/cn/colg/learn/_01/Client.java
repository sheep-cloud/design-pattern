package cn.colg.learn._01;

import lombok.extern.slf4j.Slf4j;

/**
 * 客户端
 *
 * @author colg
 */
@Slf4j
public class Client {
    public static void main(String[] args) {
        // 定义股票
        AbstractStock stock = new Stock().setName("国寿周周盈")
                                         .setPrice(15)
                                         .setGainPrice(16);
        
        // 定义股民
        Observer o1, o2, o3;
        o1 = new ShareHolder("Jack");
        o2 = new ShareHolder("Rose");
        o3 = new ShareHolder("Tom");
        
        // 添加股民
        stock.addObserver(o1)
             .addObserver(o2);
        o1.updata(stock);
        log.info("----------------------------------------------------------------------------------------------------");
        
        stock.addObserver(o3)
             .deleteObserver(o1);
        o3.updata(stock);
    }
}
