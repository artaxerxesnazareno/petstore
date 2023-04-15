package com.example.petstore.interfaces;

import com.example.petstore.models.Pet;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface PetStoreApi {
    @GET("/pet/{petId}")
    Call<Pet> getPet(@Path("petId") long petId);

    @GET("/pet")
    Call<List<Pet>> getPetsByCategory(@Query("category") String category);

    @POST("/pet")
    Call<Pet> createPet(@Body Pet pet);

    @PUT("/pet")
    Call<Pet> updatePet(@Body Pet pet);

    @DELETE("/pet/{petId}")
    Call<Void> deletePet(@Path("petId") long petId);
}
