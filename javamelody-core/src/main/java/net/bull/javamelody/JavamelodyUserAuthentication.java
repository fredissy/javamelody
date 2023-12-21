package net.bull.javamelody;

public interface JavamelodyUserAuthentication {

    boolean authenticate(String login, String password);
}
