package cn.colg.example._03;

import lombok.extern.slf4j.Slf4j;

/**
 * 子系统角色 - 文件加密类
 *
 * @author colg
 */
@Slf4j
public class CipherMachine {

    /**
     * 对字符串进行求模加密
     *
     * @param plainText 字符串
     * @return 加密后的字符串
     * @author colg
     */
    public String encrypt(String plainText) {
        char[] cs = plainText.toCharArray();
        StringBuilder sb = new StringBuilder(cs.length);
        for (char ch : cs) {
            int c = ch % 7;
            sb.append(c);
        }
        String result = sb.toString();
        log.info("数据加密，将明文转换为密文 : {}", result);
        return result;
    }
}
