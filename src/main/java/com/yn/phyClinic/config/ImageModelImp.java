package com.yn.phyClinic.config;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.ai.image.ImageModel;
import org.springframework.ai.image.ImageOptions;
import org.springframework.ai.image.ImagePrompt;
import org.springframework.ai.image.ImageResponse;

//
//@AllArgsConstructor
//@NoArgsConstructor
//@Data
//@Builder
//public class ImageModelImp implements ImageModel {
//    @Override
//    public ImageResponse call(ImagePrompt request) {
//
//        ImageResponse response =this.call(
//
//                new ImagePrompt("A cat chasing a mouse",
//                        ImageOptions.builder()
//                                .withQuality("hd")
//                                .withN(1)
//                                .withHeight(1024)
//                                .withWidth(1024)
//                                .build())
//        );
//        return null;
//    }
//}
