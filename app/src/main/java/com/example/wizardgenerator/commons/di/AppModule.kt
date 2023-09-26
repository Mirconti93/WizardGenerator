package com.mircontapp.sportalbum.commons.di

import com.example.wizardgenerator.data.models.repository.WizardsRepository
import com.example.wizardgenerator.domain.repository.WizardsRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
class AppModule {

    @Provides
    fun provideWizardsRepository(): WizardsRepository {
        return WizardsRepositoryImpl()
    }


}