package testdata;

import models.LoginModel;

public class GetLoginModel {

    public static LoginModel getLoginWithFirstEmail() {
        LoginModel login = LoginModel
                .builder()
                .email("standard_user")
                .password("secret_sauce")
                .build();
        return login;
    }

    public static LoginModel getLoginWithSecondEmail() {
        LoginModel login = LoginModel
                .builder()
                .email("locked_out_user")
                .password("secret_sauce")
                .build();
        return login;
    }

    public static LoginModel getLoginWithThirdEmail() {
        LoginModel login = LoginModel
                .builder()
                .email("problem_user")
                .password("secret_sauce")
                .build();
        return login;
    }

    public static LoginModel getLoginWithFourthEmail() {
        LoginModel login = LoginModel
                .builder()
                .email("performance_glitch_user")
                .password("secret_sauce")
                .build();
        return login;
    }
}
