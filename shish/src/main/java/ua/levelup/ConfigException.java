package ua.levelup;

public class ConfigException extends RuntimeException {
    public ConfigException() {
    }

    public ConfigException(String string) {
        System.out.println(string);
    }

    public ConfigException(String string, Throwable e) {
    }

    public ConfigException(Throwable e) {
    }
}
