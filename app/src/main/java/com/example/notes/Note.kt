package com.example.notes

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes_table")
data class Note(
    @ColumnInfo(name = "note_text")
    var noteText: String = "Add Notes"
    ) {
    @PrimaryKey(autoGenerate = true)var id: Long = 0L
}
