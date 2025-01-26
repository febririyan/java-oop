package programmer.zaman.now.data;

import programmer.zaman.now.annotation.NotBlank;

public class CreateUserRequest {

    // username ini tidak boleh blank kita tambahkan annotation NotBlank
    @NotBlank
    private String username;

    @NotBlank
    private String password;

    @NotBlank
    private String name;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
