package Strings;

class Solution {
    public String relative_path(String string_1, String string_2) {
        // Split the paths into arrays
        String[] path1 = string_1.split("/");
        String[] path2 = string_2.split("/");

        // Find the common root path
        int i = 0;
        while (i < path1.length && i < path2.length && path1[i].equals(path2[i])) {
            i++;
        }

        // Build the relative path
        StringBuilder result = new StringBuilder();

        // Add "../" for each directory we need to go up
        for (int j = i; j < path1.length; j++) {
            if (!path1[j].isEmpty()) {
                result.append("../");
            }
        }

        // Add the remaining part of the target path
        for (int j = i; j < path2.length; j++) {
            if (!path2[j].isEmpty()) {
                result.append(path2[j]);
                if (j < path2.length - 1) {
                    result.append("/");
                }
            }
        }

        // Return the result with "cd " prefix as per the output format
        return "cd " + result.toString();
    }

    }