package io.github.dqualizer.dqlang.types.adapter.ctk;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class AuthenticationSecret {

    @JsonProperty("username")
    private String username;

    @JsonProperty("password")
    private String password;

    @JsonProperty("db_username")
    private String dbUsername;

    @JsonProperty("db_password")
    private String dbPassword;
}
