package cn.colg.example._03;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.CharsetUtil;
import lombok.extern.slf4j.Slf4j;

/**
 * 子系统角色 - 文件保存类
 *
 * @author colg
 */
@Slf4j
public class FileWriter {

    /**
     * 将String写入文件，覆盖模式
     *
     * @param encryptStr 写入的内容
     * @param path 文件路径
     * @author colg
     */
    public void write(String encryptStr, String path) {
        log.info("保存密文，写入文件 : {}", path);
        FileUtil.writeString(encryptStr, path, CharsetUtil.UTF_8);
    }
}
