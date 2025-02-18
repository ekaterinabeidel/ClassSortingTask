package org.example.model;

public class User {
    private String name;
    private String email;
    private String password;

    private User(UserBuilder userBuilder) {
        name = userBuilder.name;
        email = userBuilder.email;
        password = userBuilder.password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public static class UserBuilder{
        private String name;
        private String email;
        private String password;

        public UserBuilder(String email, String password) {
            this.email = email;
            this.password = password;
        }

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
