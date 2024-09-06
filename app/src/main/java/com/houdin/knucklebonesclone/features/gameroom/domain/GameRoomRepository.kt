package com.houdin.knucklebonesclone.features.gameroom.domain

import com.houdin.knucklebonesclone.features.gameroom.data.GameRoomDatasource
import com.houdin.knucklebonesclone.shared.preferences.AppPreferences
import com.houdin.knucklebonesclone.shared.utils.FIREBASE_ROOM_KEY

interface GameRoomRepository {
    fun createGameRoom(): String
}

class GameRoomRepositoryImpl(
    private val datasource: GameRoomDatasource
) : GameRoomRepository {

    override fun createGameRoom(): String =
        "${AppPreferences.packageName}/$FIREBASE_ROOM_KEY/${datasource.createGameRoom()}"
}