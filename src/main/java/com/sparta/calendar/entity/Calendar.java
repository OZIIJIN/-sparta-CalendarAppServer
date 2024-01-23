package com.sparta.calendar.entity;

import com.sparta.calendar.dto.CalendarRequestDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Calendar {
    private String title;
    private String contents;
    private String manager;
    private String password;
    private int date;

    public  Calendar(CalendarRequestDto requestDto){
        this.title = requestDto.getTitle();
        this.contents = requestDto.getContents();
        this.manager = requestDto.getManager();
        this.password = requestDto.getPassword();
        this.date = requestDto.getDate();
    }
}
