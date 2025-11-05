package org.example;

public class Door {
    private boolean isLocked;
    private boolean isDoorOpen;
    public String doorName;


    public Door(String doorName) {
        this.isLocked = true;
        this.isDoorOpen = false;
        this.doorName = doorName;
    }

    public String useKey(String direction) {
        switch (direction) {
            case "links":
                //ontgrendel
                isLocked = false;
                return "De deur is ontgrendeld";


            case "rechts":
                // vergrendel
                isLocked = true;
                return "De deur is vergrendeld";
        }

        return "wel de goede kant op draaien.";

    }

    public String openDoor() {
        if (!isLocked) {
            //deur is ontgrendeld en kan open
            isDoorOpen = true;
            return "De deur is geopend!";
        } else {
            //deur is vergrendeld en dicht
            isDoorOpen = false;
            return "De deur is nog op slot";
            
        }

    }

    public String walkThroughDoor() {
        if (isDoorOpen) {
            //de deur is open je kan binnen
            return "Je bent in de huiskamer";

        }else{
            //deur is dicht dus je doet poek
            return "Je loopt tegen de deur aan";
        }
    }

}
