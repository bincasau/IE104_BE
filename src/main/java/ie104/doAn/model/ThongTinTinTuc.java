package ie104.doAn.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "thong_tin_tin_tuc")
public class ThongTinTinTuc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_thong_tin_tin_tuc")
    private int maThongTinTinTuc;

    @Column(name = "thong_tin", columnDefinition = "LONGTEXT")
    private String thongTin;

    @Column(name = "url")
    private String url;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ma_tin_tuc", nullable = false)
    private TinTuc tinTuc;
}
