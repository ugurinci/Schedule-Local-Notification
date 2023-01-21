package com.example.schedulelocalnotification

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class NotificationReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        val service = NotificationService(context)
        service.showNotification(
            intent.getStringExtra(Constant.TITLE_EXTRA),
            intent.getStringExtra(Constant.MESSAGE_EXTRA)
        )
    }
}