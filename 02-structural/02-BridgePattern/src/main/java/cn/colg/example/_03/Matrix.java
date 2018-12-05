package cn.colg.example._03;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 像素矩阵类：辅助类，各种格式的文件最终都被转化为像素矩阵，不同的操作系统提供不同的方式显示像素矩阵
 *
 * @author colg
 */
@Getter
@Setter
@ToString
@Accessors(chain = true)
public class Matrix {

    /** 分辨率 */
    private String resolution;

    /** 扩展名 */
    private String extName;

    /** 文件名称 */
    private String fileName;

    // 此处代码省略
}
