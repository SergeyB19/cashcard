package example.cashcard;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

interface CashCardRepository extends CrudRepository<CashCard,Long>
//PagingAndSortingRepository<CashCard, Long>
{

}
