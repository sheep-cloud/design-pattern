package cn.colg.example._01;

/**
 * 客户端
 *
 * @author colg
 */
public class Client {
    public static void main(String[] args) {
        Folder folder1, folder2, folder3;
        folder1 = new Folder("Jax的资料");
        folder2 = new Folder("图像文件夹");
        folder3 = new Folder("文本文件夹");

        ImageFile imageFile1, imageFile2;
        imageFile1 = new ImageFile("小龙女.jpg");
        imageFile2 = new ImageFile("张无忌.gif");
        
        TextFile textFile1, textFile2;
        textFile1 = new TextFile("九阴真经.txt");
        textFile2 = new TextFile("葵花宝典.txt");
        
        folder2.addImageFile(imageFile1)
               .addImageFile(imageFile2);
        
        folder3.addTextFile(textFile1)
               .addTextFile(textFile2);
        
        folder1.addFolder(folder2)
               .addFolder(folder3);
        
        folder1.killVirus();
    }
}
