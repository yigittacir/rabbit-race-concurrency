🐇 Rabbit Race – Multithreaded Java Simulation

This project is a multithreaded Java simulation in which multiple rabbits compete to reach the final box by eating carrots that are randomly placed by a producer thread.
The goal of the project is to demonstrate thread synchronization, concurrency control, and shared resource management.

📌 Project Overview

In this simulation:

A Person thread randomly places carrots into boxes.

Rabbit threads move forward by eating carrots.

A CarrotRemover thread removes carrots that stay too long in a box.

The game ends when all rabbits reach the final box.

The project focuses on concurrency problems such as:

Race conditions

Thread synchronization

Shared resource access

🧠 Concepts Used

Java Multithreading

Runnable Interface

synchronized methods

Shared memory management

Producer–Consumer pattern

Thread coordination

⚙️ How It Works
1. Initialization

The user enters:

Number of rabbits

Number of boxes

Carrot generation time (X)

Carrot expiration time (Y)

Rabbit sleep time (Z)

2. Threads

Person Thread
Produces carrots and places them into random boxes.

Rabbit Threads
Move between boxes and eat carrots to progress.

CarrotRemover Thread
Periodically removes expired carrots.

3. Synchronization

Only one carrot can exist in a box at a time.

All shared data is synchronized to prevent race conditions.

The simulation ends when all rabbits reach the last box.

▶️ How to Run
javac rabbitrace/*.java
java rabbitrace.Main
