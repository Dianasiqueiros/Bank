public class Card {
    private CardType type;
    private String clientName;
    private short expirationMonth;
    private short  expirationYear;

    public Card(CardType type, String clientName, short expirationMonth, short expirationYear) {
        this.type = type;
        this.clientName = clientName;
        this.expirationMonth=expirationMonth;
        this.expirationYear=expirationYear;
    }

    public CardType getType() {
        return type;
    }

    public void setType(CardType type) {
        this.type = type;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public short getExpirationMonth() {
        return expirationMonth;
    }

    public void setExpirationMonth(short expirationMonth) {
        this.expirationMonth = expirationMonth;
    }
    public short getExpirationYear() {
        return expirationYear;
    }

    public void setExpirationYear(short expirationYear) {
        this.expirationYear = expirationYear;
    }
}
