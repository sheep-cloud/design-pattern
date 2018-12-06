package cn.colg.example._02;

import lombok.extern.slf4j.Slf4j;

/**
 * 业务类 - 身份验证类，它提供方法Validate()来实现身份验证。
 *
 * @author colg
 */
@Slf4j
public class AccessValidator {

    /**
     * 模拟实现登录验证
     *
     * @param userId
     * @return
     * @author colg
     */
    public boolean validate(String userId) {
        log.info("在数据库中验证用户 [{}] 是否是合法的用户？", userId);
        if ("admin".equals(userId)) {
            log.info("[{}] 登录成功！", userId);
            return true;
        }
        log.info("[{}] 登录失败！", userId);
        return false;
    }
}
