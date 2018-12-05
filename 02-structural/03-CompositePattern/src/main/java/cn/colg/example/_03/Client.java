package cn.colg.example._03;

/**
 * 客户端
 *
 * @author colg
 */
public class Client {
    public static void main(String[] args) {
        AbstractFile folder1, folder2, folder3, folder4, file1, file2, file3, file4, file5;
        folder1 = new Folder("Jax的资料");
        folder2 = new Folder("图像文件夹");
        folder3 = new Folder("文本文件夹");
        folder4 = new Folder("视频文件夹");
        
        file1 = new ImageFile("小龙女.jpg");
        file2 = new ImageFile("张无忌.gif");
        
        file3 = new TextFile("九阴真经.txt");
        file4 = new TextFile("葵花宝典.txt");
        
        file5 = new VideoFile("笑傲江湖.rmvb");
        
        folder2.add(file1)
               .add(file2);
        
        folder3.add(file3)
               .add(file4);

        folder4.add(file5);
        
        folder1.add(folder2)
               .add(folder3)
               .add(folder4);
        
        // 从"Jax的资料"节点开始进行杀毒操作
        folder1.killVirus();
    }
}
