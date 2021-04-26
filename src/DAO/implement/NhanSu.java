package DAO.implement;

import DAO.INhanSu;
import Mapper.NhanSuMapper;
import Model.NhanSuModel;
import java.util.List;

/**
 *
 * @author Iroha
 */
public class NhanSu extends DataSource<NhanSuModel> implements INhanSu{

    @Override
    public List<NhanSuModel> getListNhanSu() {
        String sql = "Select * from dbo.NhanSu";
        return excute(sql, new NhanSuMapper());
    }

    @Override
    public boolean updateNS(int BacLuong, double PhuCap, String maNS, String hoTen, String ngaySinh, String queQuan, String danToc, String soDienThoai, String trinhDoHocVan, String ChuyenNganh, String maPB, String maCV, String chinhTri, String doanThe, boolean gioiTinh, byte[] anh) {
        String sql = "UPDATE dbo.NhanSu SET HoTen=?, NgaySinh=?, QueQuan=?, GioiTinh=?, DanToc=?, SoDienThoai=?, TrinhDoHocVan=?, ChuyenNganh=?, MaPB=?, MaCV = ?, ChinhTri=?, DoanThe=?, BacLuong=?, PhuCap=?, Anh=? WHERE MaNS=?";
        return update(sql, hoTen, ngaySinh, queQuan, gioiTinh, danToc, soDienThoai, trinhDoHocVan, ChuyenNganh, maPB, maCV, chinhTri, doanThe, BacLuong, PhuCap, anh, maNS);
    }

    @Override
    public NhanSuModel getNhanSu(String MaNS) {
        String sql = "Select * from dbo.NhanSu WHERE MaNS=?";
        List<NhanSuModel> result = excute(sql, new NhanSuMapper(), MaNS);
        return result.isEmpty() ? null : result.get(0);
    }

    @Override
    public boolean upadteAVT(String MaNS, byte[] anh) {
        String sql = "Update dbo.NhanSu SET Anh=? WHERE MaNS=?";
        return update(sql, anh, MaNS);
    }
    
}
