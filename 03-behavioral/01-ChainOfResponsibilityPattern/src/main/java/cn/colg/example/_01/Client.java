package cn.colg.example._01;

/**
 * 客户端
 *
 * @author colg
 */
public class Client {
    public static void main(String[] args) {
        PurchaseRequestHandler requestHandler = new PurchaseRequestHandler();
        PurchaseRequest request = new PurchaseRequest(100000);
        requestHandler.sendRequestToDirector(request);
    }
}
