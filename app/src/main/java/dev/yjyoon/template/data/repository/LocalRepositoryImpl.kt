package dev.yjyoon.template.data.repository

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import dev.yjyoon.template.ui.repository.LocalRepository
import javax.inject.Inject

class LocalRepositoryImpl @Inject constructor(
    private val dataStore: DataStore<Preferences>
) : LocalRepository {
}
