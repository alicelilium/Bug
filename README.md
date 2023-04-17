# Bug
Bug class and a test implementation for it

# Bug Class
The bug class allows one to create an interactive Bug object. The object represents a physical bug on a horizontal wire (100 units long with 0 being the middle of the wire), and through its methods the bug can move along the wire. It can move one unit at a time, and can also turn to the other direction. 

The Bug object can be initialized with or without an inputted integer start point. If an integer parameter is passed (within the bounds of the wire), the Bug will start with the inputted initial position. Otherwise, it starts at a random point along the wire.

# Bug Methods
The class contains methods to manipulate the Bug object as well as some getter and setter methods.
The move() method moves the Bug forward in it's current direction.
The turn() method turns the Bug around to the other direction.
The two getter methods return the Bug's position as an int and it's direction as a String ("left" or "right").
The setPosition() method allows for the position of the Bug to be changed manually.
The toString() method clearly returns the position and direction of the Bug.

# BugGame
The BugGame file is a test implementation of the Bug class. It creates a text-based "game" using the Bug object, where a Bug is created with the default constructor for the user. It makes a console, text-based set of commands to move and turn the Bug, output it's toString method, and commands to exit the game, restart the game with a new bug, and re-list the commands.
![bugtest2](https://user-images.githubusercontent.com/107301994/232353700-300d300c-879e-400e-89df-bb1e66d85bfe.png) 
![bugtest3](https://user-images.githubusercontent.com/107301994/232353702-618a5c44-605c-4482-93f2-3b2573cbddee.png)
