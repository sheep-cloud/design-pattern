package cn.colg.example._03;

/**
 * 扩充抽象类 - JPG格式图像
 *
 * @author colg
 */
public class JPGImage extends AbstractImage {

    @Override
    public void parseFile(String fileName) {
        // 模拟解析JPG文件并获得一个像素矩阵对象
        Matrix matrix = new Matrix().setResolution("1024 * 768")
                                    .setExtName(".JPG")
                                    .setFileName(fileName);
        imageImp.doPaint(matrix);
    }
}
