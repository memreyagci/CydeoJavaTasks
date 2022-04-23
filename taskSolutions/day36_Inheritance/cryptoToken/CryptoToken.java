package day36_Inheritance.cryptoToken;

public class CryptoToken {
    private double price, marketCap, volume;
    private int quantity, circulatingSupply;
    private boolean isMineable;

    public void setPrice(double price) {
        this.price = price;
    }

    public void setMarketCap(double marketCap) {
        this.marketCap = marketCap;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setCirculatingSupply(int circulatingSupply) {
        this.circulatingSupply = circulatingSupply;
    }

    public void setMineable(boolean mineable) {
        isMineable = mineable;
    }

    public void setInfo(double price, double marketCap, double volume, int quantity, int circulatingSupply, boolean isMineable) {
        setPrice(price);
        setMarketCap(marketCap);
        setVolume(volume);
        setQuantity(quantity);
        setCirculatingSupply(circulatingSupply);
        setMineable(isMineable);
    }

    public double totalPrice() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return "CryptoToken{" +
                "price=" + price +
                ", marketCap=" + marketCap +
                ", volume=" + volume +
                ", quantity=" + quantity +
                ", circulatingSupply=" + circulatingSupply +
                ", isMineable=" + isMineable +
                '}';
    }
}
/*
CryptoToken Task
	1. create a class called CryptoToken
			variables:
				price, quantity, marketCap, volume, circulatingSupply, isMineable (boolean)



			methods:
				setInfo()
				toString()
				totalPrice(): returns the total price of the cyrpto totek ( price * quantity)

	2. create 5 sub classes of CryptoToken:
			Bitcoin
			Ethereum
			Cardano
			XRP
			Doge

	3. create a class named MyWallet

		create one object of each CryptoToken

		calculate the total Asset
 */