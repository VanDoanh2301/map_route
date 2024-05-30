package com.journaldev.maproutebetweenmarkers.data.local

data class UserModel(
    var email: String = "",
    var username: String = "",
    var image: String = "",
    var isNotificationEnable: Boolean = false
)