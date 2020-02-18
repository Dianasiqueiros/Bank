public class CreditCard extends Card {
    private double maxAmount;

    public CreditCard(CardType type, String clientName, short expirationMonth, short expirationYear, double maxAmount) {
        super(type, clientName, expirationMonth, expirationYear);
        this.maxAmount = maxAmount;
    }

    public double getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(double maxAmount) {
        this.maxAmount = maxAmount;
    }

    @Override
    public String toString(){
        return ("Se creo la tarjeta tipo: " + getType() + ",Monto maximo: " + getMaxAmount() + ",con fecha de expiracion: "+ getExpirationMonth() +"/"+ getExpirationYear());

    }
}
