package net.bull.javamelody;

public interface JavamelodyUserAuthentification {

    default boolean authenticate(String login, String password) {
        return true;
    }
}
