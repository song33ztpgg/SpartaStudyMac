package com.example.test01180001.domain.coffee.service

import com.example.test01180001.domain.coffee.dto.CoffeeResponse
import com.example.test01180001.domain.coffee.dto.CreateCoffeeRequest


interface CoffeeService {

    fun getAllCoffeeList():List<CoffeeResponse>

    fun createCoffee(requset: CreateCoffeeRequest):CoffeeResponse
}