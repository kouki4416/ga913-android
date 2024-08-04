package com.tfandkusu.ga913android.data

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataModule {
    @Provides
    @Singleton
    fun provideLandmarkRepository(
        @ApplicationContext context: Context,
    ): LandmarkRepository = LandmarkRepositoryImpl(context = context)
}
