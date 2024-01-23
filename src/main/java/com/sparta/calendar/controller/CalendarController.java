package com.sparta.calendar.controller;

import com.sparta.calendar.dto.CalendarRequestDto;
import com.sparta.calendar.dto.CalendarRespondeDto;
import com.sparta.calendar.entity.Calendar;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class CalendarController {

    private final Map<String, Calendar> calendars = new HashMap<>();

    @PostMapping("/calendar")
    public CalendarRespondeDto createSchedule(@RequestBody CalendarRequestDto requestDto){
        //requestdto -> entity
        Calendar calendar = new Calendar(requestDto);

        //DB에 저장
        calendars.put(calendar.getPassword(), calendar);

        //entity -> responsedto
        CalendarRespondeDto calendarRespondeDto = new CalendarRespondeDto(calendar);

        return calendarRespondeDto;
    }

    //전체 일정 목록 조회
    @GetMapping("/calendar")
    public List<CalendarRespondeDto> getCalendars(){
        //map to list
        List<CalendarRespondeDto> responseList = calendars.values().stream()
                .map(CalendarRespondeDto::new).toList();

        return responseList;
    }

    //선택 일정 조회
    @GetMapping("/calendar/{date}")
    public CalendarRespondeDto getCalendar(@PathVariable int date, @RequestBody CalendarRequestDto requestDto){
        // 해당 일정이 DB에 있는지 확인
    }

    //일정 수정
    @PutMapping("/calendar/date/{date}/password/{password}")
    public CalendarRespondeDto updateCalendar(@PathVariable int date, @PathVariable String password, @RequestBody CalendarRequestDto requestDto){
    }
}
