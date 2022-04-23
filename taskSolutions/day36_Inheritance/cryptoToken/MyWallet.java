package day36_Inheritance.cryptoToken;

public class MyWallet {
    public static void main(String[] args) {
        Bitcoin bitcoin = new Bitcoin();
        bitcoin.setInfo(32312, 32133, 3213, 323, 3213, true);
        System.out.println(bitcoin);

        Ethereum ethereum = new Ethereum();
        ethereum.setInfo(32312, 32133, 3213, 323, 3213, true);
        System.out.println(ethereum);

        Cardano cardano = new Cardano();
        cardano.setInfo(32312, 32133, 3213, 323, 3213, false);
        System.out.println(cardano);

        XRP xrp = new XRP();
        xrp.setInfo(32312, 32133, 3213, 323, 3213, false);
        System.out.println(xrp);

        Doge doge = new Doge();
        doge.setInfo(32312, 32133, 3213, 323, 3213, true);
        System.out.println(doge);

        System.out.printf("Total asset is: %f", (bitcoin.totalPrice() + ethereum.totalPrice() + cardano.totalPrice() + xrp.totalPrice() + doge.totalPrice()));
    }
}
