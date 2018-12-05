package cn.colg.example._02;

import cn.colg.util.IniUtil;
import lombok.extern.slf4j.Slf4j;

/**
 * 客户端
 *
 * @author colg
 */
@Slf4j
public class Client {
    public static void main(String[] args) {
        ScoreOperation operation = (ScoreOperation)IniUtil.getBean("example._02");

        // 定义成绩数组
        int scores[] = {84, 76, 50, 69, 90, 91, 88, 96};

        log.info("成绩排序结果 : {}", operation.sort(scores));
        log.info("查找成绩90 : {}", operation.search(scores, 90));
        log.info("查找成绩92 : {}", operation.search(scores, 92));
    }
}
