Tic-Tac-Toe Game
This is a Java program that allows two players to play the classic game of Tic-Tac-Toe. The program takes input from the players to determine where they want to place their symbol ('X' or 'O') on the board. The game continues until either one of the players wins or the board is full and there is a tie.

Getting Started
To use this program, you will need to have Java installed on your computer. You can download the latest version of Java here.

How to Run
Download or clone the source code from this GitHub repository.
Open a terminal window and navigate to the directory where the source code is saved.
Compile the code using the command javac Main.java.
Run the program using the command java Main.
Follow the prompts to play the game.
How to Play
The game is played on a 3x3 grid. Players take turns placing their symbol on the board until one player gets three in a row (either horizontally, vertically, or diagonally) or the board is full.

When prompted, players should enter the row and column where they want to place their symbol. The rows and columns are numbered from 0 to 2.

If a player tries to place their symbol on a square that is already taken, they will be prompted to try again.

Code Overview
The Main class contains the main method which runs the game. The program uses a 2D array to represent the game board. The game loop continues until either one of the players wins or the board is full.

The program uses a series of for loops to check for a winning condition. If a winning condition is found, the game loop is terminated and the winner is declared.

Conclusion
This program is a simple implementation of the classic game of Tic-Tac-Toe. It can be used as a starting point for more complex games or as a way to learn the basics of Java programming.
