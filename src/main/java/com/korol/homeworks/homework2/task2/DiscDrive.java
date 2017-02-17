package com.korol.homeworks.homework2.task2;

/**
 * Created by Somebody on 14.02.2017.
 */
public class DiscDrive {
    private int recordingSpeed;

    public DiscDrive(int recordingSpeed) {
        this.recordingSpeed = recordingSpeed;
    }

    public int getRecordingSpeed() {
        return recordingSpeed;
    }

    public void setRecordingSpeed(int recordingSpeed) {
        this.recordingSpeed = recordingSpeed;
    }

    @Override
    public String toString() {
        return "DiscDrive{" +
                "recordingSpeed=" + recordingSpeed +
                '}';
    }
}
