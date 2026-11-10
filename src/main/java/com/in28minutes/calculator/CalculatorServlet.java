package com.in28minutes.calculator;

import java.io.IOException;
import java.math.BigDecimal;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/calculator.do")
public class CalculatorServlet extends HttpServlet {

	private static final String VIEW = "/WEB-INF/views/calculator.jsp";

	private Calculator calculator = new Calculator();

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher(VIEW).forward(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String left = request.getParameter("left");
		String right = request.getParameter("right");
		request.setAttribute("left", left);
		request.setAttribute("right", right);
		try {
			BigDecimal a = new BigDecimal(left.trim());
			BigDecimal b = new BigDecimal(right.trim());
			request.setAttribute("sum", calculator.add(a, b));
			request.setAttribute("difference", calculator.subtract(a, b));
		} catch (NumberFormatException | NullPointerException e) {
			request.setAttribute("errorMessage", "Enter two numbers.");
		}
		request.getRequestDispatcher(VIEW).forward(request, response);
	}
}
