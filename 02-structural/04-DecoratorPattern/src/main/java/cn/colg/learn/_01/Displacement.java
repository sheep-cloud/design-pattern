package cn.colg.learn._01;

import cn.hutool.core.util.StrUtil;
import lombok.extern.slf4j.Slf4j;

/**
 * 具体构件类 - 位移
 *
 * @author colg
 */
@Slf4j
public class Displacement extends AbstractComponent {

    /**
     * 对字符串进行位移加密
     *
     * @param data
     * @return
     */
    @Override
    public String crypoto(String data) {
        log.info("对字符串进行位移加密");
        return this.displacement(data, 3, true);
    }

    /**
     * 对字符串进行位移
     *
     * @param data 字符串
     * @param moveLength 移动距离
     * @param isMoveRight true：右移；false：左移
     * @return 位移后的字符串
     * @author colg
     */
    private String displacement(String data, int moveLength, boolean isMoveRight) {
        if (StrUtil.isBlank(data) || moveLength <= 0) {
            return data;
        }

        int len = data.length();
        if (moveLength > len) {
            // 循环位移，当越界时循环
            moveLength = moveLength % len;
        }
        if (moveLength == len) {
            // 当位移位数与字符串长度一样
            return data;
        }

        StringBuilder sb = new StringBuilder(len);
        if (isMoveRight) {
            // 右移
            sb.append(data.substring(len - moveLength))
              .append(data.substring(0, len - moveLength));
        } else {
            // 左移
            sb.append(data.substring(moveLength))
              .append(data.substring(0, moveLength));
        }

        return sb.toString();
    }
}
