public class DebitCard extends Card{
    private double minAmount;

    public DebitCard(CardType type, String clientName, short expirationMonth, short expirationYear, double minAmount) {
        super(type, clientName, expirationMonth, expirationYear);
        this.minAmount = minAmount;
    }

    public double getMinAmount() {
        return minAmount;
    }

    public void setMinAmount(double minAmount) {
        this.minAmount = minAmount;
    }

    @Override
    public String toString(){
        return ("Se creo la tarjeta tipo: " + getType() + ",Monto mimino: " + getMinAmount()+ ",con fecha de expiracion: "+ getExpirationMonth() +"/"+ getExpirationYear());
    }
}
