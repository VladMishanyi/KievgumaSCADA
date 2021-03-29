package com.vk.entity.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

public class JsonBodyLocalDateTimeFromChart {
//    @JsonDeserialize(using = LocalDateDeserializer.class)
//    @JsonFormat(pattern="dd/MM/yyyy hh:mm")
//    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss.SSSX")
//    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime start;

//    @JsonDeserialize(using = LocalDateDeserializer.class)
//    @JsonFormat(pattern="dd/MM/yyyy hh:mm")
//    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss.SSSX")
//    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime end;

    public JsonBodyLocalDateTimeFromChart(){}

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public void setEnd(LocalDateTime end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "JsonBodyLocalDateTimeFromChart{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}
