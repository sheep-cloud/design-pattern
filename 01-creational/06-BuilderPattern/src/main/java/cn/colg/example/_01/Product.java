package cn.colg.example._01;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 产品角色
 *
 * @author colg
 */
@Getter
@Setter
@Accessors(chain = true)
@ToString
public class Product {

    /*
     * colg  [复杂对象]
     *  复杂对象是指包含多个成员属性的对象
     */

    /** 定义部件，部件可以是任意类型，包括值类型和引用类型 */
    private String partA;
    private String partB;
    private String partC;
}
