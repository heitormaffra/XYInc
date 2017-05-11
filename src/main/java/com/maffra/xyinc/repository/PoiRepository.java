
package com.maffra.xyinc.repository;

import com.maffra.xyinc.domain.Poi;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author heitor
 */
@RepositoryRestResource
public interface PoiRepository extends CrudRepository<Poi, Long> {
    @Override
    List<Poi> findAll();
}
