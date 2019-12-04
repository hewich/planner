package com.hewan;

import java.util.ArrayList;
import java.util.Iterator;

public class SubjectModel implements Iterable<Subject> {
    private ArrayList<Subject> subjects;

    public SubjectModel() {
        subjects = new ArrayList<Subject>();
    }

    public void addSubject(Subject newSubject) {
        subjects.add(newSubject);

    }

    public void removeSubject(Subject s){
        subjects.remove(s);
    }


    @Override
    public Iterator<Subject> iterator() {

        return subjects.iterator();
    }



}
