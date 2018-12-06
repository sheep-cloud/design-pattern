package cn.colg.example._02;

import lombok.extern.slf4j.Slf4j;

/**
 * 真实主题角色 - 具体查询类，它实现查询功能，提供方法doSearch()来查询信息。
 *
 * @author colg
 */
@Slf4j
public class RealSearcher implements Searcher {

    @Override
    public String doSearch(String userId, String keyword) {
        log.info("用户 [{}] 使用关键字 [{}] 查询商务信息！", userId, keyword);
        return "返回具体内容";
    }
}
