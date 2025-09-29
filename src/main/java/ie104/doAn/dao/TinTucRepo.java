package ie104.doAn.dao;

import ie104.doAn.model.TinTuc;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface TinTucRepo extends JpaRepository<TinTuc, Integer> {
    Page<TinTuc> findByTieuDeContainingIgnoreCase(@Param("tieuDe") String tieuDe, Pageable pageable);
}
