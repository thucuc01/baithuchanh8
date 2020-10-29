import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.Scanner;

public class Method {
    Scanner input=new Scanner(System.in);
    public PhanSo nhapPhanSo(){
        boolean check;
        PhanSo phanSo=new PhanSo();
        do{
            check=false;
            System.out.println("Moi nhap vao tu so :");
            phanSo.setTuso(Integer.parseInt(input.nextLine()));
            System.out.println("Moi nhap vao mau so :");
            phanSo.setMauso(Integer.parseInt(input.nextLine()));
            if(phanSo.getMauso()==0){
                System.out.println("Mau so khong the = 0 , Moi nhap lai : ");
                check=true;
            }
        }while (check);
        return phanSo;
    }

    public PhanSo add(PhanSo phanso1, PhanSo phanso2) {
        int tuso = phanso1.getTuso() * phanso2.getMauso() + phanso2.getTuso() * phanso1.getMauso();
        int mauso = phanso1.getMauso() * phanso2.getMauso();
        return new PhanSo(tuso, mauso);
    }

    public PhanSo tru(PhanSo phanso1, PhanSo phanso2) {
        int tuso = phanso1.getTuso() * phanso2.getMauso() - phanso2.getTuso() * phanso1.getMauso();
        int mauso = phanso1.getMauso() * phanso2.getMauso();
        return new PhanSo(tuso, mauso);
    }

    public PhanSo nhan(PhanSo phanso1, PhanSo phanso2) {
        int tuso = phanso1.getTuso() * phanso2.getTuso();
        int mauso = phanso1.getMauso() * phanso2.getMauso();
        return new PhanSo(tuso, mauso);
    }

    public PhanSo chia(PhanSo phanso1, PhanSo phanso2) {
        int tuso = phanso1.getTuso() * phanso2.getMauso();
        int mauso = phanso1.getMauso() * phanso2.getTuso();
        return new PhanSo(tuso, mauso);
    }

    public boolean checkToigian(PhanSo phanSo) {
        int uocchung = timUCLN(phanSo.getTuso(), phanSo.getMauso());
        if(uocchung==1){
            return true;
        } else
            return false;
    }

    public int timUCLN(int tuso, int mauso) {
        int uocchungMax = 1;
        int min ;

        if (Math.abs(tuso) > Math.abs(mauso)) {
            min = Math.abs(mauso);
        } else {
            min = Math.abs(tuso);
        }
        for (int i = min; i > 1; i--) {
            if (mauso % i == 0 && tuso % i == 0) {
                uocchungMax = i;
                break;
            }
        }
        return uocchungMax;
    }

    public void timToiGian(PhanSo phanSo){
        int a= phanSo.getTuso();
        int b= phanSo.getMauso();
        if(a==0){
            System.out.println("Ket qua: "+0);
        }else
            if(!checkToigian(phanSo)){
                if(a%b==0){
                    int c=a/b;
                    System.out.println("Ket qua: "+c);
                } else {
                    int ucln=timUCLN(a,b);
                    phanSo.setTuso(a/ucln);
                    phanSo.setMauso(b/ucln);
                    System.out.println("Ket qua: "+phanSo.toString());
                }
            } else
                System.out.println("Ket qua: "+phanSo.toString());
    }

}
