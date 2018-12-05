package cn.colg.example._02;

/**
 * 指挥者 - 游戏角色创建控制器
 *
 * @author colg
 */
public class ActorController {

    /**
     * 逐步构建复杂产品对象
     *
     * @param builder 角色建造器
     * @return
     * @author colg
     */
    public Actor construct(AbstractActorBuilder builder) {
        builder.buildType();
        builder.buildSex();
        builder.buildFace();
        builder.buildCostume();
        builder.buildHairstyle();
        return builder.createActor();
    }
}
