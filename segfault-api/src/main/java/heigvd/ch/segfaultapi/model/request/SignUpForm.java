package heigvd.ch.segfaultapi.model.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Set;

/**
 * The type Sign up form.
 */
public class SignUpForm {

    @Getter
    @Setter
    @NotBlank
    @Size(min=3, max = 50)
    private String nomUtilisateur;

    @NotBlank
    @Size(max = 50)
    @Getter
    @Setter
    @Email
    private String mailUtilisateur;

    @NotBlank
    @Size(min=6, max = 100)
    @Getter
    @Setter
    private String motDePasse;

}