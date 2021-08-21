package cm.belrose.springkotlindemo.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController {

    @RequestMapping("/")
    fun home(@RequestParam num:Int):String {
        var user=""
        if(num==1){
            user="Dan"
        }else if(num==2){
            user="Cornelia"
        }else if(num==3){
            user="Samuel"
        }
        return "Welcome $user"
    }
}