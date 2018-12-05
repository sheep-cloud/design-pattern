package cn.colg.learn._01;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 数据对象；模拟数据库中的数据
 *
 * @author colg
 */
@Getter
@Setter
@ToString
@Accessors(chain = true)
public class Data {

    /** 数据库类型 */
    private String dbType;

    /** 数据库名称 */
    private String schema;

    /** 文件格式 */
    private String extName;
}
