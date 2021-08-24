package com.example.songr.controller;

import com.example.songr.model.Albums;
import com.example.songr.repository.AlbumsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;
@Controller
public class AlbumController {

    @Autowired // add notation before using repo
    AlbumsRepository albumsRepository ;

    @GetMapping("/albums")
    public String albumController (Model model) {
        model.addAttribute("albums", albumsRepository.findAll()); // findall to get information from db
        return "Albums.html";
    }

//        commit it after added to DB
    // post request
//    @GetMapping("/newAlbums") // this should be a post, we are just adding it as get to run the function without using a form
    //create + save + return
//    public RedirectView addNewAlbums() {
//        Albums albums1 = new Albums ("Baby shark" , "Pinkfong Songs " ,5 ,4020, "https://images-na.ssl-images-amazon.com/images/S/sgp-catalog-images/region_US/daag1-CW999FTDJ35-Full-Image_GalleryBackground-en-US-1605902446047._SX1080_.png");
//        Albums albums2 = new Albums ("Wheels on the Bus " , "CoComelon " ,3 ,3255, "https://cdns-images.dzcdn.net/images/cover/f8598dd0d54c5c5ca38eaade0e7f5dbe/500x500.jpg");
//        Albums albums3 = new Albums ("Balloon Boat Race " , "CoComelon " ,3 ,3652, "https://wp-live-videos-bucket.s3.ap-south-1.amazonaws.com/UCbCmjCuTUZos6Inko4u57UQ/WRVsOCh907o.jpg");
//
//        albumsRepository.save(albums1);
//        albumsRepository.save(albums2);
//        albumsRepository.save(albums3);

//        return new RedirectView("/albums");
//    }
@PostMapping("/addAlbum")
public RedirectView  addFormData (@ModelAttribute Albums album , Model model){
    model.addAttribute("album" , album);
    albumsRepository.save(album);
    return new RedirectView("/albums");
}

}
