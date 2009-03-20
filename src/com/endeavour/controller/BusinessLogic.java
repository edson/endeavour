package com.endeavour.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface BusinessLogic {
	void execute(HttpServletRequest request, HttpServletResponse response) throws Exception;
}