package factoryMethod;

public abstract class MobileDetail {
    private String mobileName;
    private int prize ;

    public String getMobileName() {
        return mobileName;
    }

    public void setMobileName(String mobileName) {
        this.mobileName = mobileName;
    }

    public int getPrize() {
        return prize;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }

    public void showMobileDetail(){
        System.out.println("Mobile which is Manufacturing  " + getMobileName());
        System.out.println("Mobile Prize: " + getPrize());
    }

}
