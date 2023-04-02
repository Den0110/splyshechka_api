package ru.asayke.jwtappdemo.dto.updateDTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdatePasswordDTO {
    private Integer resetCode;
    private String newPassword;
}