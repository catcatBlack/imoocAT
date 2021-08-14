package sever;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@RestController
@Api(value = "/",description = "这是全部的get方法")
public class myGetMethod {
    @RequestMapping(value = "/get/cookies",method = RequestMethod.GET)
    @ApiOperation(value = "通过这个方法可以获得cookies",httpMethod = "GET")
    public String getCookies(HttpServletResponse response){
        Cookie cookie = new Cookie("login","true");
        response.addCookie(cookie);
        return "success get cookies";
    }

    //get with cookies
    @RequestMapping(value = "/getwith/cookies",method = RequestMethod.GET)
    @ApiOperation(value = "要求携带cookies访问",httpMethod = "GET")
    public String getWithCookies(HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        if(Objects.isNull(cookies)){
            return "must request with cookies";
        }
        for(Cookie c : cookies){
            if(c.getName().equals("login") && c.getValue().equals("true")){
                return "success";
            }
        }
        return "must request correct cookies";

    }

    /**
     * 开发一个需要携带参数才能访问的get请求
     * 第一种实现方式 url：key=value&key=value
     * 1.模拟获取商品列表
     *
     */
    @RequestMapping(value = "/getwith/param",method = RequestMethod.GET)
    @ApiOperation(value = "携带参数才能访问的方法一",httpMethod = "GET")
    public Map<String,Integer> getList(@RequestParam Integer start,@RequestParam Integer end){
        Map<String,Integer> mylist = new HashMap<>();

        mylist.put("shoes",150);
        mylist.put("shirt",30);
        mylist.put("food",10);

        return mylist;
    }

    /**
     * 第二种实现方式，另一种url
     *
     */
    @RequestMapping(value = "/getwith/param/{start}/{end}")
    @ApiOperation(value = "携带参数才能访问的方法二",httpMethod = "GET")
    public Map<String,Integer> mygetList(@PathVariable Integer start,@PathVariable Integer end){
        Map<String,Integer> mylist = new HashMap<>();

        mylist.put("shoes",150);
        mylist.put("shirt",30);
        mylist.put("food",10);

        return mylist;
    }
}
