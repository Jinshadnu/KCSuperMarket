package com.example.kcsupermarket.register.repository;


import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.kcsupermarket.core.NetworkAPI;
import com.example.kcsupermarket.core.NetworkService;
import com.example.kcsupermarket.register.pojo.RegisterResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegisterRepository {
    public NetworkAPI networkInterface;


    public RegisterRepository() {

    }

    public LiveData<RegisterResponse> register(String name, String mob, String email, String password, String confirm_password){
        MutableLiveData mutableLiveData=new MutableLiveData();
        networkInterface= NetworkService.getRetrofitInstance().create(NetworkAPI.class);

        Call<RegisterResponse> responseCall=networkInterface.userRegistration(name,mob,email,password,confirm_password);
        responseCall.enqueue(new Callback<RegisterResponse>() {
            @Override
            public void onResponse(Call<RegisterResponse> call, Response<RegisterResponse> response) {
                RegisterResponse registerResponse=response.body();
                if (registerResponse != null){
                    mutableLiveData.postValue(registerResponse);
                }

            }

            @Override
            public void onFailure(Call<RegisterResponse> call, Throwable t) {
             mutableLiveData.postValue(null);
            }
        });

        return mutableLiveData;
    }

}

