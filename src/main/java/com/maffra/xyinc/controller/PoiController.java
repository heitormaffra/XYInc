package com.maffra.xyinc.controller;

import com.maffra.xyinc.domain.Poi;
import com.maffra.xyinc.repository.PoiRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author heitor
 */
@RestController
public class PoiController {

    @Autowired
    private PoiRepository repository;

    @RequestMapping(path = "/proximidade", method = RequestMethod.GET)
    public List<Poi> listarPorProximidade(@RequestParam(value = "x", required = false) Integer x,
            @RequestParam(value = "y", required = false) Integer y) {

        List<Poi> pois = repository.findAll();
        List<Poi> poisProximos = new ArrayList<>();
        
        pois.forEach(p -> {
            int coordenadaX = p.getCoordenadaX();
            int coordenadaY = p.getCoordenadaY();
            
            int referenciaX = coordenadaX - x;
            int referenciaY = coordenadaY - y;
            
            Double distancia = Math.sqrt(Math.pow(referenciaX, 2) + Math.pow(referenciaY, 2));
            
            if(distancia <= 10.0d){
                poisProximos.add(p);
            }
        });

        return poisProximos;
    }

}
