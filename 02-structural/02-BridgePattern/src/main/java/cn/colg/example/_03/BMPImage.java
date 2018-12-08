package cn.colg.example._03;

/**
 * 扩充抽象类 - BMP格式图像
 *
 * @author colg
 */
public class BMPImage extends AbstractImage {

    @Override
    public void parseFile(String fileName) {
        // 模拟解析BMP文件并获得一个像素矩阵对象
        Matrix matrix = new Matrix().setResolution("800 * 600")
                                    .setExtName(".BMP")
                                    .setFileName(fileName);
        imageImp.doPaint(matrix);
    }
}
