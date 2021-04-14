package com.mdkhaki.springboot_registration_and_login.registration;

import com.mdkhaki.springboot_registration_and_login.appuser.AppUser;
import com.mdkhaki.springboot_registration_and_login.appuser.AppUserRole;
import com.mdkhaki.springboot_registration_and_login.appuser.AppUserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegistrationService {

    private final EmailValidator emailValidator;
    private final AppUserService appUserService;

    public String register(RegistrationRequest request) {

        boolean isValidEmail = emailValidator.test(request.getEmail());
        if (!isValidEmail) {
            throw new IllegalStateException("email not valid");
        }
        System.out.println("RegistrationService" + request.toString());
        return appUserService.signUpUser(
                new AppUser(
                        request.getFirstName(),
                        request.getLastName(),
                        request.getEmail(),
                        request.getPassword(),
                        AppUserRole.USER
                )
        );
    }
}
