package cn.colg.example._03;

/**
 * 扩充抽象类 - GIF格式图像
 *
 * @author colg
 */
public class GIFImage extends AbstractImage {

    @Override
    public void parseFile(String fileName) {
        // 模拟解析GIF文件并获得一个像素矩阵对象
        Matrix matrix = new Matrix().setResolution("640 * 320")
                                    .setExtName(".GIF")
                                    .setFileName(fileName);
        imageImp.doPaint(matrix);
    }

}
