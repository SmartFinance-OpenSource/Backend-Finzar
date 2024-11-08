package pe.edu.upc.smartfinance.finzar.transactions.domain.services;

import pe.edu.upc.smartfinance.finzar.transactions.domain.model.aggregates.Earning;
import pe.edu.upc.smartfinance.finzar.transactions.domain.model.queries.GetEarningByIdQuery;
import pe.edu.upc.smartfinance.finzar.transactions.domain.model.queries.GetEarningsByWalletIdAndCategoryIdQuery;

import java.util.List;
import java.util.Optional;

public interface EarningQueryService {
    Optional<Earning> handle(GetEarningByIdQuery query);
    List<Earning> handle(GetEarningsByWalletIdAndCategoryIdQuery query);

}
