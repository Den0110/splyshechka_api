package ru.asayke.jwtappdemo.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.Date;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class SleepDTO {
    private int noise;
    private int quality;
    private Date went_sleep;
    private Date waked_up_at;
    private Date slept_during;
    private Date fell_asleep_during;
    private Date time_spent_in_bed;
}