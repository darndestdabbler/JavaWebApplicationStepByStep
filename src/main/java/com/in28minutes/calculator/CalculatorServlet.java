package com.in28minutes.calculator;

import java.io.IOException;
import java.math.BigDecimal;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * The calculator page at {@code /calculator.do}: a form for two numbers, and
 * their sum and difference once it is posted.
 */
@WebServlet(urlPatterns = "/calculator.do")
public class CalculatorServlet extends HttpServlet {

	private static final String VIEW = "/WEB-INF/views/calculator.jsp";

	private Calculator calculator = new Calculator();

	/**
	 * Shows the calculator form with no result.
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher(VIEW).forward(request, response);
	}

	/**
	 * Reads {@code left} and {@code right}, and shows their sum and
	 * difference, or a message when either is not a number.
	 */
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
