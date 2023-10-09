package p1;

public class Main {



    public static void main(String[] args) {

        Phone inf = new ApplePhone("89095673554","iphone15",171);
        Phone inf1 = new XiaomiPhone("89125463654","Xiaomi 12",160 );
        Phone inf3 = new SamsungPhone("89505674348","Galaxy S22",167);
        Phone call = new ApplePhone("Ivan");
        Phone call1 = new XiaomiPhone("Masha");
        Phone call2 = new SamsungPhone("Dasha");
        call.receiveCall();
        inf.Info();
        call1.receiveCall();
        inf1.Info();
        call2.receiveCall();
        inf3.Info();








    }
}