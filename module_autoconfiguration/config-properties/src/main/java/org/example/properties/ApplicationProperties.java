package org.example.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Arrays;
import java.util.Map;

@ConfigurationProperties(prefix = "app")
public class ApplicationProperties {

    private String name;
    private String description;
    private String[] servers;
    private Map<String, ApplicationEnvironement> environments;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getServers() {
        return servers;
    }

    public void setServers(String[] servers) {
        this.servers = servers;
    }

    public Map<String, ApplicationEnvironement> getEnvironments() {
        return environments;
    }

    public void setEnvironments(Map<String, ApplicationEnvironement> environments) {
        this.environments = environments;
    }

    @Override
    public String toString() {
        return "ApplicationProperties{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", servers=" + Arrays.toString(servers) +
                ", environments=" + environments +
                '}';
    }
}
