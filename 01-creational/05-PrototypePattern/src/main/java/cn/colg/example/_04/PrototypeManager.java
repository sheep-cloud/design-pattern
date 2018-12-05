package cn.colg.example._04;

import java.util.Hashtable;

/**
 * 原型管理器 - 使用单例模式（恶汉式）实现
 *
 * @author colg
 */
public class PrototypeManager {

    /** 存储唯一实例 */
    private static PrototypeManager instance = new PrototypeManager();

    /**
     * 获取唯一实例；在类加载时创建
     *
     * @return
     * @author colg
     */
    public static PrototypeManager getInstance() {
        return instance;
    }

    /** 定义一个Hashtable，用于存储原型对象 */
    private Hashtable<String, Object> hashtable = new Hashtable<>();

    /**
     * 为Hashtable添加公文对象
     *
     */
    private PrototypeManager() {
        hashtable.put("far", new FAR());
        hashtable.put("srs", new SRS());
        hashtable.put("ppr", new PPR());
    }

    /**
     * 添加新的公文对象
     *
     * @param key
     * @param doc
     * @author colg
     */
    public void addOfficialDocument(String key, OfficialDocument doc) {
        hashtable.put(key, doc);
    }

    /**
     * 通过浅克隆获取新的公文对象
     *
     * @param key
     * @return
     * @author colg
     * @throws CloneNotSupportedException 
     */
    public OfficialDocument getOfficialDocument(String key) throws CloneNotSupportedException {
        OfficialDocument doc = (OfficialDocument)hashtable.get(key);
        return doc.shallowClone();
    }
}
