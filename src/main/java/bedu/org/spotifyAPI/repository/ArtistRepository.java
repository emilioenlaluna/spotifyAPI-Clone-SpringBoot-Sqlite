package bedu.org.spotifyAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import bedu.org.spotifyAPI.model.Artist;

@Repository
public interface ArtistRepository extends JpaRepository<Artist,Long>{
    
}
