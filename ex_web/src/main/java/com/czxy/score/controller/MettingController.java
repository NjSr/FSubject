package com.czxy.score.controller;

import com.czxy.score.domain.Metting;
import com.czxy.score.domain.User;
import com.czxy.score.service.MettingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.java2d.pipe.SpanIterator;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("metting")
public class MettingController {


    @Resource
    private MettingService mettingService;

    @GetMapping
    public ResponseEntity<List<Metting>> findAll(HttpServletRequest request){
        User user = (User) request.getSession().getAttribute("user");
        try {
            List<Metting> list = mettingService.findAllByUserName(user.getUsername());
            return new ResponseEntity<>(list, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{metting_id}")
    public ResponseEntity<Metting> findBymetting_id(@PathVariable("metting_id") Integer metting_id ,HttpServletRequest request){
        try {
            Metting metting = mettingService.selectById(metting_id);
            request.getSession().setAttribute("metting",metting);
            return new ResponseEntity<>(metting,HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/getMetting")
    public ResponseEntity<Metting> findSession(HttpServletRequest request){
        Metting metting = (Metting) request.getSession().getAttribute("metting");
        System.out.println(metting);
        Metting m = mettingService.selectByMeetinName(metting.getMetting_name());
        System.out.println(m);
        return new ResponseEntity<>(m,HttpStatus.OK);
    }

    @GetMapping("/data")
    public ResponseEntity<List<Metting>> findByDate(HttpServletRequest request){
        User user = (User) request.getSession().getAttribute("user");
        try {
            List<Metting> list = mettingService.selectByDate("2019-07-24 00:00:00","2019-07-30 00:00:00",user.getUsername());
            System.out.println(list);
            return new ResponseEntity<>(list,HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
