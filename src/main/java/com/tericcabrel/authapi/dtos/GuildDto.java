package com.tericcabrel.authapi.dtos;

public class GuildDto {
    private String name;
    private String guildMaster;
    private String color;

    public String getName() {
        return name;
    }

    public GuildDto setName(String name) {
        this.name = name;
        return this;
    }

    public String getGuildMaster() {
        return guildMaster;
    }

    public GuildDto setGuildMaster(String guildMaster) {
        this.guildMaster = guildMaster;
        return this;
    }

    public String getColor() {
        return color;
    }

    public GuildDto setColor(String color) {
        this.color = color;
        return this;
    }

    @Override
    public String toString() {
        return "GuildDto{" +
                "name='" + name + '\'' +
                ", guildMaster='" + guildMaster + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
