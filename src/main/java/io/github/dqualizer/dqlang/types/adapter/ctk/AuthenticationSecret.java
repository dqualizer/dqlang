package io.github.dqualizer.dqlang.types.adapter.ctk;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class AuthenticationSecret {

    @JsonProperty("username")
    private Credential username;

    @JsonProperty("password")
    private Credential password;

    @JsonProperty("db_username")
    private Credential dbUsername;

    @JsonProperty("db_password")
    private Credential dbPassword;
}
