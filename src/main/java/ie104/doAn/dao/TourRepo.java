package ie104.doAn.dao;

import ie104.doAn.model.Tour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;
import org.springframework.data.repository.query.Param;


@RepositoryRestResource
public interface TourRepo extends JpaRepository<Tour, Integer> {
    List<Tour> findByMien(@Param("mien") String mien);
    List<Tour> findByDiaDiem(@Param("diaDiem") String diaDiem);
}
