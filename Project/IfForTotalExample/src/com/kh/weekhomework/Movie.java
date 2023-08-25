package com.kh.weekhomework;

public class Movie {
	private String title;
    private String genre;
    private int runningTime;

    // 생성자
    public void Movie(String title, String genre, int runningTime) {
        this.title = title;
        this.genre = genre;
        this.runningTime = runningTime;
    }

    // getter 메서드들
    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getRunningTime() {
        return runningTime;
    }
}
