package cn.colg.example._03;

/**
 * 具体建造者 - 英雄角色建造器
 *
 * @author colg
 */
public class HeroBuilder extends AbstractActorBuilder {

    @Override
    public void buildType() {
        actor.setType("英雄");
    }

    @Override
    public void buildSex() {
        actor.setSex("男");
    }

    @Override
    public void buildFace() {
        actor.setFace("英俊");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("盔甲");
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("短发");
    }
}
