package cn.colg.example._02;

/**
 * 代理主题角色 - 代理查询类，它是查询代理，维持了对RealSearcher对象、AccessValidator对象和Logger对象的引用。
 *
 * @author colg
 */
public class ProxySearcher implements Searcher {

    /** 维持一个对真实主题的引用 */
    private RealSearcher realSearcher = new RealSearcher();

    @Override
    public String doSearch(String userId, String keyword) {
        // 验证身份
        if (this.validate(userId)) {
            String result = realSearcher.doSearch(userId, keyword);
            // 记录查询日志
            this.log(userId);
            // 返回查询结果
            return result;
        }
        return null;
    }

    private boolean validate(String userId) {
        return new AccessValidator().validate(userId);
    }

    private void log(String userId) {
        new Logger().log(userId);
    }
}
