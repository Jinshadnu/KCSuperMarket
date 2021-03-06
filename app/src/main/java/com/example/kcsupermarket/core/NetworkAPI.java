package com.example.kcsupermarket.core;



import com.example.kcsupermarket.register.pojo.RegisterResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface NetworkAPI {

    @FormUrlEncoded
    @POST("register")
    Call<RegisterResponse> userRegistration(@Field("name") String name, @Field("mob")String phone, @Field("email")String email, @Field("password")String password,@Field("confirm_password")String confirm_password);

//    @FormUrlEncoded
//    @POST("login")
//    Call<LoginResponse> userLogin(@Field("phone") String phone, @Field("password")String password);

//    @GET("get_service")
//    Call<ServiceResponse> getServices();
//
//    @FormUrlEncoded
//    @POST("change_password")
//    Call<ComonResponse> changePassword(@Field("user_id") String id, @Field("old_password") String oldPassword, @Field("new_password")String newPassword);
//
//
//    @FormUrlEncoded
//    @POST("forgot_password")
//    Call<ComonResponse> forgetPassword(@Field("email") String email);
//
//
//    @FormUrlEncoded
//    @POST("add_to_cart")
//    Call<ComonResponse> addToCart(@Field("user_id")String id,@Field("service_name")String service_name,@Field("item_id")String item_id,@Field("quantity")String quantity,@Field("price") String price);
//
//    @GET("get_cart")
//    Call<CartResponse> getCartItems(@Query("user_id") String user_id);
//
//    @FormUrlEncoded
//    @POST("add_address")
//    Call<ComonResponse> addAddress(@Field("user_id")String id,@Field("building_number")String number,@Field("street_address") String address,@Field("zone_number")String zone);
//
//
//    @FormUrlEncoded
//    @POST("add_order")
//    Call<ComonResponse> addOrder(@Field("user_id") String user_id,@Field("building_number")String buliding_number,@Field("street_number") String street_number,@Field("zone")String zone,@Field("latitude")String latitude,@Field("longitude")String longitude,@Field("address")String address,@Field("order_type")int orderType);
//
//    @GET("get_address")
//    Call<AddressResponse> getAddress(@Query("user_id")String user_id);
//
//    @GET("get_orders")
//    Call<OrderResponse> getOrders(@Query("user_id")String user_id);
//
//    @FormUrlEncoded
//    @POST("delete_cart_item")
//    Call<ComonResponse> deleteCartItem(@Field("user_id")String user_id,@Field("item_id")String item_id);
//
//    @FormUrlEncoded
//    @POST("update_count")
//    Call<UpdateResponse> updateCartItem(@Field("item_id")String item_id, @Field("user_id")String user_id, @Field("quantity")String quantity,@Field("price")String price);
//
//    @GET("getuser_details")
//    Call<UserResponse> getuserDetails(@Query("user_id") String user_id);
//
//    @FormUrlEncoded
//    @POST("edit_profile")
//    Call<ComonResponse> editProfile(@Field("user_id")String userId,@Field("phone") String phone,@Field("email") String email);
//
//    @FormUrlEncoded
//    @POST("order_cancel")
//    Call<ComonResponse> orderCancel(@Field("order_id")String orderId);
//
//    @FormUrlEncoded
//    @POST("getordered_items")
//    Call<OrderedItemResponse> getOrderedItems(@Field("order_id")String orderId);








}
