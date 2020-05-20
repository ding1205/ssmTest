package com.mhys.controller;



import com.mhys.model.Goods;
import com.mhys.model.User;
import com.mhys.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class GoodsController {
    @Autowired
    GoodsService goodsService;
    @RequestMapping("/selectAll")
    public ModelAndView selectAll(){
        List<Goods> list=goodsService.selectAll();
        ModelAndView mv=new ModelAndView("index1.jsp");
        mv.addObject("list",list);
        return mv;
    }
    @RequestMapping("/selectName")
    public ModelAndView selectName(Goods goods){
        ModelAndView mv = new ModelAndView("goods.jsp");
        List<Goods> list = goodsService.selectName(goods);
        mv.addObject("list",list);
        return mv;


    }
    @RequestMapping("/del")
    public String del(Goods goods){
        int count=goodsService.del(goods);
        return "/selectName";
    }
    @RequestMapping("/insertGoods")
    public ModelAndView insertGoods(Goods goods){
      int count = goodsService.insertGoods(goods);
      if (count>0) return new ModelAndView("redirect:./selectName");
     else return new ModelAndView("/test.jsp");
    }
    @RequestMapping("/selectGoods")
    public ModelAndView selectId(Goods goods){
        ModelAndView mv = new ModelAndView("test.jsp");
        Goods goods1 = goodsService.selectId(goods);
        mv.addObject("good",goods1);
        return mv;
    }
    @RequestMapping("/updateGoods")
    public String add(@RequestParam("sid") String sid, Goods goods){
        if (sid.equals("")){
            int count = goodsService.insertGoods(goods);
            if (count>0) return "redirect:./selectName";
            else return "test.jsp";
        }else {
            goods.setId(Integer.parseInt(sid));
            int count = goodsService.updateId(goods);
            if (count>0)return "redirect:./selectName";
            else return "test.jsp";
        }
    }
}
