package bedu.org.spotifyAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;
import bedu.org.spotifyAPI.dto.CreateSongDTO;
import bedu.org.spotifyAPI.dto.SongDTO;
import bedu.org.spotifyAPI.mapper.SongMapper;
import bedu.org.spotifyAPI.model.Song;
import bedu.org.spotifyAPI.repository.SongRepository;
import jakarta.validation.Valid;
import lombok.val;

@Service
public class SongService {
    
    @Autowired
    private SongRepository repository;

    @Autowired
    private SongMapper mapper;

    public List<SongDTO> findAll() {
        return mapper.toDTO(repository.findAll());
    }

    public SongDTO save(CreateSongDTO data) {
        Song entity = repository.save(mapper.toModel(data));
        return mapper.toDTO(entity);
    }


}
