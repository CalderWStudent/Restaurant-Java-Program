## Note
The menu-items branch is for my own testing related to restaurant menu items. It isn't relevant to the current assignment.


## Feb. 16 and Feb. 18 Assignment Requirements
### User Interactions
Implement code in the main method to receive user input and instantiate a new Restaurant with its variables assigned based on the input. This is important as it makes the program more configurable to the user's needs, so they aren't only limited to values that the programmer sets.
### Getters and Setters
Make the variables in the Restaurant class private, then implement Getter and Setter methods to access and assign these variables from other classes indirectly. The point of this is to obfuscate the variables of Restaurant objects, so that they are self-contained and not readily accessible by other objects.
### ArrayList
Instantiate an ArrayList within the Main class to store Restaurant objects that we create. This is very helpful as it allows us to add new Restaurants to our program without needing to assign them each to a separate variable in the Main class. It also lets us keep all the Restaurant objects stored within the same place.
### toString()
Override the Object toString() method in the Restaurant class, so that referencing a Restaurant object will return a String that lists its variables in a clear format. This makes it much easier to display the information we want in the way that we want from a Restaurant whenever we need to, without having to manually type each getter method from the Restaurant.

## Restaurant Java Class Ideas

### Properties
- int waitTime
- double averageRating
- double averagePrice
- double locationDistance
- String locationHours
<!--Object Array menuItems-->
<!--Object Array reviews-->