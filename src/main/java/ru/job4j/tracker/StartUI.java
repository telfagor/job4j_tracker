package ru.job4j.tracker;

public class StartUI {
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            showMenu();
            int select = Integer.parseInt(input.askStr("Select: "));
            if (select == 0) {
                System.out.println("===Create a new Item===");
                String name = input.askStr("Enter name: ");
                Item item = new Item(name);
                tracker.add(item);
                System.out.println("Added item: " + item);
            } else if (select == 1) {
                System.out.println("=== Show all items ===");
                Item[] items = tracker.findAll();
                if (items.length > 0) {
                    for (Item i : items) {
                        System.out.println(i);
                    }
                } else {
                    System.out.println("The store does not contain items yet");
                }
            } else if (select == 2) {
                System.out.println("=== Replace item ===");
                int id = Integer.parseInt(input.askStr("Enter id: "));
                String name = input.askStr("Enter name: ");
                Item item = new Item(name);
                if (tracker.replace(id, item)) {
                    System.out.println("Item changed successfully.");
                } else {
                    System.out.println("Item replacement error");
                }
            } else if (select == 3) {
                System.out.println("=== Delete item ===");
                int id = Integer.parseInt(input.askStr("Enter id: "));
                if (tracker.delete(id)) {
                    System.out.println("The item deleted");
                } else {
                    System.out.println("Item deletion error");
                }
            } else if (select == 4) {
                System.out.println("=== Find item by id ===");
                int id = Integer.parseInt(input.askStr("Enter id: "));
                Item item = tracker.findById(id);
                if (item != null) {
                    System.out.println(item);
                } else {
                    System.out.println("Item with this ID does not exist");
                }
            } else if (select == 5) {
                System.out.println("=== Find items by name ===");
                String name = input.askStr("Enter name: ");
                Item[] items = tracker.findByName(name);
                if (items.length > 0) {
                    for (Item i : items) {
                        System.out.println(i);
                    }
                } else {
                    System.out.println("Items with name " + name + " does not exist");
                }
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        String[] menu = {
                "Add new Item", "Show all items", "Edit item",
                "Delete item", "Find item by id", "Find items by name",
                "Exit Program"
        };
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + ". " + menu[i]);
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
