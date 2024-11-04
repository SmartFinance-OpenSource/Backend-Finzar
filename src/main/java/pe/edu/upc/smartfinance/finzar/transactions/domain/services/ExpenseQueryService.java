package pe.edu.upc.smartfinance.finzar.transactions.domain.services;


import pe.edu.upc.smartfinance.finzar.transactions.domain.model.aggregates.Expense;
import pe.edu.upc.smartfinance.finzar.transactions.domain.model.queries.GetEarningsByWalletIdAndCategoryIdQuery;
import pe.edu.upc.smartfinance.finzar.transactions.domain.model.queries.GetExpenseByIdQuery;

import java.util.List;
import java.util.Optional;

public interface ExpenseQueryService {
    Optional<Expense> handle(GetExpenseByIdQuery query);
    List<Expense> handle(GetEarningsByWalletIdAndCategoryIdQuery query);
}