package com.example.retrofitfuturestudio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.io.File;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    String filePath = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uploadImage();
    }

    private void uploadImage()
    {

        File file = new File(filePath);

        Retrofit retrofit  = NetworkClient.getRetrofit();

        RequestBody requestBody = RequestBody.create(MediaType.parse("image/*"),file);
        MultipartBody.Part part = MultipartBody.Part.createFormData("newimage",file.getName(),requestBody);

        RequestBody description = RequestBody.create(MediaType.parse("text/plain"),"This is a new Image");



        UploadAPI uploadAPI = retrofit.create(UploadAPI.class);
        Call call = uploadAPI.uploadImage(description, part);

        call.enqueue(new Callback() {
            @Override
            public void onResponse(Call call, Response response) {

            }

            @Override
            public void onFailure(Call call, Throwable t) {

            }
        });

    }
}