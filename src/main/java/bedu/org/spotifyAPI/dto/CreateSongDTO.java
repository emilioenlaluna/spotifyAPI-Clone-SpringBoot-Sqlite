package bedu.org.spotifyAPI.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CreateSongDTO {

    @NotBlank
    private String name;
    @NotBlank
    private int durarion;
    
}
