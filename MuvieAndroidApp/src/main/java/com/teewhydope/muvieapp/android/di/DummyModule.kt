package com.teewhydope.muvieapp.android.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

//A simple Hilt Example

//Interface cannot be instantiated directly.
interface Dummy {
    fun description(): String
}

//so the implementation is provided below
class DummyImpl(
    private val name: String,
    private val age: Int
) : Dummy {
    override fun description(): String {
        return "$name age is $age"
    }
}

//The hilt dummy module

@Module
@InstallIn(SingletonComponent::class)
object DummyModule {

    //this provides the implementation age of type int
    @Singleton
    @Provides
    fun provideDummyAge1(): Int {
        return 1
    }

    //this provides the implementation name of type String
    @Singleton
    @Provides
    fun provideDummyAge2(): String {
        return "Teewhy"
    }

    //hilt is intelligent enough to bind the above provisions to the dummy object
    @Singleton
    @Provides
    fun provideDummyObject(
        age: Int, //provideDummyAge1
        name: String //provideDummyAge2
    ): Dummy {
        return DummyImpl(age = age, name = name)
    }

}