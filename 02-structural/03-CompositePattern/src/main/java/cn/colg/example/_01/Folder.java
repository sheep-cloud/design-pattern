package cn.colg.example._01;

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
 * 文件夹类
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
public class Folder {

    /** 文件夹名称 */
    private String name;

    /** 用于存储Foler类型的成员 */
    private List<Folder> folderList = new ArrayList<>();

    /** 用于存储ImageFile类型的成员 */
    private List<ImageFile> imageFileList = new ArrayList<>();

    /** 用于存储TextFile类型的成员 */
    private List<TextFile> textFileList = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    /**
     * 添加Folder
     *
     * @param folder 文件夹对象
     * @return
     * @author colg
     */
    public Folder addFolder(Folder folder) {
        folderList.add(folder);
        return this;
    }

    /**
     * 添加ImageFile
     *
     * @param imageFile 图像文件对象
     * @return
     * @author colg
     */
    public Folder addImageFile(ImageFile imageFile) {
        imageFileList.add(imageFile);
        return this;
    }

    /**
     * 添加TextFile
     *
     * @param textFile 文本文件对象
     * @return
     * @author colg
     */
    public Folder addTextFile(TextFile textFile) {
        textFileList.add(textFile);
        return this;
    }

    /// 需提供三个不同的方法removeFolder()、removeImageFile()和removeTextFile()来删除成员，代码省略

    /// 需提供三个不同的方法getChildFolder(int i)、getChildImageFile(int i)和getChildTextFile(int i)来获取成员，代码省略

    public void killVirus() {
        // 简化代码，模拟杀毒
        log.info("对文件夹[{}]进行杀毒", name);

        // 如果是Folder类型的成员，递归调用Folder的killVirus()方法
        for (Folder folder : folderList) {
            folder.killVirus();
        }

        // 如果是ImageFile类型的成员，递归调用ImageFile的killVirus()方法
        for (ImageFile imageFile : imageFileList) {
            imageFile.killVirus();
        }

        // 如果是TextFile类型的成员，递归调用TextFile的killVirus()方法
        for (TextFile textFile : textFileList) {
            textFile.killVirus();
        }
    }
}
