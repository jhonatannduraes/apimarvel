package com.marvel.marvel.service;

import com.marvel.marvel.model.CharactersResponse;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(name = "marvel", url = "http://gateway.marvel.com/v1/public")
public interface MarvelFeignClient {

    // @RequestMapping(method = RequestMethod.GET, value = "/characters")
    // CharactersResponse gCharactersResponse(@RequestParam(value = "currentTime") Long timeStamp, 
    //                                        @RequestParam(value = "apikey") String publicKey,
    //                                        @RequestParam(value = "hash") String hashMD5);

    @GetMapping("/characters")
    public CharactersResponse findAll (@RequestParam(value = "ts") Long timeStamp, 
                                  @RequestParam(value = "apikey") String publicKey,
                                  @RequestParam(value = "hash") String hashMD5);
    
}
