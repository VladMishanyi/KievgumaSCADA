package com.vk.entity.json;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JsonBodyDateFromChart {
    private Date start;
    private Date end;

    public JsonBodyDateFromChart() {
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }
}
