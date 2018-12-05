package cn.colg.example._03;

/**
 * 抽象建造者 - 角色建造器
 *
 * @author colg
 */
public abstract class AbstractActorBuilder {

    protected Actor actor = new Actor();

    /**
     * 建造角色类型
     *
     * @author colg
     */
    public abstract void buildType();

    /**
     * 建造性别
     *
     * @author colg
     */
    public abstract void buildSex();

    /**
     * 建造脸型
     *
     * @author colg
     */
    public abstract void buildFace();

    /**
     * 建造服装
     *
     * @author colg
     */
    public abstract void buildCostume();

    /**
     * 建造发型
     *
     * @author colg
     */
    public abstract void buildHairstyle();
    
    /**
     * 引入钩子方法，判断是否是光头；光头不需要建造发型
     *
     * @return
     * @author colg
     */
    public boolean isBareheaded() {
        return false;
    }

    /**
     * 逐步构建复杂产品对象
     * 
     * <pre>
     * 省略指挥者角色；合并到抽象建造者中；简化系统结构
     * </pre>
     *
     * @return
     * @author colg
     */
    public Actor construct() {
        this.buildType();
        this.buildSex();
        this.buildFace();
        this.buildCostume();
        // 不是光头，建造发型
        if (!isBareheaded()) {
            this.buildHairstyle();
        }
        return actor;
    }
}
