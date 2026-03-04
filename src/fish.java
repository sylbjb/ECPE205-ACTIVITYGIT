import java.util.Scanner;

public class fish {
    private String uga;
    private String lamayo;
    private String bangrus;

    public fish(String uga, String lamayo, String bangrus){
        this.uga = uga;
        this.lamayo = lamayo;
        this.bangrus = bangrus;
    }

    public String getUga() {
        return uga;
    }

    public void setUga(String uga) {
        this.uga = uga;
    }

    public String getLamayo() {
        return lamayo;
    }

    public void setLamayo(String lamayo) {
        this.lamayo = lamayo;
    }

    public String getBangrus() {
        return bangrus;
    }

    public void setBangrus(String bangrus) {
        this.bangrus = bangrus;
    }
}