package cn.stylefeng.guns.modular.form.controller;

import cn.stylefeng.roses.core.base.controller.BaseController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: TODO
 * @author: 医保产品二部 - 卢东阳
 * @date: 2020-09-27 10:33
 */
@RestController
@RequestMapping("/main-cloud/musicPlayer")
public class MusicPlayerController extends BaseController {

    @PostMapping("/test")
    public String testApi() {
        return "成功啦！";
    }
}
