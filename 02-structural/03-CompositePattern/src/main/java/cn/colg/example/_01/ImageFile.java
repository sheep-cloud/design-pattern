package cn.colg.example._01;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;

/**
 * 图像文件
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
public class ImageFile {

    /** 图像文件名称 */
    private String name;

    /**
     * 对文件夹进行杀毒
     *
     * @author colg
     */
    public void killVirus() {
        // 简化代码，模拟杀毒
        log.info("对图像文件 [{}] 进行杀毒", name);
    }
}
