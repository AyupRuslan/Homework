package ru.ibs.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.ibs.spring.entity.*;
import ru.ibs.spring.exception_handling.NoSuchCarException;
import ru.ibs.spring.service.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRestController {
    @Autowired
    private CarService carService;
    @Autowired
    private EngineService engineService;
    @Autowired
    private GearService gearService;
    @Autowired
    private GearService manualService;
    @Autowired
    private SteeringWheelService steeringWheelService;
    @Autowired
    private Car1Service car1Service;

    @GetMapping
    public String Show(){

        return "ok";}

/////////////////////////////////////////////////////////
    @GetMapping("/car")
    public List<Car> ShowAllCar(){
        List<Car> allCar =carService.getAllCar();
        return allCar;
    }

    @GetMapping("/car/{id}")
    public Car getCar(@PathVariable int id){
        Car car = carService.getCar(id);

        if (car==null){
            throw new NoSuchCarException("There is no car id = " + id + " in Database");
        }
        return  car;
    }

    @PostMapping("/car")
    public Car addNewCar(@RequestBody Car car){

        carService.saveCar(car);
        return  car;
    }

    @PutMapping("/car")
    public Car updateCar(@RequestBody Car car){

        carService.saveCar(car);

        return car;
    }

    @DeleteMapping("/car/{id}")
    public String deleteCar(@PathVariable int id){
        Car car =carService.getCar(id);
        if (car==null){
            throw new NoSuchCarException("There is no car with id = " +id);
        }

        carService.deleteCar(id);
        return "Car with id = "+id+" wath deleted";
    }
    //////////////////////////////////////////////////////////////////////////
    @GetMapping("/engine")
    public List<Engine> ShowAllEngine(){
        List<Engine> allEngine =engineService.getAllEngine();
        return allEngine;
    }

    @GetMapping("/engine/{id}")
    public Engine getEngine(@PathVariable int id){
        Engine engine = engineService.getEngine(id);

        if (engine==null){
            throw new NoSuchCarException("There is no engine id = " + id + " in Database");
        }
        return  engine;
    }

    @PostMapping(value = "/engine/post", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public void addNewEngine(@RequestBody Engine engine){

        engineService.saveEngine(engine);

    }

    @PutMapping("/engine")
    public Engine updateEngine(@RequestBody Engine engine){

        engineService.saveEngine(engine);

        return engine;
    }

    @DeleteMapping("/engine/{id}")
    public String deleteEngine(@PathVariable int id){
        Engine engine =engineService.getEngine(id);
        if (engine==null){
            throw new NoSuchCarException("There is no Engine with id = " +id);
        }

        engineService.deleteEngine(id);
        return "Engine with id = "+id+" wath deleted";
    }
    ///////////////////////////////////////////////////////////////GEAR/////
    @GetMapping("/gear")
    public List<Gear> ShowAllGear(){
        List<Gear> allGear =gearService.getAllGear();
        return allGear;
    }

    @GetMapping("/gear/{id}")
    public Gear getGear(@PathVariable int id){
        Gear gear = gearService.getGear(id);

        if (gear==null){
            throw new NoSuchCarException("There is no gear id = " + id + " in Database");
        }
        return  gear;
    }

    @PostMapping(value = "/gear/post", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public void addNewGear(@RequestBody Gear gear){

        gearService.saveGear(gear);

    }

    @PutMapping("/gear")
    public Gear updateGear(@RequestBody Gear gear){

        gearService.saveGear(gear);

        return gear;
    }

    @DeleteMapping("/gear/{id}")
    public String deleteGear(@PathVariable int id){
        Gear gear =gearService.getGear(id);
        if (gear==null){
            throw new NoSuchCarException("There is no Gear with id = " +id);
        }

        gearService.deleteGear(id);
        return "Gear with id = "+id+" wath deleted";
    }
    ///////////////////////////////////////////////////////////////STEERINGWHEEL/////
    @GetMapping("/sw")
    public List<SteeringWheel> ShowAllSteeringWheel(){
        List<SteeringWheel> allSteeringWheel =steeringWheelService.getAllSteeringWheel();
        return allSteeringWheel;
    }

    @GetMapping("/sw/{id}")
    public SteeringWheel getSteeringWheel(@PathVariable int id){
        SteeringWheel steeringWheel = steeringWheelService.getSteeringWheel(id);

        if (steeringWheel==null){
            throw new NoSuchCarException("There is no steeringWheel id = " + id + " in Database");
        }
        return  steeringWheel;
    }

    @PostMapping(value = "/sw/post", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public void addNewSteeringWheel(@RequestBody SteeringWheel steeringWheel){

        steeringWheelService.saveSteeringWheel(steeringWheel);

    }

    @PutMapping("/sw")
    public SteeringWheel updateSteeringWheel(@RequestBody SteeringWheel steeringWheel){

        steeringWheelService.saveSteeringWheel(steeringWheel);

        return steeringWheel;
    }

    @DeleteMapping("/sw/{id}")
    public String deleteSteeringWheel(@PathVariable int id){
        SteeringWheel steeringWheel =steeringWheelService.getSteeringWheel(id);
        if (steeringWheel==null){
            throw new NoSuchCarException("There is no steeringWheel with id = " +id);
        }

        steeringWheelService.deleteSteeringWheel(id);
        return "steeringWheel with id = "+id+" wath deleted";
    }
}

