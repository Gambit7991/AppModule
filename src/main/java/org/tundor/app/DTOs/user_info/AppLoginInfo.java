package org.tundor.app.DTOs.user_info;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@ToString
public class AppLoginInfo {
    private String email;
    private String password;
}
