package cn.colg.example._02;

/**
 * 抽象主题角色 - 抽象查询类，它声明了DoSearch()方法。
 *
 * @author colg
 */
public interface Searcher {

    /**
     * 模拟查询商务信息
     *
     * @param userId 用户id
     * @param keyword 关键字
     * @return
     * @author colg
     */
    String doSearch(String userId, String keyword);
}
