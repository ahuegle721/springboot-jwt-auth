package com.tericcabrel.authapi.services;

import com.tericcabrel.authapi.dtos.GuildDto;
import com.tericcabrel.authapi.entities.Guild;
import com.tericcabrel.authapi.repositories.GuildRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GuildService {
    private final GuildRepository guildRepository;

    public GuildService(GuildRepository guildRepository) {
        this.guildRepository = guildRepository;
    }

    public List<Guild> allGuilds() {
        List<Guild> guilds = new ArrayList<>();

        guildRepository.findAll().forEach(guilds::add);

        return guilds;
    }

    public Guild addGuild(GuildDto guildDto) {
        Guild guild = new Guild();
        guild.setName(guildDto.getName());
        guild.setGuilMaster(guildDto.getGuildMaster());
        guild.setColor(guildDto.getColor());
        guildRepository.save(guild);
        return guild;
    }
}
