package com.example.songr.repository;

import com.example.songr.model.Albums;
import org.springframework.data.repository.CrudRepository;

public interface AlbumsRepository extends CrudRepository<Albums,Integer> {
}
