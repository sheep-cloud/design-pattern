package cn.colg.example._03.shallow;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;

/**
 * 附件类
 *
 * @author colg
 */
@Getter
@Setter
@ToString
@Accessors(chain = true)
@Slf4j
public class Attachment {

    /** 附件名 */
    private String name;

    public void download() {
        log.info("下载附件，文件名为: {}", name);
    }
}
