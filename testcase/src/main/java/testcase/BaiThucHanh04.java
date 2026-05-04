package testcase;

public class BaiThucHanh04 {
 
    // ===================== BÀI 1: Chu vi hình chữ nhật =====================
    public static double chuViHCN(double dai, double rong) {
        if (dai <= 0 || rong <= 0)
            throw new IllegalArgumentException("Chiều dài và rộng phải > 0");
        return 2 * (dai + rong);
    }
 
    // ===================== BÀI 2: Diện tích hình chữ nhật =====================
    public static double dienTichHCN(double dai, double rong) {
        if (dai <= 0 || rong <= 0)
            throw new IllegalArgumentException("Chiều dài và rộng phải > 0");
        return dai * rong;
    }
 
    // ===================== BÀI 3: Giải phương trình bậc 2 =====================
    public static String giaiPhuongTrinhBac2(double a, double b, double c) {
        if (a == 0) return "Không phải phương trình bậc 2";
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            return "Phương trình vô nghiệm";
        } else if (delta == 0) {
            double x = -b / (2 * a);
            return "Nghiệm kép: x = " + x;
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            return "x1 = " + x1 + ", x2 = " + x2;
        }
    }
 
    // ===================== BÀI 4: Số ngày trong một tháng =====================
    public static boolean isNamNhuan(int nam) {
        return (nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0);
    }
 
    public static int soNgayTrongThang(int thang, int nam) {
        if (thang < 1 || thang > 12)
            throw new IllegalArgumentException("Tháng không hợp lệ (1-12)");
        if (nam <= 0)
            throw new IllegalArgumentException("Năm phải > 0");
        switch (thang) {
            case 1: case 3: case 5: case 7:
            case 8: case 10: case 12: return 31;
            case 4: case 6: case 9: case 11: return 30;
            case 2: return isNamNhuan(nam) ? 29 : 28;
            default: return -1;
        }
    }
 
    // ===================== BÀI 5: Kiểm tra số nguyên tố =====================
    public static boolean laSoNguyenTo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
 
    // ===================== BÀI 6: Tính S = 1 - 2 + 3 - 4 + ... + n =====================
    public static long tinhTongS(int n) {
        if (n < 1)
            throw new IllegalArgumentException("n phải >= 1");
        long tong = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) tong -= i;
            else tong += i;
        }
        return tong;
    }
 
    // ===================== BÀI 7: Tìm ƯCLN =====================
    public static int ucln(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0)
            throw new IllegalArgumentException("a và b phải khác 0");
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
 
    // ===================== BÀI 8: Tổng S = 1! + 2! + 3! + ... + n! =====================
    public static long giaiThua(int n) {
        if (n < 0)
            throw new IllegalArgumentException("n phải >= 0");
        long gt = 1;
        for (int i = 2; i <= n; i++) {
            gt *= i;
        }
        return gt;
    }
 
    public static long tinhTongGiaiThua(int n) {
        if (n < 1)
            throw new IllegalArgumentException("n phải >= 1");
        long tong = 0;
        for (int i = 1; i <= n; i++) {
            tong += giaiThua(i);
        }
        return tong;
    }
}