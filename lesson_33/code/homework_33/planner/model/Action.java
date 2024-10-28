package homework_33.planner.model;

//Задача 2. Начать реализацию приложения "Список дел".
//
//Использовать enum для организации меню (номер пункта, действие) приложения:
//добавить задачу
//посмотреть все задачи
//удалить задачу (по номеру)
//выйти из меню

public enum Action {
    ADD(1, "Add task"), LOOK(2, "Look through all tasks"), DELETE(3, "Delete task"), EXIT(4, "Exit")
    ;

    private int number;
    private String action;

    Action(int number, String action) {
        this.number = number;
        this.action = action;
    }

    public int getNumber() {
        return number;
    }

    public String getAction() {
        return action;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Planner{");
        sb.append("number=").append(number);
        sb.append(", action='").append(action).append('\'');
        sb.append('}');
        return sb.toString();
    }


}//end of class
