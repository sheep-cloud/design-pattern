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
        if (type.equals("histogram")) {
            log.info("初始化柱状图");
        } else if (type.equals("pie")) {
            log.info("初始化饼状图");
        } else if (type.equals("line")) {
            log.info("初始化折线图");
        }
    }

    public void display() {
        if (this.type.equals("histogram")) {
            log.info("显示柱状图");
        } else if (this.type.equals("pie")) {
            log.info("显示饼状图");
        } else if (this.type.equals("line")) {
            log.info("显示折线图");
        }
    }
}
