package com.example.madhura;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Controller
public class Page1 {

    int Winner,You,Machine;
    Map<Integer,String> map;

    @RequestMapping("StonePaperScissor")
    public ModelAndView StonePaperScissor(@RequestParam("you") String you){

        System.out.println(you);
        generateMap();
        setVariable(you);
        findInputResult();
        System.out.println(Machine);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name",you);
        modelAndView.setViewName("page1.html");
        return modelAndView;
    }

    private void setVariable(String you) {
        You = Integer.parseInt(you);
        Random random = new Random();
        Machine = random.nextInt(3-0 + 1) + 0;
    }

    private void findInputResult() {

        if(You == Machine){
            Winner = 0;
        }
        else if(Math.abs(You - Machine) == 1){
            Winner = Math.max(You,Machine);
        }
        else{
            Winner = Math.min(You,Machine);
        }
        System.out.println(map.get(Winner));
    }

    private void generateMap() {
        map = new HashMap<>();
        map.put(1,"stone");
        map.put(2,"paper");
        map.put(3,"scissor");
    }

}
