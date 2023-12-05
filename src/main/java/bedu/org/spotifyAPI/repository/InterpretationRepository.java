package bedu.org.spotifyAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bedu.org.spotifyAPI.model.Interpretation;
import bedu.org.spotifyAPI.model.InterpretationKey;

@Repository
public interface InterpretationRepository extends JpaRepository<Interpretation, InterpretationKey> {
    
}