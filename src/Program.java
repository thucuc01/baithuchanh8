import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Method method=new Method();
        Menus menus=new Menus();
        PhanSo phanso1=method.nhapPhanSo();
        System.out.println("phan so thu nhat: "+phanso1.toString());
        PhanSo phanso2=method.nhapPhanSo();
        System.out.println("phan so thu hai: "+phanso2.toString());

        do{
            menus.menu();
            int choice=Integer.parseInt(input.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Phan so thu nhat :");
                    System.out.println(method.checkToigian(phanso1));
                    System.out.println("Phan so thu hai :");
                    System.out.println(method.checkToigian(phanso2));
                    break;
                case 2:
                    System.out.print("Phan so 1 : ");
                    method.timToiGian(phanso1);
                    System.out.print("Phan so 2: ");
                    method.timToiGian(phanso2);
                    break;
                case 3:
                    PhanSo phanso3=method.add(phanso1,phanso2);
                    method.timToiGian(phanso3);
                    break;
                case 4:
                    PhanSo phanso4=method.tru(phanso1,phanso2);
                    System.out.println(phanso4.toString());
                    method.timToiGian(phanso4);
                    break;
                case 5:
                    PhanSo phanSo5=method.nhan(phanso1,phanso2);
                    method.timToiGian(phanSo5);
                    break;
                case 6:
                    PhanSo phanso6=method.chia(phanso1,phanso2);
                    method.timToiGian(phanso6);
                    break;
                default:
                    System.out.println("chua co chuc nang nay");

            }
        }while (true);






    }
}
