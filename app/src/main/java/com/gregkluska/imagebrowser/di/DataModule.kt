package com.gregkluska.imagebrowser.di

import com.gregkluska.imagebrowser.BuildConfig
import com.gregkluska.imagebrowser.data.network.UnsplashService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object DataModule {

    @Provides
    fun provideUnsplashService(): UnsplashService {
        return UnsplashService.build(BuildConfig.UNSPLASH_CLIENT_ID)
    }

}
