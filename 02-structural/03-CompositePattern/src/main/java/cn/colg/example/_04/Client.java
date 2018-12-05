package cn.colg.example._04;

/**
 * 客户端
 *
 * @author colg
 */
public class Client {
    public static void main(String[] args) {
        AbstractUnit dev1, dev2, hr1, hr2;
        Company company1, company2;
        company1 = new Company("民营企业");
        company2 = new Company("阿里巴巴公司");
        
        dev1 = new DevDept("钢铁侠");
        dev2 = new DevDept("蜘蛛侠");
        
        hr1 = new HrDept("女团");
        hr2 = new HrDept("火箭101");

        company1.add(dev1)
                .add(dev2)
                .add(hr1)
                .add(hr2)
                .add(company2);
        
        company1.sendNotification();
    }
}
