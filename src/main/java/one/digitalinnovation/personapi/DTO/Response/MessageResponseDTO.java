package one.digitalinnovation.personapi.DTO.Response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MessageResponseDTO {
    private String message;
}
