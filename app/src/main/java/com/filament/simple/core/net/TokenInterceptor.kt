package com.filament.simple.core.net

import okhttp3.Interceptor
import okhttp3.Response
class TokenInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request =
            chain.request().newBuilder()
                .addHeader("Authorization", "Bearer ")
                .build()
        return chain.proceed(request)
    }
}