package org.tundor.app.DTOs.user_roles;

import lombok.*;
import org.tundor.app.DTOs.AppBaseUserDTO;
import org.tundor.app.DTOs.user_info.AppAccountInfo;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class AppStudentDTO extends AppBaseUserDTO {
    @Builder
    public AppStudentDTO(AppAccountInfo info){
        super(info);
    }
}
