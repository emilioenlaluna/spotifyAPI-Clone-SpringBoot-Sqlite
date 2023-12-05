package bedu.org.spotifyAPI.mapper;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import bedu.org.spotifyAPI.model.Interpretation;

@Mapper(componentModel = "spring",injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface InterpretationMapper {
    // los mapper no aceptan tipos de datos primitivos como entrada
    //por lo tanto se usan los wraper class
    //long-> Long
    @Mapping(source = "artistId", target = "id.artistId")
    @Mapping(source = "artistId", target = "artist.id")
    @Mapping(source = "songId", target = "id.songId")
    @Mapping(source = "songId", target = "song.id")
    Interpretation toModel(Long artistId, Long songId);
}
