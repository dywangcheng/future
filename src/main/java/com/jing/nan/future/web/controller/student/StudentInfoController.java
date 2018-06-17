package com.jing.nan.future.web.controller.student;

import com.jing.nan.future.comm.restful.ResultModel;
import com.jing.nan.future.service.domain.student.FutureStdInfo;
import com.jing.nan.future.service.repository.student.FutureStdInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentInfoController {

    @Autowired
    private FutureStdInfoRepository stdInfoRepo;

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    @ResponseBody
    public FutureStdInfo getStudentInfo(@RequestParam("name") String name){
        FutureStdInfo one = stdInfoRepo.findByName(name);
        return one;
    }

    @RequestMapping(value = "/info", method = RequestMethod.POST , produces = "application/json")
    @ResponseBody
    public void createStudent(@RequestBody FutureStdInfo oneStudent){
        stdInfoRepo.save(oneStudent);
    }

}
