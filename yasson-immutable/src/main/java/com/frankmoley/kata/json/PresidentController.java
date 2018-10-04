package com.frankmoley.kata.json;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Frank P. Moley III.
 */
@RestController
@RequestMapping("presidents")
public class PresidentController {

    List<President> presidents = new ArrayList<>();

    @GetMapping
    public List<President> getAll() {
        return presidents;
    }

    @PutMapping("{number}")
    public President addPresident(@PathVariable int number, @RequestBody President president) {
        if (number != president.getNumber()) {
            return null;
        }
        presidents.add(president);
        return president;
    }

}