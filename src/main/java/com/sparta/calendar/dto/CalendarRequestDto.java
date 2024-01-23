package com.sparta.calendar.dto;

import lombok.Getter;

@Getter
public class CalendarRequestDto {
    private String title;
    private String contents;
    private String manager;
    private String password;
    private int date;
}
