package cn.colg.example._03;

/**
 * 外观角色 - 加密外观类
 *
 * @author colg
 */
public class NewEncryptFacade extends AbstractEncryptFacade {

    /** 维持对子系统对象的引用 */
    private FileReader reader = new FileReader();
    private NewCipherMachine machine = new NewCipherMachine();
    private FileWriter writer = new FileWriter();

    @Override
    public void fileEncrypt(String pathSrc, String pathDes) {
        String plainText = reader.read(pathSrc);
        String encryptStr = machine.encrypt(plainText);
        writer.write(encryptStr, pathDes);
    }
}
