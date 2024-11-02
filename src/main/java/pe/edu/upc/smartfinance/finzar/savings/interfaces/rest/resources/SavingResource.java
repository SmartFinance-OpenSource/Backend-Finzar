package pe.edu.upc.smartfinance.finzar.savings.interfaces.rest.resources;

import java.time.LocalDate;

public record SavingResource(
        Long id,
        Long userId,
        String name,
        double totalGoal,
        double currentAmount,
        Long categoryId,
        LocalDate startDate,
        LocalDate endDate
) {
}