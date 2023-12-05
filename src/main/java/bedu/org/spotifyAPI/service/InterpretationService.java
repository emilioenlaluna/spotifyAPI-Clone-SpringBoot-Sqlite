package bedu.org.spotifyAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bedu.org.spotifyAPI.mapper.InterpretationMapper;
import bedu.org.spotifyAPI.repository.InterpretationRepository;

@Service
public class InterpretationService {
    
    @Autowired
    private InterpretationRepository repository;

    @Autowired
    private InterpretationMapper mapper;

    public void addSong(long artistId,long songId){
        repository.save(mapper.toModel(artistId, songId));
    }
}
