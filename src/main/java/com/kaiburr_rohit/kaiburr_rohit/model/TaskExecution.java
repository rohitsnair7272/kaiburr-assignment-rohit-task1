package com.kaiburr_rohit.kaiburr_rohit.model;

// import org.springframework.data.annotation.Id;
import java.util.Date;

public class TaskExecution {
    private Date startTime;
    private Date endTime;
    private String output;

    // Getters and Setters
    public TaskExecution(Date startTime, Date endTime, String output) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.output = output;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }
}
