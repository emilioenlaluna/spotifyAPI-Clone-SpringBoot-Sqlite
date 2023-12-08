package bedu.org.spotifyAPI.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class SongDTO {
    @Schema(description = "Id de la cancion",example = "3")
    private long id;
    @Schema(description = "Nombre de la cancion",example = "Volverte a ver")
    private String name;
    @Schema(description = "Duracion de la cancion",example = "145")
    private int duration;

    
}
