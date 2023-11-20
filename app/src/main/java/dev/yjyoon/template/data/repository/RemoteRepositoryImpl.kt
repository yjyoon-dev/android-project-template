package dev.yjyoon.template.data.repository

import dev.yjyoon.template.data.source.ApiService
import dev.yjyoon.template.ui.repository.RemoteRepository
import javax.inject.Inject

class RemoteRepositoryImpl @Inject constructor(
    private val apiService: ApiService
) : RemoteRepository {
}
