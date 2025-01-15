#include <iostream>
#include <string>
using namespace std;

// Define the structure for a CD
struct CD {
    string album_title;   // Album title
    string artist;        // Artist name
    int number_of_tracks; // Number of tracks in the album
    CD* nextCD;           // Pointer to the next CD in the stack
};

// Global pointer to the top of the stack
CD* head = nullptr;

// Push function to add a CD to the stack
void push() {
    // Create a new CD node dynamically
    CD* newCD = new CD;
    cout << "Enter album title: ";
    cin.ignore(); // Ignore leftover newline character from previous input
    getline(cin, newCD->album_title);

    cout << "Enter artist name: ";
    getline(cin, newCD->artist);

    cout << "Enter number of tracks: ";
    cin >> newCD->number_of_tracks;

    // Add the new CD to the top of the stack
    newCD->nextCD = head; // Point to the current top CD
    head = newCD;         // Update head to the new CD

    cout << "CD added successfully.\n";
}

// Pop function to remove a CD from the stack
void pop() {
    if (head == nullptr) { // Check if the stack is empty
        cout << "Stack is empty. No CD to remove.\n";
        return;
    }

    // Remove the top CD from the stack
    CD* temp = head;        // Save the current top CD
    head = head->nextCD;    // Move the head to the next CD
    cout << "CD '" << temp->album_title << "' by " << temp->artist << " removed.\n";
    delete temp;            // Free the memory of the removed CD
}

// Display function to show all CDs in the stack
void display() {
    if (head == nullptr) { // Check if the stack is empty
        cout << "The stack is empty.\n";
        return;
    }

    cout << "CD Stack:\n";
    CD* temp = head; // Start from the top of the stack
    while (temp != nullptr) {
        cout << "Album Title: " << temp->album_title << ", Artist: " << temp->artist
             << ", Number of Tracks: " << temp->number_of_tracks << "\n";
        temp = temp->nextCD; // Move to the next CD
    }
}

// Main program
int main() {
    int choice; // Variable to store user's menu choice

    do {
        cout << "\nMenu:\n";
        cout << "1. Push (Add CD)\n";
        cout << "2. Pop (Remove CD)\n";
        cout << "3. Display CDs\n";
        cout << "4. Quit\n";
        cout << "Enter your choice: ";
        cin >> choice;

        switch (choice) {
        case 1:
            push();
            break;
        case 2:
            pop();
            break;
        case 3:
            display();
            break;
        case 4:
            cout << "Exiting program...\n";
            break;
        default:
            cout << "Invalid choice. Please try again.\n";
        }
    } while (choice != 4); // Exit when the user selects option 4

    return 0; // Program ends
}
