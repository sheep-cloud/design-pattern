package cn.colg.example._04;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体原型类 - 可行性分析报告(Feasibility Analysis Report)类
 *
 * @author colg
 */
@Slf4j
public class FAR implements OfficialDocument {

    @Override
    public OfficialDocument shallowClone() throws CloneNotSupportedException {
        OfficialDocument far = (OfficialDocument)super.clone();
        return far;
    }

    @Override
    public void display() {
        log.info("《可行性分析报告》");
    }
}
