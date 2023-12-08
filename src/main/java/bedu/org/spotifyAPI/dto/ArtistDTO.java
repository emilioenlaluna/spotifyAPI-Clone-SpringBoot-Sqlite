package bedu.org.spotifyAPI.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class ArtistDTO {

    @Schema(description = "Id del artista", example = "2")
    private long id;
    @Schema(description = "Nombre del artista",example = "Roberto Carlos")
    private String name;
    
}
