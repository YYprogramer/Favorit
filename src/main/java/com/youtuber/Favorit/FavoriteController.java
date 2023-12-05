package com.youtuber.Favorit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FavoriteController {
    @GetMapping("/youtuber")
    public List<Youtuber> getYoutuber() {
        return List.of(
                new Youtuber("中田敦彦のYoutube大学","教養"),
                new Youtuber("きよ","ゲーム実況"),
                new Youtuber("両学長 リベラルアーツ大学","教養")
        );
    }
}
