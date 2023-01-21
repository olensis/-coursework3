package me_sad.coursework3.Controller;

import me_sad.coursework3.InfoRecord;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {
    @GetMapping
    public String shop() {
        return "Интернет магазин запущен";
    }

    @GetMapping("/info")
    public InfoRecord info() {
        return new InfoRecord("Садовникова Екатерина ", "Интернет магазин по продаже носков");
    }
}
