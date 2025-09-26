package ie104.doAn.dao;

import ie104.doAn.model.ThongTinTinTuc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ThongTinTinTucRepo extends JpaRepository<ThongTinTinTuc, Integer> {
}
