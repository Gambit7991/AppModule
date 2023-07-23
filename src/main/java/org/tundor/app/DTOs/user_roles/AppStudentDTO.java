package org.tundor.app.DTOs.user_roles;

import lombok.*;
import org.tundor.app.DTOs.AppBaseUserDTO;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class AppStudentDTO extends AppBaseUserDTO {
}
