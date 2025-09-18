package ie104.doAn.dao;

import ie104.doAn.model.HinhAnh;
import ie104.doAn.model.Tour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface HinhAnhRepo extends JpaRepository<HinhAnh, Integer> {
}
