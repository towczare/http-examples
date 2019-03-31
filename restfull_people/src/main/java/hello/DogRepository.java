package hello;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "dogs", path = "dogs")
public interface DogRepository extends PagingAndSortingRepository<Dog, Long> {

	List<Dog> findBy(@Param("name") String name);

}
