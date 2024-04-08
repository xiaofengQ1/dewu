package com.youkeda.dewu.control;

import com.youkeda.dewu.model.Order;
import com.youkeda.dewu.model.Result;
import com.youkeda.dewu.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private OrderService orderService;
    @PostMapping("/insert")
    @ResponseBody
    public Order addOrder(@RequestBody Order order){
        orderService.add(order);
        return order;
    }

    @GetMapping("/select")
    @ResponseBody
    public Result<Order> sByOrderNum(@RequestParam("orderNum") String orderNumber){
        Result<Order> result = new Result<>();
        result.setSuccess(true);
        result.setData(orderService.getByOrderNumber(orderNumber));
        return result;
    }


}
