package com.example.songr.controller;

import com.example.songr.model.Albums;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
@Controller
public class AlbumController {
    @GetMapping("/albums")

    public String albums(Model model) {
        //create instance from Albums model
        Albums albums1 = new Albums ("baby shark" , "Pinkfong Songs " ,5 ,4020, "https://images-na.ssl-images-amazon.com/images/S/sgp-catalog-images/region_US/daag1-CW999FTDJ35-Full-Image_GalleryBackground-en-US-1605902446047._SX1080_.png");
        Albums albums2 = new Albums ("Wheels on the Bus " , "CoComelon " ,3 ,3255, "https://cdns-images.dzcdn.net/images/cover/f8598dd0d54c5c5ca38eaade0e7f5dbe/500x500.jpg");
        Albums albums3 = new Albums ("Balloon Boat Race " , "CoComelon " ,3 ,3652, "https://wp-live-videos-bucket.s3.ap-south-1.amazonaws.com/UCbCmjCuTUZos6Inko4u57UQ/WRVsOCh907o.jpg");

        //  create arraylist from albums model to add albums to model object
        List<Albums> albumsList = new ArrayList<Albums>();
        albumsList.add (albums1);
        albumsList.add (albums2);
        albumsList.add (albums3);
        model.addAttribute("albums",albumsList);

        return "Albums.html";
    }

}
