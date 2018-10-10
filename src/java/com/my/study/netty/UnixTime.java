package com.my.study.netty;

import java.util.Date;

public class UnixTime {

    private long value;

    public UnixTime(){
        this(System.currentTimeMillis() / 1000L + 2208988800L);
    }

    public UnixTime(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    @Override
    public String toString() {
        System.out.println(value);
        return new Date((value() - 2208988800L) * 1000L).toString();
    }
}
