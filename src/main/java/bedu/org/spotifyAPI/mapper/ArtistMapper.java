package bedu.org.spotifyAPI.mapper;

import java.util.List;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import bedu.org.spotifyAPI.dto.ArtistDTO;
import bedu.org.spotifyAPI.dto.CreateArtistDTO;
import bedu.org.spotifyAPI.model.Artist;

@Mapper(componentModel = "spring",injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface ArtistMapper {

  
   ArtistDTO toDTO(Artist model);
   List <ArtistDTO> toDTO(List <Artist> model);
    
   @Mapping(target = "id", ignore = true)
    Artist toModel(CreateArtistDTO dto);
}
