/**
 * Consume the next character, and check that it matches a specified
 * character.
 * @param c The character to match.
 * @return The character.
 * @throws JSONException if the character does not match.
 */
public char next(char c) throws JSONException{
    char n = next();
    if (n != c) {
        throw syntaxError("Expected '" + c + "' and instead saw '" +
                n + "'");
    }
    return n;
}