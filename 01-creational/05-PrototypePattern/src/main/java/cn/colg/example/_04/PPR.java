package cn.colg.example._04;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体原型类 - 《项目进展报告》(Project Progress Report, PPR)
 *
 * @author colg
 */
@Slf4j
public class PPR implements OfficialDocument {

    @Override
    public OfficialDocument shallowClone() throws CloneNotSupportedException {
        OfficialDocument ppr = (OfficialDocument)super.clone();
        return ppr;
    }

    @Override
    public void display() {
        log.info("《项目进展报告》");
    }
}
