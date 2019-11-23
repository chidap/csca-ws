package com.chida.csca.ws.ui.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class MemberController {

    /**
     * Get method to find a member complete information
     * @return
     */
    @GetMapping
    public String getMember() {
        return "get member was called";
    }

    /**
     * Post method to store and create a new member information
     * @return
     */
    @PostMapping
    public String createMember() {
        return "Cretae member was called";
    }

    /**
     * Put method to update an existing member information
     * @return
     */
    @PutMapping
    public String updateMember() {
        return "update member was called";
    }

    /**
     * Delete method to delete an existing member information
     * @return
     */
    @DeleteMapping
    public String deleteMember() {
        return "delete member was called";
    }

}
