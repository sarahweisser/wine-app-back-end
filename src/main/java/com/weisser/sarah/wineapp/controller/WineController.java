package com.weisser.sarah.wineapp.controller;

import com.weisser.sarah.wineapp.repository.WineRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.weisser.sarah.wineapp.model.wine.Wine;

@RestController
@RequestMapping("/api/v1/wines")
public class WineController {

    // TODO add logging for all methods

    @Autowired
    private WineRepository wineRepository;

    @GetMapping
    public List<Wine> listWines() { return wineRepository.findAll(); }

    @PostMapping
    public void createWine(@RequestBody Wine wine) {
        try {
            // TODO server side validation of entry
            Wine wineTemp = wineRepository.save(wine);
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            // TODO error messaging
        }
    }

    @GetMapping("/{id}")
    public Wine getWine(@PathVariable("id") long id) {
        return wineRepository.getOne(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        wineRepository.deleteById(id);
    }

    @PutMapping
    public Wine update(@PathVariable Long id, @RequestBody Wine wine) {
        //TODO: Add validation that all attributes are passed in, otherwise return a 400 bad payload
        Wine existingWine = wineRepository.getOne(id);
        BeanUtils.copyProperties(wine, existingWine, "id");
        return wineRepository.saveAndFlush(wine);
    }

}
