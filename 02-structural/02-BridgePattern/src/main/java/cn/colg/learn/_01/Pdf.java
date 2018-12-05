package cn.colg.learn._01;

/**
 * 扩充抽象类 - pdf文件
 *
 * @author colg
 */
public class Pdf extends AbstractFile {

    @Override
    public void parseData(Data data) {
        db.convert(data.setExtName(".pdf"));
    }
}
