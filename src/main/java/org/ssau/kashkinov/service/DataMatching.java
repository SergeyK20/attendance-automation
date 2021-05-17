package org.ssau.kashkinov.service;

import org.ssau.kashkinov.entity.GroupLesson;

import java.util.HashSet;
import java.util.Set;

public class DataMatching {

    Set<GroupLesson> groupLessonsFromDB;
    Set<GroupLesson> groupLessonsFromFile;

    public Set<GroupLesson> getReal(){
        Set<GroupLesson> groupLessons = new HashSet<>();
        return groupLessons;
    }
}
