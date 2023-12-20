public class Main {
    public static void main(String[] args) {
        //task1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //task2
        dog = dog + 4.0;
        cat = cat + 4.0;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //task3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //task4
        var friend = 19;
        System.out.println(friend);
        friend = friend*2;
        System.out.println(friend);
        friend = friend/7;
        System.out.println(friend);
        //task5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog*10;
        System.out.println(frog);
        frog = frog/3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        //task6
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        System.out.println(firstBoxer + secondBoxer);
        //task7
        System.out.println(Math.abs(firstBoxer - secondBoxer));
        System.out.println(secondBoxer % firstBoxer);
        System.out.println(secondBoxer - firstBoxer);
        //task8
        var hourOfWork = 640;
        var timeWork = 8;
        System.out.println("Всего в компании - " + hourOfWork/timeWork + " человек.");
        var people = hourOfWork/timeWork + 94;
        hourOfWork = hourOfWork/people;
        System.out.println("Если в компании работает " + people + " человека, то всего " + hourOfWork + " часов работы может быть поделено между сотрудниками.");
    }
}