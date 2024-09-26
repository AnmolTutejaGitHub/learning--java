//package Leetcode.729. My Calendar I;

import java.util.ArrayList;

class Pair {
    int start;
    int end;

    Pair(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

class MyCalendar {

    public ArrayList<Pair> ls = new ArrayList<>();

    public MyCalendar() {
        this.ls = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        for (Pair pair : ls) {
            if (start < pair.end && end > pair.start)
                return false;
        }

        ls.add(new Pair(start, end));

        return true;
    }
}
