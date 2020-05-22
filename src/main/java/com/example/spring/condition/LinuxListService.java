package com.example.spring.condition;

public class LinuxListService implements ListService {
    @Override
    public String showListService() {
        return "ls";
    }
}
