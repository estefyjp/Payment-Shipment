package Payment;

public class Payment {
    public String cardName;
    public String nameT;
    public String numeroTarjeta;
    public int codigoSeg;
    public String fechaVen;
    public String correo;


    public void print(){
        System.out.println("El nombre de la tarjeta es..." + cardName);
        System.out.println("El nombre del usuario es..." + nameT);
        System.out.println("El numero de la tarjeta es..." + numeroTarjeta);
        System.out.println("El codigo de seguridad es..." + codigoSeg);
        System.out.println("La fecha de vencimiento es..." + fechaVen);
        System.out.println("El correo electronico del usuario es..." + correo);

    }
    public String getCardName(){
        return cardName;
    }
    public void setCardName(String cardName){
        this.cardName=cardName;
    }
    public void setNombreTarjetaHabiente(String nameT){
        this.nameT=nameT;
    }
    public String getNombreTarjetaHabiente(){
        return nameT;
    }
    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public int getCodigoSeg() {
        return codigoSeg;
    }

    public String getFechaVen() {
        return fechaVen;
    }

    public String getCorreo() {
        return correo;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public void setCodigoSeg(int codigoSeg) {
        this.codigoSeg = codigoSeg;
    }

    public void setFechaVen(String fechaVen) {
        this.fechaVen = fechaVen;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    }

