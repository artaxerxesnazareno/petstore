package com.example.petstore.api;

import com.example.petstore.interfaces.PetStoreApi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PetStoreApiClient {

    private static final String BASE_URL = "https://api.petstore.com"; // substitua pela URL base da API da Pet Store

    private static PetStoreApi petStoreApi;

    public static PetStoreApi getApi() {
        if (petStoreApi == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            petStoreApi = retrofit.create(PetStoreApi.class);
        }
        return petStoreApi;
    }
}

