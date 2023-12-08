package bedu.org.spotifyAPI.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class AddSongDTO {
    @Schema(description = "Id de la Cancion",example = "2")
    private long songId;
}
