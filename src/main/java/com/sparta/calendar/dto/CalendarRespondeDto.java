package com.sparta.calendar.dto;

import com.sparta.calendar.entity.Calendar;
import lombok.Getter;

@Getter
public class CalendarRespondeDto {
    private String title;
    private String contents;
    private String manager;
    private String password;
    private int date;

    public CalendarRespondeDto(Calendar calendar) {
        this.title = calendar.getTitle();;
        this.contents = calendar.getContents();
        this.manager = calendar.getManager();
        this.password = calendar.getPassword();
        this.date = calendar.getDate();
    }
}
