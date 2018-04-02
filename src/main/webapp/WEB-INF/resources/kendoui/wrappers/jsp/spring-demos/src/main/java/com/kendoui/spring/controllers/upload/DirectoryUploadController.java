package com.kendoui.spring.controllers.upload;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("upload-directoryupload-controller")
@RequestMapping(value="/upload/")
public class DirectoryUploadController {
    
    @RequestMapping(value = "/directoryupload", method = RequestMethod.GET)
    public String index() {
        return "upload/directoryupload";
    }
}