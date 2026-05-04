package testcase;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Issue 1: Kiểm thử hộp trắng - Luồng xử lý HỢP LỆ (Happy Path)
 * Mục tiêu: 100% Statement Coverage + 100% Branch Coverage (nhánh đúng)
 */
public class BaiThucHanh04Test_Issue1 {

    // ===================== BÀI 1: Chu vi hình chữ nhật =====================
    @Test
    void testChuViHCN_hopLe_soNguyen() {
        assertEquals(14.0, BaiThucHanh04.chuViHCN(5, 2));
    }

    @Test
    void testChuViHCN_hopLe_soThapPhan() {
        assertEquals(10.6, BaiThucHanh04.chuViHCN(3.5, 1.8), 0.001);
    }

    // ===================== BÀI 2: Diện tích hình chữ nhật =====================
    @Test
    void testDienTichHCN_hopLe_soNguyen() {
        assertEquals(15.0, BaiThucHanh04.dienTichHCN(5, 3));
    }

    @Test
    void testDienTichHCN_hopLe_soThapPhan() {
        assertEquals(6.25, BaiThucHanh04.dienTichHCN(2.5, 2.5), 0.001);
    }

    // ===================== BÀI 3: Giải phương trình bậc 2 =====================
    @Test
    void testPhuongTrinh_haiNghiemPhanBiet() {
        // x^2 - 5x + 6 = 0 => x1=3, x2=2
        String result = BaiThucHanh04.giaiPhuongTrinhBac2(1, -5, 6);
        assertTrue(result.contains("x1") && result.contains("x2"));
    }

    @Test
    void testPhuongTrinh_nghiemKep() {
        // x^2 + 2x + 1 = 0 => x = -1
        assertEquals("Nghiệm kép: x = -1.0", BaiThucHanh04.giaiPhuongTrinhBac2(1, 2, 1));
    }

    @Test
    void testPhuongTrinh_voNghiem() {
        // x^2 + 1 = 0 => delta < 0
        assertEquals("Phương trình vô nghiệm", BaiThucHanh04.giaiPhuongTrinhBac2(1, 0, 1));
    }

    // ===================== BÀI 4: Số ngày trong tháng =====================
    @Test
    void testSoNgay_thang31() {
        assertEquals(31, BaiThucHanh04.soNgayTrongThang(1, 2024)); // tháng 1
        assertEquals(31, BaiThucHanh04.soNgayTrongThang(7, 2024)); // tháng 7
    }

    @Test
    void testSoNgay_thang30() {
        assertEquals(30, BaiThucHanh04.soNgayTrongThang(4, 2024)); // tháng 4
        assertEquals(30, BaiThucHanh04.soNgayTrongThang(11, 2024)); // tháng 11
    }

    @Test
    void testSoNgay_thang2_namNhuan() {
        assertEquals(29, BaiThucHanh04.soNgayTrongThang(2, 2024)); // 2024 là năm nhuận
    }

    @Test
    void testSoNgay_thang2_khongNhuan() {
        assertEquals(28, BaiThucHanh04.soNgayTrongThang(2, 2023)); // 2023 không nhuận
    }

    @Test
    void testNamNhuan_chia400() {
        assertTrue(BaiThucHanh04.isNamNhuan(2000)); // chia hết 400
    }

    @Test
    void testNamNhuan_chia4_khong100() {
        assertTrue(BaiThucHanh04.isNamNhuan(2024)); // chia hết 4, không chia hết 100
    }

    @Test
    void testKhongNhuan_chia100_khong400() {
        assertFalse(BaiThucHanh04.isNamNhuan(1900)); // chia hết 100 nhưng không 400
    }

    // ===================== BÀI 5: Kiểm tra số nguyên tố =====================
    @Test
    void testSoNguyenTo_2() {
        assertTrue(BaiThucHanh04.laSoNguyenTo(2));
    }

    @Test
    void testSoNguyenTo_7() {
        assertTrue(BaiThucHanh04.laSoNguyenTo(7));
    }

    @Test
    void testSoNguyenTo_13() {
        assertTrue(BaiThucHanh04.laSoNguyenTo(13));
    }

    @Test
    void testKhongNguyenTo_4() {
        assertFalse(BaiThucHanh04.laSoNguyenTo(4));
    }

    @Test
    void testKhongNguyenTo_9() {
        assertFalse(BaiThucHanh04.laSoNguyenTo(9));
    }

    // ===================== BÀI 6: Tổng S = 1 - 2 + 3 - ... + n =====================
    @Test
    void testTongS_n1() {
        assertEquals(1, BaiThucHanh04.tinhTongS(1)); // S = 1
    }

    @Test
    void testTongS_n2() {
        assertEquals(-1, BaiThucHanh04.tinhTongS(2)); // S = 1 - 2 = -1
    }

    @Test
    void testTongS_n4() {
        assertEquals(-2, BaiThucHanh04.tinhTongS(4)); // S = 1-2+3-4 = -2
    }

    @Test
    void testTongS_n5() {
        assertEquals(3, BaiThucHanh04.tinhTongS(5)); // S = 1-2+3-4+5 = 3
    }

    // ===================== BÀI 7: ƯCLN =====================
    @Test
    void testUCLN_12_8() {
        assertEquals(4, BaiThucHanh04.ucln(12, 8));
    }

    @Test
    void testUCLN_nguyenTo() {
        assertEquals(1, BaiThucHanh04.ucln(7, 13));
    }

    @Test
    void testUCLN_bangNhau() {
        assertEquals(5, BaiThucHanh04.ucln(5, 5));
    }

    @Test
    void testUCLN_soLon() {
        assertEquals(6, BaiThucHanh04.ucln(48, 18));
    }

    // ===================== BÀI 8: Tổng S = 1! + 2! + ... + n! =====================
    @Test
    void testGiaiThua_0() {
        assertEquals(1, BaiThucHanh04.giaiThua(0));
    }

    @Test
    void testGiaiThua_1() {
        assertEquals(1, BaiThucHanh04.giaiThua(1));
    }

    @Test
    void testGiaiThua_5() {
        assertEquals(120, BaiThucHanh04.giaiThua(5));
    }

    @Test
    void testTongGiaiThua_n1() {
        assertEquals(1, BaiThucHanh04.tinhTongGiaiThua(1)); // 1! = 1
    }

    @Test
    void testTongGiaiThua_n3() {
        assertEquals(9, BaiThucHanh04.tinhTongGiaiThua(3)); // 1+2+6 = 9
    }

    @Test
    void testTongGiaiThua_n4() {
        assertEquals(33, BaiThucHanh04.tinhTongGiaiThua(4)); // 1+2+6+24 = 33
    }
}