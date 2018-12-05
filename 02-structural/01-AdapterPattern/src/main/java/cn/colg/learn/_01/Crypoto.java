package cn.colg.learn._01;

import cn.hutool.crypto.SecureUtil;

/**
 * 适配者类 - 加密（第三方系统）
 *
 * @author colg
 */
public class Crypoto {

    /**
     * MD5加密，生成16进制MD5字符串
     *
     * @param data 数据
     * @return MD5字符串
     * @author colg
     */
    public String md5(String data) {
        return SecureUtil.md5(data);
    }

    /**
     * SHA1加密，生成16进制SHA1字符串
     *
     * @param data 数据
     * @return SHA1字符串
     * @author colg
     */
    public String sha1(String data) {
        return SecureUtil.sha1(data);
    }
}
