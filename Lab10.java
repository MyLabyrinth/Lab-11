// ============================================
// TASK 2: PACKAGES - Import required packages here
// TODO: Import ArrayList from java.util
// TODO: Import Scanner from java.util
// TODO: Import Collections from java.util
// ============================================



// Main class - entry point of the program
public class Lab10 {
    
    public static void main(String[] args) {
        
        // Create Scanner for user input
        // TODO: Create a Scanner object to read from System.in
        
        
        // ============================================
        // TASK 1: QUEST TRACKER
        // ============================================
        
        System.out.println("=== TASK 1: Quest Tracker ===\n");
        
        // TODO: Create an ArrayList<String> called quests
        
        
        // TODO: Add these 3 quests using .add():
        // "Defeat the Goblin King"
        // "Collect 5 Dragon Gems"
        // "Rescue Princess Luna"
        
        
        
        
        
        System.out.println("--- Your Quests ---");
        
        // TODO: Loop through quests and display each one with numbering (1, 2, 3...)
        // Use .get(i) to access each quest
        for (int _________________ = 0; _________________ < _________________; _________________++) {
            System.out.println("  " + (i + 1) + ". " + quests._________________(i));
        }
        
        System.out.println();
        
        // TODO: Ask user how many new quests they found
        System.out.print("How many new quests? ");
        int newCount = scanner.nextInt();
        scanner.nextLine(); // Clear buffer
        
        // TODO: Loop newCount times and add each quest
        for (int _________________ = 0; _________________ < _________________; _________________++) {
            System.out.print("Quest " + (i + 1) + ": ");
            String quest = scanner.nextLine();
            // TODO: Add quest to the quests ArrayList
            quests._________________(quest);
        }
        
        System.out.println("\n✓ Quests updated! Total: " + quests._________________() + " quests\n\n");
        
        
        // ============================================
        // TASK 2: TEAM & BATTLE ARENA
        // ============================================
        
        System.out.println("=== TASK 2: Team & Battle Arena ===\n");
        
        // TODO: Create an ArrayList<String> called team
        
        
        System.out.print("How many team members? (1-3): ");
        int teamSize = scanner.nextInt();
        scanner.nextLine(); // Clear buffer
        
        // TODO: Loop teamSize times and add each team member name
        for (int _________________ = 0; _________________ < _________________; _________________++) {
            System.out.print("Member " + (i + 1) + ": ");
            String member = scanner.nextLine();
            // TODO: Add member to team ArrayList
            team._________________(member);
        }
        
        System.out.println("\n--- Your Team ---");
        // TODO: Use enhanced for-each loop to display team members
        // Print each member as: "✓ [member name]"
        for (String _________________ : _________________) {
            System.out.println("✓ " + member);
        }
        
        System.out.println();
        
        // TODO: Create an ArrayList<String> called opponents and add 3 opponents:
        // "Goblin Scout"
        // "Orc Warrior"
        // "Dragon Lord"
        
        
        
        
        
        System.out.println("--- Battle Arena ---");
        System.out.println("Opponents: ");
        // TODO: Loop through opponents and display them
        for (int i = 0; i < opponents.size(); i++) {
            System.out.println("  " + (i + 1) + ". " + opponents.get(i));
        }
        
        System.out.println("\n--- Random Battle Order ---");
        
        // TODO: Create a copy of opponents: ArrayList<String> battleOrder = new ArrayList<>(opponents);
        ArrayList<String> battleOrder = _________________ _________________(opponents);
        
        // TODO: Shuffle the battleOrder using Collections.shuffle()
        Collections._________________(battleOrder);
        
        System.out.println("✓ Shuffled!\n");
        
        // TODO: Display the shuffled battle order
        for (int i = 0; i < battleOrder.size(); i++) {
            System.out.println("  " + (i + 1) + ". " + battleOrder.get(i));
        }
        
        System.out.println("\n⚔️  First opponent: " + battleOrder._________________( 0 ));
        
        // TODO: Close the scanner
        
    }
}


// ============================================
// ARRAYLIST METHODS REFERENCE
// ============================================

/*
 * .add(element)           - Add element to end
 * .get(index)             - Get element at index
 * .size()                 - Get number of elements
 * 
 * Collections.shuffle(list) - Randomize order
 */
