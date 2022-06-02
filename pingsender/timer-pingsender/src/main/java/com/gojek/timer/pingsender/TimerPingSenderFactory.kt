package com.gojek.timer.pingsender

import com.gojek.mqtt.pingsender.MqttPingSender

class TimerPingSenderFactory private constructor() {
    companion object {
        fun create(): MqttPingSender {
            return TimerPingSender()
        }
    }
}
