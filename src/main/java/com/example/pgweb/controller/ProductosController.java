package com.example.pgweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.pgweb.entity.Productos;
import com.example.pgweb.service.ProductosService;

@Controller
@RequestMapping("/productos")
public class ProductosController {

    @Autowired
    @Qualifier("productosservice")
    private ProductosService productosService;



    @GetMapping("/productosform")
    public String ProForm(Model model, @RequestParam(name="id", required=true) int id){
        Productos p=new Productos();
        if(id!=0){
            p=productosService.findProductosById(id);
        }
        model.addAttribute("productos", p);
        return"productosform";
    }

    @PostMapping("/addproductos")
    public String addProductos(@ModelAttribute(name="productos") Productos productos){
        productosService.addProductos(productos);
        return"redirect:/productos/listadopro";
    }

    @GetMapping("/listadopro")
    public ModelAndView ListadoProductos(){
        ModelAndView mav= new ModelAndView("productos");
        mav.addObject("productos", productosService.ListAllProductos());
        return mav;
    }

    @GetMapping("/removeproductos")
    public ModelAndView removeProductos(@RequestParam(name="id", required=true) int id){
        productosService.removeProductos(id);
        return ListadoProductos();

    }
    
}
