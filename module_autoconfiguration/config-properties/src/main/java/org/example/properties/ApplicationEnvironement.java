package org.example.properties;


public class ApplicationEnvironement {

    private String name;
    private String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "ApplicationEnvironement{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
