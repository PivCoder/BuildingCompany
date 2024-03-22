package com.example.buildingcompany.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.ui.Model;


@ControllerAdvice
public class GlobalControllerException {

    @ExceptionHandler(ElementNotFoundException.class)
    public String handleElementNotFoundException(ElementNotFoundException ex, Model model) {
        model.addAttribute("errorMessage", "Ошибка: Запрашиваемый элемент не найден: " + ex.getMessage());
        return "error";
    }

    @ExceptionHandler(InvalidInputException.class)
    public String handleInvalidInputException(InvalidInputException ex, Model model) {
        model.addAttribute("errorMessage", "Ошибка: Неверный ввод: " + ex.getMessage());
        return "error";
    }

    @ExceptionHandler(AccessDeniedException.class)
    public String handleAccessDeniedException(AccessDeniedException ex, Model model) {
        model.addAttribute("errorMessage", "Ошибка: Доступ запрещен: " + ex.getMessage());
        return "error";
    }

    @ExceptionHandler(DatabaseException.class)
    public String handleDatabaseException(DatabaseException ex, Model model) {
        model.addAttribute("errorMessage", "Ошибка: Ошибка базы данных: " + ex.getMessage());
        return "error";
    }

    @ExceptionHandler(ServiceUnavailableException.class)
    public String handleServiceUnavailableException(ServiceUnavailableException ex, Model model) {
        model.addAttribute("errorMessage", "Ошибка: Сервис временно недоступен: " + ex.getMessage());
        return "error";
    }

    // Добавьте обработчики для других типов ошибок здесь, если необходимо
}
