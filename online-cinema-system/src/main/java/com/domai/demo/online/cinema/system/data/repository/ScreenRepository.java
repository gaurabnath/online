package com.domai.demo.online.cinema.system.data.repository;


import com.domai.demo.online.cinema.system.data.entity.Screen;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ScreenRepository extends CrudRepository<Screen, Long> {
    public Screen findByScreenId(long screenId);
    public List<Screen> findByTheatreId(long theatreId);
}
