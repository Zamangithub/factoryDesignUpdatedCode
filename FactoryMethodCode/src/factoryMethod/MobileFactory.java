package factoryMethod;

public class MobileFactory {
    public static MobileDetail createMobile(MobileAvailable mobile) {
        switch (mobile) {
            case IPHONE:
                return new Iphone();
            case REAL_ME:
                return new RealMe();

            case SAMSUNG:
                return new Samsung();
            default:
            return null;
        }
    }
}




