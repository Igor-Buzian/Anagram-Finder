import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramFinder {

    /**
     * Finds and groups anagrams from words in the input file.
     *
     * @param filepath The path to the input file, containing one word per line.
     * @return A map where the key is the sorted string (canonical form of the anagram),
     * and the value is a list of words that are anagrams of that canonical form.
     */
    public Map<String, List<String>> findAnagrams(String filepath) {
        // Use HashMap to store canonical form -> list of words
        Map<String, List<String>> anagramGroups = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String word = line.trim();
                if (!word.isEmpty()) {
                    // Skip empty lines
                    // Create a "canonical" form of the word by sorting its letters.
                    // For example, "act" and "cat" will both become "act".
                    String canonicalForm = getCanonicalForm(word);

                    // If the canonical form is not yet in the map, add it with a new list.
                    // Otherwise, get the existing list and add the current word to it.
                    anagramGroups.computeIfAbsent(canonicalForm, k -> new ArrayList<>()).add(word);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            System.exit(1);
        }
        return anagramGroups;
    }

    /**
     * Generates the canonical form of a word by converting it to lowercase and sorting its characters.
     *
     * @param word The input word.
     * @return The canonical form of the word.
     */
    private String getCanonicalForm(String word) {

        char[] chars = word.toLowerCase().toCharArray();


        // The error "Invalid array range: 0 to 0" often indicates an issue with an empty array
        //In this logic, chars.length will never be equal to 0,
        // but with project scalability, other methods can refer to our getCanonicalForm, so we will handle this option.
        if (chars.length == 0) {
           System.err.println("Error: in getCanonicalForm word is empty!");
            return "";
        }

        Arrays.sort(chars);
        return new String(chars);
    }

    /**
     * Prints the grouped anagrams to the console.
     * Each group of anagrams is printed on a separate line.
     *
     * @param anagramGroups A map containing the anagram groups.
     */
    public void printAnagramGroups(Map<String, List<String>> anagramGroups) {
        // Sort the canonical forms (keys) for consistent output order of groups
        List<String> sortedCanonicalForms = new ArrayList<>(anagramGroups.keySet());
        Collections.sort(sortedCanonicalForms);

        for (String canonicalForm : sortedCanonicalForms) {
            // Sort the words within each group for consistent output order
            List<String> group = anagramGroups.get(canonicalForm);
            Collections.sort(group);

            // Print the words in the group, separated by spaces
            System.out.println(String.join(" ", group));
        }
    }

    public static void main(String[] args) {

        // Check if the file path was provided as a command-line argument.
        if (args.length != 1) {
            System.err.println("Usage: java AnagramFinder <filepath>");
            System.exit(1);
        }

        String inputFilePath = args[0];
        AnagramFinder finder = new AnagramFinder();
        // Find anagrams
        Map<String, List<String>> groups = finder.findAnagrams(inputFilePath);

        // Print the results
        finder.printAnagramGroups(groups);
    }
}