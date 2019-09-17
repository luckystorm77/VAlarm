package com.vluckystream.valarm

class AlarmConfig {
    private var id: Long = 0
    private var hour: Int = 0
    private var minute: Int = 0

    public fun getId(): Long {
        return this.id
    }

    public fun setId(id: Long) {
        this.id = id
    }

    public fun getHour(): Int {
        return this.hour
    }

    public fun setHour(hour: Int) {
        this.hour = hour
    }

    public fun getMinute(): Int {
        return this.minute
    }

    public fun setMinute(minute: Int) {
        this.minute = minute
    }
}