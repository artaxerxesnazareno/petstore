package com.example.petstore;

import android.app.Application;

import com.example.petstore.interfaces.PetStoreApi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ConfigRetofit extends Application {
    private static final String BASE_URL = "https://petstore.swagger.io/";

    private Retrofit retrofit;

    @Override
    public void onCreate() {
        super.onCreate();

        // Configuração do Retrofit
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public PetStoreApi getPetStoreService() {
        return retrofit.create(PetStoreApi.class);
    }
}
