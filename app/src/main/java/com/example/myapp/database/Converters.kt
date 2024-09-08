package com.example.myapp.database

import androidx.room.TypeConverter
import androidx.room.TypeConverters
import com.example.myapp.models.Source
import com.google.gson.Gson


class Converters {
    @TypeConverter
    fun fromSource(source: Source): String {
        return Gson().toJson(source)
    }

    @TypeConverter
    fun toSource(sourceString: String): Source {
        return Gson().fromJson(sourceString, Source::class.java)
    }
}