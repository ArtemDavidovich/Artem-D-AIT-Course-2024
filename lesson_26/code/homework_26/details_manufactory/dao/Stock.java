package homework_26.details_manufactory.dao;

//Интерфейс Stock c методами:
//
//добавить деталь на склад+
//найти деталь по barCode+
//обновить данные о детали+
//удалить деталь+
//общая масса всех деталей на складе+
//средняя масса деталей на складе+

import homework_26.details_manufactory.model.Detail;

public interface Stock {

    boolean addDetail(Detail detail);

    Detail findDetail(long barCode);

    Detail updateDetail(Detail detail, long barCode);

    Detail removeDetail(long barCode);

    int quantity();

    double totalWeight(Detail[] details);

    double averageWeight(Detail[] details);

}//end of class
