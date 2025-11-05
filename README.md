# DeurClassGilde

**Door** <br>
Door has a constructor that sets the isLocked state to true and the isDoorOpen state to false.<br>
Then it has the methods usekey(), openDoor() and walkThroughDoor()<br>

useKey() take a parameter "Links" or "Rechts" and according to the direction it will set the isLocked variable to true or false.<br>

openDoor() checks the state of the islocked variable and according to it sets the isDoorOpen variable true or false and returns "de deur is geopend" or "de deur is nog op slot"

last walkThroughDoor() checks if the isDoorOpen variable is true. If true it returns "Je bent in de huiskamer", otherwise it will return "Je loopt tegen de deur aan"
