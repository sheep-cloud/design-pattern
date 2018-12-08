package cn.colg.example._03;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;

/**
 * 容器构件 - 文件夹类
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
public class Folder extends AbstractFile {

    /** 文件夹名称 */
    private String name;

    /** 用于存储AbstractFile类型的成员 */
    private List<AbstractFile> list = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public AbstractFile add(AbstractFile file) {
        list.add(file);
        return this;
    }

    @Override
    public AbstractFile remove(AbstractFile file) {
        list.remove(file);
        return this;
    }

    @Override
    public AbstractFile getChild(int index) {
        return list.get(index);
    }

    @Override
    public void killVirus() {
        // 模拟杀毒
        log.info("对文件夹 [{}] 进行杀毒", name);

        // 递归调用成员构件的killVirus()方法
        for (AbstractFile abstractFile : list) {
            abstractFile.killVirus();
        }
    }
}
