import java.util.Scanner;

public class QuizDaspro {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double run_duration, swimming_duration, cycling_duration; //declare each duration
        double run_average_speed, swimming_average_speed, cycling_average_speed; //declare each average speed
        double run_training_altitude, swimming_training_altitude, cycling_training_altitude; //declare each altitude
        double body_weight, daily_calorie_target; //declare body weight and daily calorie target
        double coefficient_running = 0.05 , coefficient_swimming = 0.04 , coefficient_cycling = 0.03; //declare each coefficient
        double running_calories, swimming_calories, cycling_calories, total_calories, total_duration, average_calories_per_minute, percentage_target; //declare each total

        //input for the base
        System.out.println("Input your body weight (Kilogram)");
        body_weight = sc.nextDouble();
        System.out.println("Input your daily calorie target");
        daily_calorie_target = sc.nextDouble();

        //input for running
        System.out.println("Input the run duration (Minutes)");
        run_duration = sc.nextDouble();
        System.out.println("Input the run average speed (km/h)");
        run_average_speed = sc.nextDouble();
        System.out.println("Input the run training altitude ");
        run_training_altitude = sc.nextDouble();

        //input for swimming
        System.out.println("Input the swimming duration (Minutes)");
        swimming_duration = sc.nextDouble();
        System.out.println("Input the swimming average speed (km/h)");
        swimming_average_speed = sc.nextDouble();
        System.out.println("Input the swimming training altitude ");
        swimming_training_altitude = sc.nextDouble();

        //input for cycling
        System.out.println("Input the cycling duration (Minutes)");
        cycling_duration = sc.nextDouble();
        System.out.println("Input the cycling average speed (km/h)");
        cycling_average_speed = sc.nextDouble();
        System.out.println("Input the cycling training altitude ");
        cycling_training_altitude = sc.nextDouble();


        //calculate each calories
        running_calories = (run_duration * coefficient_running * body_weight ) + (run_average_speed * 0.5) + (run_training_altitude * 0.01);
        swimming_calories = (swimming_duration * coefficient_swimming * body_weight ) + (swimming_average_speed * 0.5) + (swimming_training_altitude * 0.01);
        cycling_calories = (cycling_duration * coefficient_cycling * body_weight ) + (cycling_average_speed * 0.5) + (cycling_training_altitude * 0.01);

        //calculate each total
        total_calories = running_calories + swimming_calories + cycling_calories;
        total_duration = run_duration + swimming_duration + cycling_duration;

        //calculate average calories
        average_calories_per_minute = total_calories / total_duration;

        //calculate percentage
        percentage_target = (total_calories / daily_calorie_target) * 100;

        //output the each calories and total
        System.out.println("running calories    : " + running_calories);
        System.out.println("swimming calories  : " + swimming_calories);
        System.out.println("cycling calories  : " + cycling_calories);
        System.out.println("total calories        : " + total_calories);
        System.out.println("average calories per minutes   : " + average_calories_per_minute);
        System.out.println("percentage target   : " + percentage_target + "%");


        sc.close();

    }
}
