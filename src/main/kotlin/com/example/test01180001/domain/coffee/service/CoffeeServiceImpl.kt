package com.example.test01180001.domain.coffee.service

import com.example.test01180001.domain.coffee.dto.CoffeeResponse
import com.example.test01180001.domain.coffee.dto.CreateCoffeeRequest
import org.springframework.stereotype.Service


@Service
class CoffeeServiceImpl():CoffeeService{


    override fun getAllCoffeeList(): List<CoffeeResponse> {
        TODO("Not yet implemented")
    }

    override fun createCoffee(requset: CreateCoffeeRequest): CoffeeResponse {
        TODO("Not yet implemented")
    }

}