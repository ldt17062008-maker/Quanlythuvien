package quanlythuvien;

public class Quanlythuvien {
    public static void timKiem(Book[] danhSach, String maCanTim) {
        for (Book sach : danhSach) {
            if (sach.getMaSach().equals(maCanTim)) {
                System.out.println("Tim thay sach:");
                sach.hienThi();
                return;
            }
        }
        System.out.println("Khong tim thay sach co ma: " + maCanTim);
    }

    public static void main(String[] args) {
        Book sach1 = new Book("B001", "Lap trinh Java", "Nguyen Van A");
        Book sach2 = new Book("B002", "Co so du lieu", "Tran Thi B");
        Book[] danhSach = {sach1, sach2};

        System.out.println("--- Tim kiem B001 ---");
        timKiem(danhSach, "B001");
    }
}