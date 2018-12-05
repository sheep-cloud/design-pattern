package cn.colg.example._02;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 产品角色 - 游戏角色
 *
 * @author colg
 */
@Getter
@Setter
@ToString
@Accessors(chain = true)
public class Actor {

    /** 角色类型 */
    private String type;
    /** 性别 */
    private String sex;
    /** 脸型 */
    private String face;
    /** 服装 */
    private String costume;
    /** 发型 */
    private String hairstyle;
}
