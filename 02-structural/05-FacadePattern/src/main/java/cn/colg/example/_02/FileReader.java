package cn.colg.example._02;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.CharsetUtil;
import lombok.extern.slf4j.Slf4j;

/**
 * 子系统角色 - 文件读取类
 *
 * @author colg
 */
@Slf4j
public class FileReader {

    /**
     * 读取文件内容
     *
     * @param path 文件路径
     * @return
     * @author colg
     */
    public String read(String path) {
        String str = FileUtil.readString(path, CharsetUtil.UTF_8);
        log.info("读取文件 : {}，获取明文: {}", path, str);
        return str;
    }
}
