package ie104.doAn.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "hinh_anh")
public class HinhAnh {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_hinh_anh")
    private int maHinhAnh;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ma_tour", nullable = false)
    private Tour tour;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ma_tin_tuc", nullable = false)
    private TinTuc tinTuc;

    @Column(name = "la_icon")
    private boolean laIcon;

    @Lob
    @Column(name = "du_lieu", columnDefinition = "LONGTEXT")
    private String duLieu;
}
