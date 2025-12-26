🐇 Rabbit Race – Multithreaded Java Simulation

This project is a multithreaded Java simulation where multiple rabbits compete to reach the final box by eating carrots placed randomly by a producer thread.
The project demonstrates thread synchronization, shared resources, and concurrency control using Java.

📌 Project Overview

In this simulation:

A Person thread places carrots into random boxes.

Rabbit threads move between boxes and eat carrots.

A CarrotRemover thread removes expired carrots after a given time.

The game ends when all rabbits reach the final box.

The project focuses on:

Thread synchronization

Shared memory safety

Producer–consumer logic

Java concurrency fundamentals

🧠 Concepts Used

Multithreading (Thread, Runnable)

Synchronization (synchronized)

Shared resources

Race condition prevention

Object-oriented design

Time-based simulation

🧩 Project Structure
RabbitRace/
│
├── src/
│   └── rabbitrace/
│       ├── Main.java
│       ├── Rabbit.java
│       ├── Box.java
│       ├── Carrot.java
│       ├── Person.java
│       └── CarrotRemover.java
│
└── README.md

⚙️ How It Works
1️⃣ Initialization

User inputs:

Number of rabbits

Number of boxes

Carrot generation time (X)

Carrot expiration time (Y)

Rabbit sleep time (Z)

2️⃣ Threads

Person Thread: randomly places carrots in boxes.

Rabbit Threads: move between boxes and eat carrots.

CarrotRemover Thread: removes expired carrots.

3️⃣ Synchronization

Each box allows only one carrot at a time

All shared resources are synchronized

Game ends when all rabbits reach the last box

▶️ How to Run
javac rabbitrace/*.java
java rabbitrace.Main

🧪 Sample Output
Rabbit-1 eats carrot in box 0
Rabbit-2 eats carrot in box 1
Rabbit-1 jumps to box 1
Carrot expired in box 2
Rabbit-3 eats carrot in box 2
Game Over!
