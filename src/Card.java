public class Card {
    private String type;
    private String clientName;
    private short expirationMonth;
    private short  expirationYear;

    public Card(String type, String clientName, short expirationMonth, short expirationYear) {
        this.type = type;
        this.clientName = clientName;
        this.expirationMonth=expirationMonth;
        this.expirationYear=expirationYear;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
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
