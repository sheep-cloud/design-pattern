package cn.colg.learn._01;

/**
 * 扩充抽象类
 *
 * @author colg
 */
public class Xml extends AbstractFile {

    @Override
    public void parseData(Data data) {
        db.convert(data.setExtName(".xml"));
    }
}
