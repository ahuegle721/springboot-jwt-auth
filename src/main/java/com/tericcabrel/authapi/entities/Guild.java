
package com.tericcabrel.authapi.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import java.util.Date;

@Table(name = "guilds")
@Entity
public class Guild {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Integer id;

    @Column(nullable = true)
    private String guildMaster;

    @Column(unique = true, length = 100, nullable = false)
    private String name;

    @Column(nullable = true)
    private String color;

    @CreationTimestamp
    @Column(updatable = false, name = "created_at")
    private Date createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private Date updatedAt;

    public String getGuildMaster() {
        return guildMaster;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public Integer getId() {
        return id;
    }

    public Guild setId(Integer id) {
        this.id = id;
        return this;
    }

    public Guild setName(String name) {
        this.name = name;
        return this;
    }

    public Guild setGuilMaster(String guildMaster) {
        this.guildMaster = guildMaster;
        return this;
    }

    public Guild setColor(String color) {
        this.color = color;
        return this;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Guild setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public Guild setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        return "Guild{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", guildMaster='" + guildMaster + '\'' +
                ", color='" + color + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
