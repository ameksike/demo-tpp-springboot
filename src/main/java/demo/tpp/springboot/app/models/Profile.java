package demo.tpp.springboot.app.models;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Profile {
    public String name;
    public String surname;
    public String email;
    public String phone;
    public String address;
    public String province;
    public Date lastLogin;
    public Date documentExpirationDate;
    public float balance;

    
}