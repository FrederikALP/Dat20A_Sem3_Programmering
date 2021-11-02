package dk.kea.demo.respositories;


import dk.kea.demo.models.Artist;
import org.springframework.data.repository.CrudRepository;

public interface ArtistRepository extends CrudRepository<Artist, Long> {
}
