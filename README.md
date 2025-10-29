# Lab 10

## Recap: Lab (Github) Workflow 📄 - How to Work on Labs

Follow these steps for every lab carefully to access, complete, and submit your assignment.

1.  **Accept the Assignment**

    - Open the Lab Assignment Link the professor provided.
    - Click **"Accept the assignment"**. This will create your personal assignment repository on GitHub under the `OOP-Fall-2025` organization.
    - You'll be taken to your repository page. Verify that the URL looks like `github.com/OOP-Fall-2025/lab-number-yourusername`.

2.  **Clone the Repository to Your Computer**

    - On your repository page, click the blue **`<> Code`** button.
    - In the dropdown menu, choose **"Open with GitHub Desktop"**.
    - GitHub Desktop will launch. Choose a preferred local folder on your computer to save the project and click **"Clone"**.
    - If asked "How are you planning on using this fork?", select **"For my own purpose"** and continue.

3.  **Open in VS Code and Start Coding**

    - In GitHub Desktop, ensure the "Current repository" is the one for this lab.
    - Click the **"Open in Visual Studio Code"** button.
    - VS Code will open the project folder. You can now begin writing your solutions in the `Lab10.java` file.

4.  **Save and Submit Your Work**

    - **Commit (Save) Changes**: As you work, save your file in VS Code (`Ctrl+S` or `Cmd+S`). To record your progress, go to the **Source Control** tab (the fork icon) on the left sidebar in VS Code. Type a descriptive message in the message box (e.g., "Finished Task 1 and 2") and click **"Commit"**. You must enter a message.
    - **Push (Submit) to GitHub**: When you are finished with the lab or want to back up your work, go back to GitHub Desktop. Click the **"Push origin"** button at the top of the window. This sends your committed changes from your computer to your GitHub repository online.

5.  **Verify Your Submission**
    - After you push, you can click **"View on GitHub"** in GitHub Desktop to open your repository in the browser.
    - On the GitHub website, make sure you are viewing the `main` branch and confirm that all of your latest code is visible.

---

## Lab 10 Tasks

### Collections Framework: ArrayList

_Using dynamic arrays in Java_

---

## Task 1: Quest Tracker

**Topics Covered:** ArrayList `.add()`, `.get()`, `.size()`

**What This Task Practices:** You'll use ArrayList to manage a list of quests. Add quests, display them with numbering, and add more from user input.

### What You'll Do

**Part 1: Create ArrayList and Add Starting Quests**

- Create an `ArrayList<String>` called `quests`
- Add 3 starting quests using `.add()`:
  - "Defeat the Goblin King"
  - "Collect 5 Dragon Gems"
  - "Rescue Princess Luna"

**Part 2: Display All Quests**

- Create a traditional for loop: `for (int i = 0; i < list.size(); i++)`
- Use `.get(i)` to access each quest
- Display with numbering (1, 2, 3)
- **Important:** Display shows 1,2,3 but indices are 0,1,2

**Part 3: Add New Quests from User Input**

- Ask how many new quests the player found
- Loop that many times
- Read quest names using `scanner.nextLine()`
- Add each to quests using `.add()`
- Print total quests using `.size()`

### Example Output

```
=== TASK 1: Quest Tracker ===

--- Your Quests ---
  1. Defeat the Goblin King
  2. Collect 5 Dragon Gems
  3. Rescue Princess Luna

How many new quests? 2
Quest 1: Find the Lost Temple
Quest 2: Defeat the Shadow Beast

✓ Quests updated! Total: 5 quests
```

### Key Methods

| Method       | What It Does         | Example                    |
| ------------ | -------------------- | -------------------------- |
| `.add(item)` | Add to end           | `quests.add("Find Gold")`  |
| `.get(i)`    | Get element at index | `String q = quests.get(0)` |
| `.size()`    | Get number of items  | `int n = quests.size()`    |

---

## Task 2: Team & Battle Arena

**Topics Covered:** ArrayList basics, ArrayList copying, `Collections.shuffle()`, enhanced for-each loop

**What This Task Practices:** You'll build a team, display them with an enhanced for-each loop, and create a randomized battle arena.

### What You'll Do

**Part 1: Build Team**

- Create an `ArrayList<String>` called `team`
- Ask user how many team members (1-3)
- Loop and add each member name using `.add()`

**Part 2: Display Team**

- Use enhanced for-each loop: `for (String member : team)`
- Print each member as "✓ [name]"
- This is simpler than traditional loops when you don't need the index

**Part 3: Create Opponents and Shuffle**

- Create an `ArrayList<String>` called `opponents`
- Add 3 opponents:
  - "Goblin Scout"
  - "Orc Warrior"
  - "Dragon Lord"
- Display them in order
- **Create a copy:** `ArrayList<String> battleOrder = new ArrayList<>(opponents);`
- **Shuffle the copy:** `Collections.shuffle(battleOrder);`
- Display shuffled order
- Get first opponent using `.get(0)`

### Example Output

```
=== TASK 2: Team & Battle Arena ===

How many team members? (1-3): 2
Member 1: Aragorn
Member 2: Legolas

--- Your Team ---
✓ Aragorn
✓ Legolas

--- Battle Arena ---
Opponents:
  1. Goblin Scout
  2. Orc Warrior
  3. Dragon Lord

--- Random Battle Order ---
✓ Shuffled!

  1. Dragon Lord
  2. Goblin Scout
  3. Orc Warrior

⚔️  First opponent: Dragon Lord
```

### Key Methods

| Method                  | What It Does       | Example                      |
| ----------------------- | ------------------ | ---------------------------- |
| `.add(item)`            | Add to end         | `team.add("Aragorn")`        |
| `.get(0)`               | Get first element  | `String first = list.get(0)` |
| Enhanced for            | Loop without index | `for (String m : team)`      |
| `Collections.shuffle()` | Randomize order    | `Collections.shuffle(list)`  |

---

## Important Patterns

### Creating ArrayList

```java
ArrayList<String> myList = new ArrayList<>();
```

### Copying ArrayList (important for shuffle!)

```java
ArrayList<String> copy = new ArrayList<>(original);
Collections.shuffle(copy);  // original stays the same
```

### Traditional For Loop

```java
for (int i = 0; i < list.size(); i++) {
    String item = list.get(i);
    System.out.println((i + 1) + ". " + item);  // Display as 1,2,3...
}
```

### Enhanced For-Each Loop

```java
for (String item : list) {
    System.out.println("✓ " + item);
}
```

---

## Common Mistakes

| ❌ Wrong                           | ✅ Fix                                         |
| ---------------------------------- | ---------------------------------------------- |
| `list.length`                      | Use `list.size()`                              |
| Displaying 0,1,2 instead of 1,2,3  | Print `(i+1)`                                  |
| Not clearing scanner buffer        | Use `scanner.nextLine()` after `nextInt()`     |
| Shuffling original instead of copy | Create copy first: `new ArrayList<>(original)` |
| Forgetting `.get(i)` in loop       | Always use `.get(i)` to access items           |

---

## Need Help?

Ask instructor! Reference materials available:

- Lecture 10 materials

## Finished?

When done with the lab (committed and pushed on GitHub), show instructor and state your name to be marked as done!

---

## Bonus: Extensions (If You Finish Early)

### Extension 1: Remove a Quest

Ask which quest was completed and remove it from the list using `.remove()`.

### Extension 2: Search for Team Member

Ask if a specific name is on the team using `.contains()`.

### Extension 3: Sort Quests

Use `Collections.sort(quests)` to display quests alphabetically.

Good luck! 🎮
