// Программа по вычислению дискриминанта и корней квадратного уравнения

public class Example {
    public static void main(String[] args) {
        //  a(x*x) + b*x + c = 0
        // Обьявляем переменные и условия
        int a=2;
        if (a == 0)
        {
            System.out.println("Значение a не может быть равным нулю");
            System.exit(0);
        }
        int b=3;
        int c=1;
        // Начинаем вычисления дискриминанта
        // D=(b*b)-(4*a*c)
        int disk = (b * b) - (4 * a * c);
        System.out.println("Дискриминант уравнения равен " + disk);
        //При дискриминанте>0
        if (disk > 0)
        {
            double root1;
            double root2;
            b = -b;
            double rootdisk = Math.sqrt(disk);
            root1 = (b + rootdisk) / (2 * a);
            root2 = (b - rootdisk) / (2 * a);
            System.out.println("Корень уравнения 1 равен "+root1);
            System.out.println("Корень уравнения 2 равен "+root2);
            //При дискриминанте==0
        }
        if (disk == 0)
        {
            double root1 = b / (2 * a);
            System.out.println(root1);
        }
        // При дискриминанте<0
        if (disk<0)
        {
            System.out.println("Уравнение корней не имеет");
        }
    }
}