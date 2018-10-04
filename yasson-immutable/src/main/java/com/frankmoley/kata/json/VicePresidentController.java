package com.frankmoley.kata.json;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Frank P. Moley III.
 */
@RestController
@RequestMapping("vps")
public class VicePresidentController {

    List<VicePresident> vps = new ArrayList<>();

    @GetMapping
    public List<VicePresident> getAll() {
        return vps;
    }

    @PutMapping("{number}")
    public VicePresident addPresident(@PathVariable int number, @RequestBody VicePresident vp) {
        if (number != vp.getNumber()) {
            return null;
        }
        vps.add(vp);
        return vp;
    }
}
