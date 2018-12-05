package cn.colg.example._04;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体原型类 - 软件需求规格说明书(Software Requirements Specification)类
 *
 * @author colg
 */
@Slf4j
public class SRS implements OfficialDocument {

    @Override
    public OfficialDocument shallowClone() throws CloneNotSupportedException {
        OfficialDocument srs = (OfficialDocument)super.clone();
        return srs;
    }

    @Override
    public void display() {
        log.info("《软件需求规格说明书》");
    }
}
