package com.kodilla.patterns.factory.tasks;

public final class TasksFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        return switch (taskClass) {
            case SHOPPING -> new ShoppingTask("GunShop", "AK-47", 66);
            case PAINTING -> new PaintingTask("Austrian painter", "Grey", "Blumen");
            case DRIVING -> new DrivingTask("Natural Driving", "Mine", "Coal");
            default -> null;
        };
    }

}
