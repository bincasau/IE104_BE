package ie104.doAn.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "tour")
public class Tour {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_tour")
    private int maTour;

    @Column(name = "ten_tour")
    private String tenTour;

    @Column(name = "dia_diem")
    private String diaDiem;

    @Column(name = "mo_ta")
    private String moTa;

    @Column(name = "thong_tin_tour", columnDefinition = "LONGTEXT")
    private String thongTinToue;

    @Column(name = "diem_noi_bat", columnDefinition = "LONGTEXT")
    private String diemNoiBat;

    @Column(name = "lo_trinh", columnDefinition = "LONGTEXT")
    private String loTrinh;

    @Column(name = "mien")
    private String mien;

    @Column(name = "giam_gia")
    private float giamGia;

    @Column(name = "gia_tour")
    private float giaTour;

    @Column(name = "diem_khoi_hanh")
    private String diemKhoiHanh;

    @OneToMany(mappedBy = "tour", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<HinhAnh> dsHinhAnh;
}
