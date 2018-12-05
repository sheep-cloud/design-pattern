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
        // example._02=cn.colg.example._02.AngelBuilder
        AbstractActorBuilder builder = (AbstractActorBuilder)IniUtil.getBean("example._02");

        ActorController actorController = new ActorController();
        actorController.construct(builder);
        
        Actor actor = builder.createActor();
        log.info("actor : {}", actor);
    }
}
