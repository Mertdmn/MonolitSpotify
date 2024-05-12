package com.mert.MonolitSpotify.service;

import com.mert.MonolitSpotify.dto.request.SaveUserProfileRequestDto;
import com.mert.MonolitSpotify.dto.response.FindAllUserProfileResponseDto;
import com.mert.MonolitSpotify.exception.ErrorType;
import com.mert.MonolitSpotify.exception.MonolitSpotifyException;
import com.mert.MonolitSpotify.repository.UserProfileRepository;
import com.mert.MonolitSpotify.repository.entity.UserProfile;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * DİKKAT!!!!
 * servis sınıflarının belirtilmesi ve bunlardan birer Bean oluşturulması için spring bu sınıfların
 * üzerinde @Service anotasyonu olup olmadığına bakar. eğer boş geçilirse hata fırlatır ve uygulamanız
 * ayağa kalkmaz.
 */
@Service
@RequiredArgsConstructor
public class UserProfileService {
    /**
     * DİKKAT!!!!
     * Spring Bean olarak işaretlediği (@Repository, @Service, @Configuration, @Component v.s.)
     * tüm sınıflardan nesne yaratabilmek için 3 farklı yöntem izler
     * 1- Değişkenin üzerinde @Autowired ekleyerek
     * 2- Değişkenin contructor a parametre alarak geçilmesi ile yapılır.(constructor injection)
     * 3- 2.yöntem in 3. taraf uygulamalar ile sağlaması. yazımı daha kolaydır. kod sayfasının
     * dha temiz görünmesini sağlar.
     */

    //@Autowired
    //private UserProfileRepository repositoryYontem_1:

    //private final UserProfileRepository repositoryYontem_2
    //public UserProfileService(UserProfileRepository repositoryYontem_2){
    //    this.repositoryYontem_2 = repositoryYontem_2;
    // }
    private final UserProfileRepository repository;

    public void save(UserProfile userProfile){
        /**
         * ÖNEMLİ!!!!
         * save işlemi iki şekilde çalışır;
         * 1- Eğer kendisine verilen nesne id bilgisini içermiyor ise
         * yani null ise kaydetme işlemi yapar.
         * 2- Eğer nesne içindeki id bir değer içeriyor ise bu seferde
         * güncelleme işlemi yapar.
         */

        repository.save(userProfile);

    }

    public void save(SaveUserProfileRequestDto dto){
        if(!dto.getPassword().equals(dto.getRePassword()))
            throw new MonolitSpotifyException(ErrorType.SIFRE_UYUSMUYOR);
        repository.save(
                UserProfile.builder()
                        .userName(dto.getUserName())
                        .build()
        );
    }
    public List<UserProfile> findAll(){
        return repository.findAll();
    }

    public FindAllUserProfileResponseDto findAllUserProfile() {

        return FindAllUserProfileResponseDto.builder()
                .statucCode(100)
                .message("Listeler başarılı bir şekilde çekildi")
                .data(repository.findAllFromUserProfileView())
                .build();
    }

}
