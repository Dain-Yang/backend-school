package dain.backend.annotation.custom;

import dain.backend.annotation.custom.annotation.ModelDescriptionPrint;
import dain.backend.annotation.custom.annotation.ModelDescriptionPrints;

import java.time.LocalDate;

public class Car {
    private final String model;
    // 1980 ~ 2025
    private final Integer year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

@ModelDescriptionPrints({
        @ModelDescriptionPrint(model = "Sonata", description = "steady seller"),
        @ModelDescriptionPrint(model = "Ionic", description = "new model"),
        @ModelDescriptionPrint(model = "Grandeur", description = "luxury model"),
        @ModelDescriptionPrint(model = "Avante", description = "compact model"),
        @ModelDescriptionPrint(model = "Morning", description = "small car"),
})
    public String getModel() {
        //switch (model) {
        //    case "Ionic":
        //        System.out.println("new model");
        //        break;
        //    case "Sonata":
        //        System.out.println("steady seller");
        //        break;
        //    case "Grandeur":
        //        System.out.println("luxury model");
        //        break;
        //    case "Avante":
        //        System.out.println("compact model");
        //        break;
        //    case "Morning":
        //        System.out.println("small car");
        //        break;
        //    default:
        //        System.out.println("unknown model");
        //}
    try {
        ModelDescriptionPrint[] annotations = this.getClass().getMethod("getModel").getAnnotationsByType(ModelDescriptionPrint.class);
        for (ModelDescriptionPrint annotation : annotations) {
            if (annotation.model().equals(model)) {
                System.out.println(annotation.description());
            }
        }
    } catch (NoSuchMethodException e) {
        e.printStackTrace();
    }

    return model;
    }

    public int getYear() {
        return year;
    }

    //생산된지 5년이 넘었으면 정비가 필요합니다.
    private boolean isNeedMaintenance() {
        return LocalDate.of(year, 1, 1).isBefore(LocalDate.now().minusYears(5));
    }

    public boolean isNeedChangeOil() {
        return LocalDate.of(year, 1, 1).isBefore(LocalDate.now().minusYears(1));
    }

    @Override
    public String toString() {
        return "Car { " +
                "model = '" +model + "\'" +
                ", year = '" + year + "\'" +
                "}";
    }
}
