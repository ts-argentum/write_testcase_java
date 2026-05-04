package testcase;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Issue 2: Kiểm thử hộp trắng - Nhánh lỗi, điều kiện biên, vòng lặp và ngoại lệ
 * Mục tiêu: Bao phủ tất cả nhánh FALSE, giá trị biên, ngoại lệ (exception)
 */
public class BaiThucHanh04Test_Issue2 {

    // ===================== BÀI 1: Chu vi - Ngoại lệ & Biên =====================
    @Test
    void testChuViHCN_daiAm_ngoaiLe() {
        assertThrows(IllegalArgumentException.class,
            () -> BaiThucHanh04.chuViHCN(-1, 5));
    }

    @Test
    void testChuViHCN_rongAm_ngoaiLe() {
        assertThrows(IllegalArgumentException.class,
            () -> BaiThucHanh04.chuViHCN(5, -3));
    }

    @Test
    void testChuViHCN_daiZero_ngoaiLe() {
        assertThrows(IllegalArgumentException.class,
            () -> BaiThucHanh04.chuViHCN(0, 5));
    }

    @Test
    void testChuViHCN_rongZero_ngoaiLe() {
        assertThrows(IllegalArgumentException.class,
            () -> BaiThucHanh04.chuViHCN(5, 0));
    }

    // ===================== BÀI 2: Diện tích - Ngoại lệ & Biên =====================
    @Test
    void testDienTichHCN_daiAm_ngoaiLe() {
        assertThrows(IllegalArgumentException.class,
            () -> BaiThucHanh04.dienTichHCN(-2, 4));
    }

    @Test
    void testDienTichHCN_rongAm_ngoaiLe() {
        assertThrows(IllegalArgumentException.class,
            () -> BaiThucHanh04.dienTichHCN(4, -2));
    }

    @Test
    void testDienTichHCN_zero_ngoaiLe() {
        assertThrows(IllegalArgumentException.class,
            () -> BaiThucHanh04.dienTichHCN(0, 3));
    }

    // ===================== BÀI 3: Phương trình - Nhánh đặc biệt =====================
    @Test
    void testPhuongTrinh_aBang0_khongPhaiBac2() {
        assertEquals("Không phải phương trình bậc 2",
            BaiThucHanh04.giaiPhuongTrinhBac2(0, 2, 1));
    }

    // ===================== BÀI 4: Số ngày - Ngoại lệ & Biên tháng =====================
    @Test
    void testSoNgay_thang0_ngoaiLe() {
        assertThrows(IllegalArgumentException.class,
            () -> BaiThucHanh04.soNgayTrongThang(0, 2024));
    }

    @Test
    void testSoNgay_thang13_ngoaiLe() {
        assertThrows(IllegalArgumentException.class,
            () -> BaiThucHanh04.soNgayTrongThang(13, 2024));
    }

    @Test
    void testSoNgay_namAm_ngoaiLe() {
        assertThrows(IllegalArgumentException.class,
            () -> BaiThucHanh04.soNgayTrongThang(5, -1));
    }

    @Test
    void testSoNgay_namZero_ngoaiLe() {
        assertThrows(IllegalArgumentException.class,
            () -> BaiThucHanh04.soNgayTrongThang(5, 0));
    }

    @Test
    void testNamNhuan_khongChia4() {
        assertFalse(BaiThucHanh04.isNamNhuan(2023)); // không chia hết 4
    }

    // ===================== BÀI 5: Số nguyên tố - Biên & Nhánh lỗi =====================
    @Test
    void testSoNguyenTo_soAm() {
        assertFalse(BaiThucHanh04.laSoNguyenTo(-5));
    }

    @Test
    void testSoNguyenTo_so0() {
        assertFalse(BaiThucHanh04.laSoNguyenTo(0));
    }

    @Test
    void testSoNguyenTo_so1() {
        assertFalse(BaiThucHanh04.laSoNguyenTo(1));
    }

    @Test
    void testKhongNguyenTo_soChan() {
        assertFalse(BaiThucHanh04.laSoNguyenTo(10));
    }

    @Test
    void testKhongNguyenTo_binh_phuong() {
        assertFalse(BaiThucHanh04.laSoNguyenTo(25)); // 5*5
    }

    // ===================== BÀI 6: Tổng S - Biên & Ngoại lệ =====================
    @Test
    void testTongS_soAm_ngoaiLe() {
        assertThrows(IllegalArgumentException.class,
            () -> BaiThucHanh04.tinhTongS(-1));
    }

    @Test
    void testTongS_soZero_ngoaiLe() {
        assertThrows(IllegalArgumentException.class,
            () -> BaiThucHanh04.tinhTongS(0));
    }

    // ===================== BÀI 7: ƯCLN - Biên & Ngoại lệ =====================
    @Test
    void testUCLN_aZero_ngoaiLe() {
        assertThrows(IllegalArgumentException.class,
            () -> BaiThucHanh04.ucln(0, 5));
    }

    @Test
    void testUCLN_bZero_ngoaiLe() {
        assertThrows(IllegalArgumentException.class,
            () -> BaiThucHanh04.ucln(5, 0));
    }

    @Test
    void testUCLN_soAm_vanChayDung() {
        // ucln(-12, 8) => Math.abs => ucln(12, 8) = 4
        assertEquals(4, BaiThucHanh04.ucln(-12, 8));
    }

    @Test
    void testUCLN_caTwoAm() {
        assertEquals(3, BaiThucHanh04.ucln(-9, -6));
    }

    // ===================== BÀI 8: Giai thừa & Tổng - Biên & Ngoại lệ =====================
    @Test
    void testGiaiThua_soAm_ngoaiLe() {
        assertThrows(IllegalArgumentException.class,
            () -> BaiThucHanh04.giaiThua(-1));
    }

    @Test
    void testTongGiaiThua_soAm_ngoaiLe() {
        assertThrows(IllegalArgumentException.class,
            () -> BaiThucHanh04.tinhTongGiaiThua(-1));
    }

    @Test
    void testTongGiaiThua_zero_ngoaiLe() {
        assertThrows(IllegalArgumentException.class,
            () -> BaiThucHanh04.tinhTongGiaiThua(0));
    }

    @Test
    void testTongGiaiThua_bien_n1() {
        // Biên dưới hợp lệ nhất
        assertEquals(1, BaiThucHanh04.tinhTongGiaiThua(1));
    }
}