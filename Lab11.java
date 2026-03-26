// ============================================
// PACKAGES
// TODO: Import required packages
// ============================================



public class Lab11 {

    public static void main(String[] args) {

        // TODO: Create a Scanner for user input


        // ============================================
        // TASK 1: QUEST TRACKER
        // ============================================

        System.out.println("=== TASK 1: Quest Tracker ===\n");

        // TODO: Create an ArrayList<String> called quests

        // TODO: Add the 3 starting quests:
        //         "Defeat the Goblin King"
        //         "Collect 5 Dragon Gems"
        //         "Rescue Princess Luna"


        System.out.println("--- Your Quests ---");

        // TODO: Display each quest with numbering (1, 2, 3...)


        System.out.println();

        System.out.print("How many new quests? ");
        // TODO: Read and store how many new quests the user found

        scanner.nextLine(); // Clear the input buffer

        // TODO: Loop that many times, ask for each quest name, and add it to the list


        System.out.println("\n✓ Quests updated! Total: " + quests._________________() + " quests\n\n");


        // ============================================
        // TASK 2: TEAM & BATTLE ARENA
        // ============================================

        System.out.println("=== TASK 2: Team & Battle Arena ===\n");

        // TODO: Create an ArrayList<String> called team

        System.out.print("How many team members? (1-3): ");
        // TODO: Read and store how many team members the user wants

        scanner.nextLine(); // Clear the input buffer

        // TODO: Loop that many times, ask for each member's name, and add them to the team


        System.out.println("\n--- Your Team ---");

        // TODO: Display each team member as "✓ [name]"


        System.out.println();

        // TODO: Create an ArrayList<String> called opponents and add these 3 opponents:
        //         "Goblin Scout"
        //         "Orc Warrior"
        //         "Dragon Lord"


        System.out.println("--- Battle Arena ---");
        System.out.println("Opponents: ");

        // TODO: Display each opponent with numbering (1, 2, 3...)


        System.out.println("\n--- Random Battle Order ---");

        // TODO: Create a copy of opponents called battleOrder
        ArrayList<String> battleOrder = _________________ _________________(opponents);

        // TODO: Shuffle battleOrder
        Collections._________________(battleOrder);

        System.out.println("✓ Shuffled!\n");

        // TODO: Display the shuffled battle order with numbering (1, 2, 3...)


        System.out.println("\n⚔️  First opponent: " + battleOrder._________________( 0 ));

        // TODO: Close the scanner

    }
}