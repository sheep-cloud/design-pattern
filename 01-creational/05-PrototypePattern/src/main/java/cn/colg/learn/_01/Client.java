package cn.colg.learn._01;

import java.io.IOException;

import lombok.extern.slf4j.Slf4j;

/**
 * 客户端
 *
 * @author colg
 */
@Slf4j
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, IOException {
        Customer customer1, customer2, customer3, customer4;
        // 浅克隆
        customer1 = new Customer();
        customer1.setAddress(new Address("chian"));
        customer2 = customer1.shallowClone();
        log.info("customer1 : {}", customer1);
        log.info("customer2 : {}", customer2);
        log.info("浅克隆 : customer1 == customer2 : {}", customer1 == customer2);
        // true；浅克隆比较的是内存引用地址
        log.info("浅克隆 : customer1.getAddress() == customer2.getAddress() : {}", customer1.getAddress() == customer2.getAddress());
        log.info("----------------------------------------------------------------------------------------------------");

        // 深克隆
        customer3 = new Customer();
        customer3.setAddress(new Address("english"));
        customer4 = customer3.deepClone();
        log.info("customer3 : {}", customer3);
        log.info("customer4 : {}", customer4);
        log.info("深克隆 : customer3 == customer4 : {}", customer3 == customer4);
        // false；深克隆比较的是地址值
        log.info("深克隆 : customer3.getAddress() == customer4.getAddress() : {}", customer3.getAddress() == customer4.getAddress());
    }
}
