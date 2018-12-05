package cn.colg.example._03.deep;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 具体原型类 - 工作周报WeeklyLog
 *
 * @author colg
 */
@Getter
@Setter
@ToString
@Accessors(chain = true)
public class WeeklyLog implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 姓名 */
    private String name;
    /** 周次 */
    private String date;
    /** 内容 */
    private String content;

    /** 附件 */
    private Attachment attachment;

    /**
     * 深克隆：使用序列化技术实现深克隆
     *
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public WeeklyLog deepClone() throws IOException, ClassNotFoundException {
        // 将对象写入流中
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(this);

        // 将对象从流中取出
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        return (WeeklyLog)ois.readObject();
    }
}
