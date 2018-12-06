package cn.colg.example._02;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;

/**
 * 功能键设置窗口类
 *
 * @author colg
 */
@Accessors(chain = true)
@Slf4j
public class FBSettingWindow {

    /** 窗口标题 */
    @Getter
    @Setter
    private String title;

    /** 定义一个List来存储所有功能键 */
    private List<FunctionButton> functionButtons = new ArrayList<>();

    public FBSettingWindow addFunctionButton(FunctionButton fb) {
        functionButtons.add(fb);
        return this;
    }

    public FBSettingWindow removeFunctionButton(FunctionButton fb) {
        functionButtons.remove(fb);
        return this;
    }

    /**
     * 显示窗口及功能键
     *
     * @author colg
     */
    public void display() {
        log.info("显示窗口 : {}", this.title);
        List<String> buttonNames = new ArrayList<>();
        functionButtons.forEach(e -> buttonNames.add(e.getName()));
        log.info("显示功能键: {}", buttonNames);
        log.info("----------------------------------------------------------------------------------------------------");
    }
}
