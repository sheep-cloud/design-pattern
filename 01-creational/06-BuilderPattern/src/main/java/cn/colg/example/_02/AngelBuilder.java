package cn.colg.example._02;

/**
 * 具体建造者 - 天使角色建造器
 *
 * @author colg
 */
public class AngelBuilder extends AbstractActorBuilder {

    @Override
    public void buildType() {
        actor.setType("天使");
    }

    @Override
    public void buildSex() {
        actor.setSex("女");
    }

    @Override
    public void buildFace() {
        actor.setFace("漂亮");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("白裙");
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("长发");
    }
}
