package cn.colg.example._03;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;

/**
 * 叶子构件 - 视频文件类
 *
 * @author colg
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Slf4j
public class VideoFile extends AbstractFile {

    /** 视频文件名称 */
    private String name;

    @Override
    public AbstractFile add(AbstractFile file) {
        log.info("对不起，不支持该方法");
        return null;
    }

    @Override
    public AbstractFile remove(AbstractFile file) {
        log.info("对不起，不支持该方法");
        return null;
    }

    @Override
    public AbstractFile getChild(int index) {
        log.info("对不起，不支持该方法");
        return null;
    }

    @Override
    public void killVirus() {
        // 模拟杀毒
        log.info("对视频文件 [{}] 进行杀毒", name);
    }
}
