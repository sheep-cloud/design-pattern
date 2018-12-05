package cn.colg.example._04;

import lombok.extern.slf4j.Slf4j;

/**
 * 客户端
 *
 * @author colg
 */
@Slf4j
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 获取原型管理器对象
        PrototypeManager manager = PrototypeManager.getInstance();
        
        OfficialDocument doc1, doc2, doc3, doc4, doc5, doc6;
        doc1 = manager.getOfficialDocument("far");
        doc1.display();
        doc2 = manager.getOfficialDocument("far");
        doc2.display();
        log.info("doc1 == doc2 : {}", doc1 == doc2);
        
        doc3 = manager.getOfficialDocument("srs");
        doc3.display();
        doc4 = manager.getOfficialDocument("srs");
        doc4.display();
        log.info("doc3 == doc4 : {}", doc3 == doc4);
        
        doc5 = manager.getOfficialDocument("ppr");
        doc5.display();
        doc6 = manager.getOfficialDocument("ppr");
        doc6.display();
        log.info("doc5 == doc6 : {}", doc5 == doc6);
    }
}
