package bedu.org.spotifyAPI.mapper;

import java.util.List;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import bedu.org.spotifyAPI.dto.CreateSongDTO;
import bedu.org.spotifyAPI.dto.SongDTO; 
import bedu.org.spotifyAPI.model.Song;

@Mapper(componentModel = "spring",injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface SongMapper {

    SongDTO toDTO(Song model);

    List<SongDTO> toDTO(List<Song>model);
    
    @Mapping(target = "id", ignore = true)
    Song toModel(CreateSongDTO dto);
    
} 
