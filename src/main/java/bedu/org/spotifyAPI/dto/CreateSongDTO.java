package bedu.org.spotifyAPI.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CreateSongDTO {

    @Schema(description = "Nombre de la cancion", example = "Yellow Submarine")
    @NotBlank
    private String name;
    @Schema(description = "Duracion de la cancion", example = "235")
    @NotBlank
    private int duration;
    
}
