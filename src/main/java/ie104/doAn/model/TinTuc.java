package ie104.doAn.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.util.List;

@Entity
@Data
@Table(name = "tin_tuc")
public class TinTuc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_tin_tuc")
    private int maTinTuc;

    @Column(name = "ngay_tao")
    private Date ngayTao;

    @OneToMany(mappedBy = "tinTuc", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<HinhAnh> dsHinhAnh;

    @OneToMany(mappedBy = "tinTuc", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ThongTinTinTuc> dsThongTinTinTuc;
}
