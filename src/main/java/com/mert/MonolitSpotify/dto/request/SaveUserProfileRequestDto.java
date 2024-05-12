package com.mert.MonolitSpotify.dto.request;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SaveUserProfileRequestDto {
    @NotBlank(message = "Kullanıcı adını boş geçemezsiniz.")
    @Size(min = 3,max = 64)
    @Pattern(
            regexp = "^(?=.*[0-9])(?=.*[a-z])(?=\\S+$).{3,}$",
            message = "Kullanıcı adı için sadece küçük harf ve rakam girebilirsiniz."
    )
    String userName;
    @Email(message = "Lütfen geçerli bir e-mail adresi giriniz.")
    String email;
    @Size(min = 8, max = 128)
    @Pattern(
            regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[.,?@#$%^&+=*!])(?=\\S+$).{8,}$",
            message = "Sifre Karmaşıklığı En az 1 Büyük 1 küçük harf olmalı en az 1 rakam ve özel karakter içermelidir"
    )
    String password;
    String rePassword;
}
