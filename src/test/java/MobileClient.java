
import mobile.MobileCodeWS;
import mobile.MobileCodeWSSoap;

public class MobileClient {
    public static void main(String[] args) {
        MobileCodeWSSoap mobileSearch=new MobileCodeWS().getPort(MobileCodeWSSoap.class);
        String info = mobileSearch.getMobileCodeInfo("15139796195", null);
        System.out.println(info);


    }
}
