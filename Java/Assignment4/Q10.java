class Time {
    int hour, minute, second;

    Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    void displayTime() {
        System.out.println(hour + ":" + minute + ":" + second);
    }

    Time addTime(Time t) {
        int s = this.second + t.second;
        int m = this.minute + t.minute + s / 60;
        int h = this.hour + t.hour + m / 60;

        s = s % 60;
        m = m % 60;

        return new Time(h, m, s);
    }
}

class Driver10 {
    public static void main(String[] args) {
        Time t1 = new Time(2, 45, 50);
        Time t2 = new Time(1, 30, 30);

        Time t3 = t1.addTime(t2);

        t1.displayTime();
        t2.displayTime();
        System.out.println("Addition:");
        t3.displayTime();
    }
}
