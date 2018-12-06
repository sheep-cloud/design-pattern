package cn.colg.example._03;

import lombok.extern.slf4j.Slf4j;

/**
 * 子系统角色 - 新的文件加密类
 *
 * @author colg
 */
@Slf4j
public class NewCipherMachine {

    /**
     * 对字符串进行位移加密
     *
     * @param plainText 字符串
     * @return 加密后的字符串
     * @author colg
     */
    public String encrypt(String plainText) {
        char[] cs = plainText.toCharArray();
        StringBuilder sb = new StringBuilder(cs.length);
        // 设置密钥，移位数为10
        int key = 10;
        for (char ch : cs) {
            int temp = Character.digit(ch, 32);
            // 小写字母移位
            if (ch >= 'a' && ch <= 'z') {
                temp += key % 26;
                if (temp > 122) temp -= 26;
                if (temp < 97) temp += 26;
            }

            // 大写字母移位
            if (ch >= 'A' && ch <= 'Z') {
                temp += key % 26;
                if (temp > 90) temp -= 26;
                if (temp < 65) temp += 26;
            }

            sb.append((char)temp);
        }
        String result = sb.toString();
        log.info("数据加密，将明文转换为密文 : {}", result);
        return result;
    }
}
