package com.hewan;

public class Subject {
    private String name;
//	private String type;

    public Subject(String name) {
        this.name = name;
//		this.type = type;
    }
    public String getName() {
        return name;
    }
//	public String getType() {
//		return type;
//	}

    public String toString() {
        return name ;
    }

}
