package com.domai.demo.online.cinema.system.domain;

import com.domai.demo.online.cinema.system.service.SecurityServiceImpl;
import lombok.Data;

@Data
public class MovieScreening {
    private String movieName;
    private String moviePosterURL;
    private long theatreId;
    private String theatreName;
    private String theatreCity;
    private String screeningDate;
    private String screeningTime;
    private int numSeats;


}
