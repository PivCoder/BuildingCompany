package com.example.buildingcompany.exception;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.sql.SQLDataException;
import java.util.NoSuchElementException;

@ControllerAdvice
public class GlobalControllerException {

    @ExceptionHandler(NoSuchElementException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleNoSuchElementException(NoSuchElementException ex, Model model) {
        model.addAttribute("errorMessage", "Ошибка: Запрашиваемый элемент не найден: " + ex.getMessage());
        return "error";
    }

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String handleIllegalArgumentException(IllegalArgumentException ex, Model model) {
        model.addAttribute("errorMessage", "Ошибка: Неверный ввод: " + ex.getMessage());
        return "error";
    }

    @ExceptionHandler(SecurityException.class)
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public String handleSecurityException(SecurityException ex, Model model) {
        model.addAttribute("errorMessage", "Ошибка: Доступ запрещен: " + ex.getMessage());
        return "error";
    }

    @ExceptionHandler(SQLDataException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public String handleDatabaseException(SQLDataException ex, Model model) {
        model.addAttribute("errorMessage", "Ошибка: Ошибка базы данных: " + ex.getMessage());
        return "error";
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.SERVICE_UNAVAILABLE)
    public String handleOtherExceptions(Exception ex, Model model) {
        model.addAttribute("errorMessage", "Ошибка: Сервис временно недоступен: " + ex.getMessage());
        return "error";
    }
}