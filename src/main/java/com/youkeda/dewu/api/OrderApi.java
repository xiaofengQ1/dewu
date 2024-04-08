package com.youkeda.dewu.api;

import com.youkeda.dewu.model.Order;
import com.youkeda.dewu.model.Paging;
import com.youkeda.dewu.model.Result;
import com.youkeda.dewu.param.QueryOrderParam;
import com.youkeda.dewu.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.awt.print.Pageable;

@Controller
@RequestMapping(path = "/api/order")
public class OrderApi {

    @Autowired
    private OrderService orderService;

    /**
     * 生成订单Api
     *
     * @return Result
     */
    @PostMapping(path = "/add")
    @ResponseBody
   public Result<Order> payOrder(@RequestBody Order order, HttpServletRequest request) {
        Result result = new Result();
        result.setSuccess(true);
        if (order == null) {
            result.setSuccess(false);
            result.setMessage("order is null");
            return result;
        }
        String userId = (String)request.getSession().getAttribute("userId");
        if (userId == null) {
            result.setSuccess(false);
            result.setMessage("没有获取登录信息");
            return result;
        }
        order.setUserId(userId);
        Order orderResult = orderService.add(order);
        result.setData(orderResult);
        return result;
    }

    @GetMapping("/queryrecentpaysuccess")
    @ResponseBody
    public Result<Paging<Order>> query(QueryOrderParam queryOrderParam){
        Result<Paging<Order>> result = new Result();
        result.setSuccess(true);
        if (queryOrderParam == null) {
            result.setSuccess(false);
            result.setMessage("queryOrderParam is null");
            return result;
        }
        result.setData(orderService.queryRecentPaySuccess(queryOrderParam));
        return result;
    }
}
