package com.example.songr.controller;


import com.example.songr.model.Song;
import com.example.songr.repository.AlbumsRepository;
import com.example.songr.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SongController {

    @Autowired
    SongRepository songRepository ;
    @Autowired
    AlbumsRepository albumsRepository ;


    // post request //commit it after added to DB
//   @GetMapping("/newSongs") // this should be a post, we are just adding it as get to run the function without using a form
//  public RedirectView addNewSong() {
//       Song song1 = new Song ("Boy Boy" , 123 ,2);
//      songRepository.save(song1);
//      return new RedirectView("/songs");
//   }

    @GetMapping("/songs")
    public  String songs (Model model){
        model.addAttribute("song" , songRepository.findAll());
        return "songs.html";
    }

    @GetMapping("/albums/{id}")
    public String getSongs(@PathVariable ("id") int id , Model model){
        model.addAttribute("albums",albumsRepository.findById(id).get());
        return("oneAlbum.html");
    }

    @PostMapping("/addSong/{id}")
    public RedirectView addSong(@ModelAttribute Song song , @PathVariable("id") int id){
        song.setAlbums(albumsRepository.findById(id).get());
        songRepository.save(song);
        return new RedirectView("/albums/{id}");
    }

}
