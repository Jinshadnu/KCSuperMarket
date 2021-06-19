package com.example.kcsupermarket.register.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.kcsupermarket.register.pojo.RegisterResponse;
import com.example.kcsupermarket.register.repository.RegisterRepository;


public class RegisterViewModel extends ViewModel {
    public RegisterRepository registerRepository;

    public RegisterViewModel() {
        this.registerRepository=new RegisterRepository();
    }

    public LiveData<RegisterResponse> register(String name, String mob, String email, String password, String confirm_password){
      return registerRepository.register(name, mob, email, password, confirm_password);
    }
}
