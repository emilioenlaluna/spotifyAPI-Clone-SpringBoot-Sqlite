package bedu.org.spotifyAPI.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bedu.org.spotifyAPI.mapper.ArtistMapper;
import bedu.org.spotifyAPI.model.Artist;
import bedu.org.spotifyAPI.repository.ArtistRepository;
import bedu.org.spotifyAPI.dto.ArtistDTO;
import bedu.org.spotifyAPI.dto.CreateArtistDTO;

@Service
public class ArtistService {

    @Autowired
    private ArtistRepository repository;

    @Autowired
    private ArtistMapper mapper;

    public List<ArtistDTO> findAll() {
        return mapper.toDTO(repository.findAll());
    }

    public ArtistDTO save(CreateArtistDTO data){

        Artist entity=repository.save(mapper.toModel(data));
        return mapper.toDTO(entity);

    }

}
