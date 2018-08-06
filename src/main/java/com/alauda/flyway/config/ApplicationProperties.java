package com.alauda.flyway.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "flywayutil", ignoreUnknownFields = false)
public class ApplicationProperties {

    private final Source1 Source1 = new Source1();
    private final Source2 Source2 = new Source2();
    private final Source3 Source3 = new Source3();

    public ApplicationProperties.Source1 getSource1() {
        return Source1;
    }

    public ApplicationProperties.Source2 getSource2() {
        return Source2;
    }

    public ApplicationProperties.Source3 getSource3() {
        return Source3;
    }

    public ApplicationProperties() {

    }

    public static class Source1 {
        private String url;
        private String username;
        private String password;

        private Source1() {

        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

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

    }

    public static class Source2 {
        private String url;
        private String username;
        private String password;

        private Source2() {}

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

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

    }

    public static class Source3 {
        private String url;
        private String username;
        private String password;

        private Source3() {}

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

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

    }


}
