public class PhanSo {
    private int tuso;
    private int mauso;

    public PhanSo(int tuso, int mauso) {
        this.tuso = tuso;
        this.mauso = mauso;
    }
public PhanSo(){};

    public int getTuso() {
        return tuso;
    }

    public void setTuso(int tuso) {
        this.tuso = tuso;
    }

    public int getMauso() {
        return mauso;
    }

    public void setMauso(int mauso) {
        this.mauso = mauso;
    }

    public boolean check (int a, int b){
        return b != 0;
    }

    @Override
    public String toString() {
        return "PhanSo =" +
                tuso +
                "/" + mauso +
                " ; ";
    }
}
