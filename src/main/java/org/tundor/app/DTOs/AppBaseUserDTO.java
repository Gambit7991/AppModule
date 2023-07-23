package org.tundor.app.DTOs;


import jakarta.persistence.MappedSuperclass;
import lombok.*;
import org.tundor.app.DTOs.user_info.AppAccountInfo;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
@EqualsAndHashCode
@ToString(includeFieldNames = false)
public abstract class AppBaseUserDTO {
    private AppAccountInfo info;

}