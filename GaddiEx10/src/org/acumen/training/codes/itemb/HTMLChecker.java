package org.acumen.training.codes.itemb;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class HTMLChecker {

    public boolean validate(String htmlFile) {
        Stack<String> openingTags = new Stack<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(htmlFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] tags = line.split(" ");

                for (String tag : tags) {
                    tag = tag.trim();

                    if (isOpeningTag(tag)) {
                        openingTags.push(tag);
                    } else if (isClosingTag(tag)) {
                        if (openingTags.isEmpty()) {
                            return false; // Closing tag without a matching opening tag
                        }
                        String openTag = openingTags.pop();
                        if (!matches(openTag, tag)) {
                            return false; // Tags do not match
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
            return false; // Return false if there's an IO error
        }

        return openingTags.isEmpty(); // Return true if all tags are matched
    }

    private boolean isOpeningTag(String tag) {
        return tag.matches("<[a-zA-Z][a-zA-Z0-9]*>");
    }

    private boolean isClosingTag(String tag) {
        return tag.matches("</[a-zA-Z][a-zA-Z0-9]*>");
    }

    private boolean matches(String openTag, String closeTag) {
        String openTagName = openTag.substring(1, openTag.length() - 1);
        String closeTagName = closeTag.substring(2, closeTag.length() - 1);
        return openTagName.equals(closeTagName);
    }
}
