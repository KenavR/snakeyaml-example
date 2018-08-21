package io.devvit.snakeyaml.example;

import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;

public class YamlIntepreter {

    public static void main(String[] args) {
        YamlIntepreter intepreter = new YamlIntepreter();
        intepreter.interpretYaml();
    }

    public void interpretYaml() {
        InputStream stream = this.getClass().getClassLoader()
            .getResourceAsStream("data.yml");

        Yaml yaml = new Yaml();
        Result res = yaml.loadAs(stream, Result.class);
        System.out.println(res.getPlayer().getRandie().getScore());
    }
}
