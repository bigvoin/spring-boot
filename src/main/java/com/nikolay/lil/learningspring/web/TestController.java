package com.nikolay.lil.learningspring.web;

import com.nikolay.lil.learningspring.business.ReservationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/test")
public class TestController {
    private ReservationService reservationService;

    public TestController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getTest(Model model)
    {
        model.addAttribute("rooms", this.reservationService.getRooms());
        return "rooms";
    }
}
