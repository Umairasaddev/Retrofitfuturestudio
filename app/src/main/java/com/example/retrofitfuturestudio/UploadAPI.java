package com.example.retrofitfuturestudio;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface UploadAPI {

    @Multipart
    @POST("upload")//url location
  //this is request body what included in the requestor we want to send to the server
                //multipart request seperate request into multiple parts

    Call<ResponseBody> uploadImage(
            @Part ("description")RequestBody description,
            @Part MultipartBody.Part photo
            );
}
