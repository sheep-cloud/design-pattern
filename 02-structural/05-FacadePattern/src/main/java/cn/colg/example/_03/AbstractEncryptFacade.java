package cn.colg.example._03;

/**
 * 外观角色 - 加密外观抽象类
 *
 * @author colg
 */
public abstract class AbstractEncryptFacade {

    /**
     * 读取文件，加密后写入新的文件
     *
     * @param pathSrc 读取文件路径
     * @param pathDes 写入文件路径
     * @author colg
     */
    public abstract void fileEncrypt(String pathSrc, String pathDes);
}
