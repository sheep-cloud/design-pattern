package cn.colg.example._03;

/**
 * 扩充抽象类 - PNG格式图像
 *
 * @author colg
 */
public class PNGImage extends AbstractImage {

    @Override
    public void parseFile(String fileName) {
        // 模拟解析PNG文件并获得一个像素矩阵对象m
        Matrix matrix = new Matrix().setResolution("1440 * 900")
                                    .setExtName(".PNG")
                                    .setFileName(fileName);
        imageImp.doPaint(matrix);
    }

}
