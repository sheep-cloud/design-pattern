package cn.colg.learn._01;

/**
 * 扩充抽象类 - txt文件
 *
 * @author colg
 */
public class Txt extends AbstractFile {

    @Override
    public void parseData(Data data) {
        db.convert(data.setExtName(".txt"));
    }
}
