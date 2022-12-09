import Figure.Rectangle;
import Figure.Square;
import FiguresRepository.FiguresRepository;

public class Main {
    public static void main(String[] args) {
        FiguresRepository taskRespository = new FiguresRepository();
        taskRespository.add(new Square(1));
        taskRespository.add(new Rectangle(1, 1));
        taskRespository.add(new Square(1));
        taskRespository.add(new Square(1));
        System.out.println(taskRespository.getAllAreas());
        System.out.println(taskRespository.getAllPerimeters());
        System.out.println(taskRespository.getAllLengths());
    }
}