import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            //код который может вызвать исключения
        } catch (IOException | IllegalArgumentException e){
        System.out.println("Произошла ошобка :" + e);
    }catch (Exception e){
            System.out.println("Ошибка" e);
        }

    }
}