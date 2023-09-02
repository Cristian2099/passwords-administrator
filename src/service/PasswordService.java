package service;

import model.Password;
import repository.PasswordRepository;

import java.util.List;

public class PasswordService {

    public static Password setPasswordHistory(Password passwordToSave){
        List<String> passwordHistory = PasswordRepository.getPasswordHistory(passwordToSave);
        passwordHistory.add(passwordToSave.getPassword());
        passwordToSave.setPassHistory(passwordHistory);
        return passwordToSave;
    }

    public static Password savePassword(Password passwordToSave) {
        Password passwordToSaveWithHistory = setPasswordHistory(passwordToSave);
        return PasswordRepository.save(passwordToSaveWithHistory);
    }
}
