// Создаем класс - замена ссылок
class IntRef
{
    public int value_ = 0;
 
    IntRef(int value) {
        this.value_ = value;
    }
 
    @Override
    public String toString() {
        return String.valueOf(value_);
    }
}

public class Main
{   
    // Передаем параметры по 'ссылке'
    public static void Swap(IntRef first_numb, IntRef second_numb) {
        first_numb.value_ = first_numb.value_ + second_numb.value_;
        second_numb.value_ = first_numb.value_ - second_numb.value_;
        first_numb.value_ = first_numb.value_ - second_numb.value_;
    }
}
