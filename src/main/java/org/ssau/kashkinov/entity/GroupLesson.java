package org.ssau.kashkinov.entity;

import java.sql.Time;
import java.util.Set;

public class GroupLesson {

    private long id;
    private Group group;
    private String roomReference;
    private Time time;
    private Set<Student> students;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public String getRoomReference() {
        return roomReference;
    }

    public void setRoomReference(String roomReference) {
        this.roomReference = roomReference;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }
}
