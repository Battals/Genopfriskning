public class Bog {


    String titel;
    int udgivelsesår;

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public int getUdgivelsesår() {
        return udgivelsesår;
    }

    public void setUdgivelsesår(int udgivelsesår) {
        this.udgivelsesår = udgivelsesår;
    }

    public long getIsbnnummer() {
        return isbnnummer;
    }

    public void setIsbnnummer(long isbnnummer) {
        this.isbnnummer = isbnnummer;
    }

    long isbnnummer;

    Bog(String titel, int udgivelsesår, long isbnnummer){
        this.titel = titel;
        this.udgivelsesår = udgivelsesår;
        this.isbnnummer = isbnnummer;
    }

    @Override
    public String toString() {
        return "Bog{" +
                "titel='" + titel + '\'' +
                ", udgivelsesår=" + udgivelsesår +
                ", isbnnummer=" + isbnnummer +
                '}';
    }


}
