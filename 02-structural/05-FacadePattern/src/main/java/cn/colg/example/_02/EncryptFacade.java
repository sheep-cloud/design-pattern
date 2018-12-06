package cn.colg.example._02;

/**
 * 外观角色 - 加密外观类
 *
 * @author colg
 */
public class EncryptFacade {

    /** 维持对子系统对象的引用 */
    private FileReader reader = new FileReader();
    private CipherMachine machine = new CipherMachine();
    private FileWriter writer = new FileWriter();

    /**
     * 读取文件，加密后写入新的文件；调用其他对象的业务方法
     *
     * @param pathSrc 读取文件路径
     * @param pathDes 写入文件路径
     * @author colg
     */
    public void fileEncrypt(String pathSrc, String pathDes) {
        String plainText = reader.read(pathSrc);
        String encryptStr = machine.encrypt(plainText);
        writer.write(encryptStr, pathDes);
    }
}
