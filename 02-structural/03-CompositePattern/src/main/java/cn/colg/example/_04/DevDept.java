package cn.colg.example._04;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;

/**
 * 叶子构件 - 研发部
 *
 * @author colg
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Slf4j
public class DevDept extends AbstractUnit {

    private String name;

    @Override
    public void sendNotification() {
        log.info("研发部 [{}] 发布通知", name);
    }
}
