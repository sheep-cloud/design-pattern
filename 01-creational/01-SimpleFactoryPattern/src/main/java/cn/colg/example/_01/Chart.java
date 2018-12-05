package cn.colg.example._01;

import lombok.extern.slf4j.Slf4j;

/**
 * 简单工厂模式（一）
 *
 * @author colg
 */
@Slf4j
public class Chart {

    /** 图表类型 */
    private String type;

    public Chart(Object[][] data, String type) {
        this.type = type;
        if ("histogram".equals(type)) {
            log.info("初始化柱状图");
        } else if ("pie".equals(type)) {
            log.info("初始化饼状图");
        } else if ("line".equals(type)) {
            log.info("初始化折线图");
        }
    }

    public void display() {
        if ("histogram".equals(this.type)) {
            log.info("显示柱状图");
        } else if ("pie".equals(this.type)) {
            log.info("显示饼状图");
        } else if ("line".equals(this.type)) {
            log.info("显示折线图");
        }
    }
}
