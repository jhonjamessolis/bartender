package com.aldeamo.bartender.controlller;

import com.aldeamo.bartender.dto.ReqBartender;
import com.aldeamo.bartender.dto.ResBartender;
import com.aldeamo.bartender.service.BartenderService;
import com.aldeamo.bartender.service.BartenderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bartender")
public class BartenderController {

    @Autowired
    private BartenderService bartenderService;

    @RequestMapping(
            value = "/getArray",
            method = {
                    RequestMethod.GET
            },
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResBartender getArray(@RequestBody ReqBartender reqBartender) {
        return bartenderService.getArray(reqBartender);
    }

}
