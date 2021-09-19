package com.teewhydope.muvieapp.datasource.network

import io.ktor.client.*
import io.ktor.client.engine.ios.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import kotlinx.serialization.json.Json

actual class KtorClientFactory {
    actual fun build(): HttpClient {
        return HttpClient(Ios) {
            install(JsonFeature){
                serializer = KotlinxSerializer(
                    kotlinx.serialization.json.Json{
                        ignoreUnknownKeys = true
                    }
                )
            }
        }
    }
}