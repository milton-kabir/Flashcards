# Flashcards
When learning a new language, it can be hard to remember all the new vocabulary, which is exactly where flashcards can help. Typically, flashcards show a hint (a task or a picture) on one side and the right answer on the other. Flashcards can be used to remember any sort of data, so if you want to create a useful tool to help your learning and your programming skills, this project is for you.

The program's behavior depends on the action the user inputs:
1. **add** — create a new flashcard with a unique term and definition. After adding the card, output the message The pair ("term":"definition") has been added, where "term" is the term entered by the user and "definition" is the definition entered by the user.
    
2. **remove** — ask the user for the term of the card they want to remove with the message Which card?, and read the user's input from the next line. If a matching flashcard exists, remove it from the set and output the message The card has been removed.. If there is no such flashcard in the set, output the message Can't remove "card": there is no such card., where "card" is the user's input.
    
3. **import** — print the line File name:, read the user's input from the next line, which is the file name, and import all the flashcards written to this file. If there is no file with such name, print the message File not found.. After importing the cards, print the message n cards have been loaded., where n is the number of cards in the file. The imported cards should be added to the ones that already exist in the memory of the program. However, the imported cards have priority: if you import a card with the name that already exists in the memory, the card from the file should overwrite the one in memory.
    
4. **export** — request the file name with the line File name: and write all currently available flashcards into this file. Print the message n cards have been saved., where n is the number of cards exported to the file.
    
5. **ask** — ask the user about the number of cards they want to be asked about and then prompt them for definitions, like in the previous stage.
    
6. **log** — ask the user where to save the log with the message File name:, save all the lines that have been input/output to the console to the file, and print the message The log has been saved. Don't clear the log after saving it to the file.
    
7. **hardest card** — print a string that contains the term of the card with the highest number of wrong answers, for example, The hardest card is "term". You have N errors answering it. If there are several cards with the highest number of wrong answers, print all of the terms: The hardest cards are "term_1", "term_2". If there are no cards with errors in the user's answers, print the message There are no cards with errors.
    
8. **reset stats** — set the count of mistakes to 0 for all the cards and output the message Card statistics have been reset.
    
9. **exit** — print Bye bye! and finish the program.
