package cn.colg.example._02;

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
     * 工厂方法；返回一个完整的游戏角色对象
     *
     * @return
     * @author colg
     */
    public Actor createActor() {
        return actor;
    }
}
