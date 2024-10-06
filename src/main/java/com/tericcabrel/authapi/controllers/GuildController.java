package com.tericcabrel.authapi.controllers;

import com.tericcabrel.authapi.dtos.GuildDto;
import com.tericcabrel.authapi.entities.Guild;
import com.tericcabrel.authapi.services.GuildService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/guilds")
@CrossOrigin
@RestController
public class GuildController {
    private final GuildService guildService;

    public GuildController(GuildService guildService) {
        this.guildService = guildService;
    }

    @GetMapping
    public ResponseEntity<List<Guild>> allGuilds() {
        List<Guild> guilds = guildService.allGuilds();

        return ResponseEntity.ok(guilds);
    }

    @PostMapping("/add")
    public ResponseEntity<Guild> add(@RequestBody GuildDto addGuildDto) {
        Guild guild = guildService.addGuild(addGuildDto);

        return ResponseEntity.ok(guild);
    }
}
