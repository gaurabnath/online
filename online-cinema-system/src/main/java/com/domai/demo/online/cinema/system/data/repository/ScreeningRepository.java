package com.domai.demo.online.cinema.system.data.repository;


import com.domai.demo.online.cinema.system.data.entity.Screening;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

@Repository
public interface ScreeningRepository extends CrudRepository<Screening, Long> {
    List<Screening> findByScreeningDate(Date screeningDate);
    List<Screening> findByMovieName(String movieName);
    Screening findByMovieNameAndTheatreIdAndScreeningDateAndScreeningTime(String movieName, long theatreId, Date screeningDate, Time screeningTime);
}
