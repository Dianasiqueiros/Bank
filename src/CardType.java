public enum CardType {
    DEBITO, CREDITO;

    public static CardType fromString(String value){
        if(value.equalsIgnoreCase("credito")){
            return CREDITO;
        }else{
            return DEBITO;
        }
    }
}
