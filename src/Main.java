import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap chieu dai");
        double height=scanner.nextDouble();
        System.out.println("nhap chieu rong");
        double width=scanner.nextDouble();
        hinhchunhat Hinhchunhat=new hinhchunhat(width,height);
        System.out.println("hinh chu nhat co kich thuoc" +Hinhchunhat.disPlay());
        System.out.println("dien tich hinh chu nhat la" +" " + Hinhchunhat.getArea());
        System.out.println("chu vi hinh chu nhat la" +" " + Hinhchunhat.getPerimeter());
    }
}