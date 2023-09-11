package cat.itacademy.barcelonactiva.torres.kathya.s04.t02.n03.S04T02N03TorresKathya.controllers;

import cat.itacademy.barcelonactiva.torres.kathya.s04.t02.n03.S04T02N03TorresKathya.models.FrutaModel;
import cat.itacademy.barcelonactiva.torres.kathya.s04.t02.n03.S04T02N03TorresKathya.services.FrutaService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
public class FrutaController {
    @Autowired
    private FrutaService frutaService;

    @GetMapping(value="/frutas",produces = "application/json")
    public ArrayList<FrutaModel> getFrutas(){
        return this.frutaService.getFrutas();
    }

    @PostMapping(value = "/fruta")
    public FrutaModel saveFruta(@RequestBody FrutaModel fruta){
        return this.frutaService.saveFruta(fruta);
    }

    @GetMapping(value = "/{id}")
    public Optional<FrutaModel> getFrutaById(@PathVariable("id") String idStr){
        ObjectId id = new ObjectId(idStr);
        return this.frutaService.getById(id);
    }

    @PutMapping(value = "/{id}")
    public FrutaModel updateFruta(@RequestBody FrutaModel request, @PathVariable("id") String idStr) {
        ObjectId id = new ObjectId(idStr);
        return this.frutaService.updateById(request, id);
    }

    @DeleteMapping(value = "/{id}")
    public String deleteById(@PathVariable("id") String idStr){
        ObjectId id = new ObjectId(idStr);
        boolean ok = this.frutaService.deleteFruta(id);

        if(ok){
            return "La Fruta con id " + idStr + " se ha borrado";
        }else {
            return "Error";
        }
    }
}