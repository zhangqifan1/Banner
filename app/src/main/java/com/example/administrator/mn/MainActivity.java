package com.example.administrator.mn;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Banner banner;
    private List<String> imageUrl;
    private List<String> bannerTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initView();
    }

    private void initData() {

        //图片地址
        imageUrl = new ArrayList<>();
        imageUrl.add("https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=1511928397,1744182508&fm=28&gp=0.jpg");
        imageUrl.add("https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=49292017,22064401&fm=28&gp=0.jpg");
        imageUrl.add("https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=1303680113,133301350&fm=117&gp=0.jpg");
        //Title名称
        bannerTitle = new ArrayList<>();
        bannerTitle.add("一");
        bannerTitle.add("二");
        bannerTitle.add("三");
    }

    private void initView() {
        banner = (Banner) findViewById(R.id.banner);
        banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR_TITLE);
        banner.setImageLoader(new GlideImageLoader());
        banner.setImages(imageUrl);
        banner.setBannerTitles(bannerTitle);
        banner.setDelayTime(1000);

        banner.start();
    }
}
