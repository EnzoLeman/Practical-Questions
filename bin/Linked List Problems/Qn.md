# CD Stack Management Using Linked List

This project implements a **stack data structure** for managing CDs using a **linked list approach** in C++. It includes functionalities to add CDs, remove the top CD, and display all CDs in the stack. The program provides a menu-driven interface for ease of use.

---

## Features
- **Push Operation**: Add a new CD to the top of the stack.
- **Pop Operation**: Remove the CD at the top of the stack.
- **Display Operation**: Show all CDs in the stack with their details.
- **Menu-Driven Interface**: A simple, repetitive menu for managing stack operations.

---

## Data Structure

### Structure: `CD`
The `CD` structure represents each node in the linked list, containing the following attributes:
- `album_title`: The title of the album.
- `artist`: The name of the artist.
- `number_of_tracks`: Total number of tracks in the album.
- `nextCD`: A pointer to the next CD in the stack.

---

## Program Design
- All variables are defined globally to simplify the implementation.
- The `push()` and `pop()` operations are implemented outside the main program.
- A global pointer `head` is used to manage the stack.

### Functions:
1. **`push()`**:
   - Adds a new CD to the top of the stack.
   - Dynamically allocates memory for the CD node.
2. **`pop()`**:
   - Removes the CD at the top of the stack.
   - Frees memory for the removed CD.
   - Displays the title of the removed CD.
3. **`display()`**:
   - Traverses the stack from top to bottom.
   - Displays details of each CD in the stack.

---

## How to Run the Program

### Compile the Program
Use a C++ compiler such as GCC:
```bash
g++ -o cd_stack cd_stack.cpp
