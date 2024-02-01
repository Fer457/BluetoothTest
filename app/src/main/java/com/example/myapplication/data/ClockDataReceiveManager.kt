package com.example.myapplication.data

import com.example.myapplication.util.Resource
import kotlinx.coroutines.flow.MutableSharedFlow

interface ClockDataReceiveManager {

    val data: MutableSharedFlow<Resource<ClockDataResult>>

    fun reconnect()

    fun disconnect()

    fun startReceiving()

    fun closeConnection()

}