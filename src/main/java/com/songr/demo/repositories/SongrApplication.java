package com.songr.demo.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.songr.demo.models.Albums;
 // make a repo for the data value. THIS IS A SERVICE - Singelton design principle == SPRING BEAN!!
//TODO: extend our JpaRepo and give it types. Model and a Long(id)
    public interface SongrApplication extends JpaRepository<Albums, Long> {
        // The reason we are using an interface, is so we can create CUSTOM CRUD queries

        // DARK MAGIC that we made happen with a specific function name
        public Albums findByArtist(String artist);
    }

