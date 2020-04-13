package com.william.dev.moodbank.utils

import au.com.bytecode.opencsv.CSVParser

class CsvReader implements Iterator<String[]> {
    Scanner scanner
    CSVParser csvParser

    CsvReader(final String filename) {
        final ClassLoader classLoader = CsvReader.class.getClassLoader()
        this.scanner = new Scanner(classLoader.getResourceAsStream(filename))
        this.csvParser = new CSVParser()
    }

    @Override
    boolean hasNext() {
        return scanner.hasNextLine()
    }

    @Override
    String[] next() {
        try {
            return csvParser.parseLine(scanner.nextLine())
        } catch (final IOException e) {
            throw new RuntimeException("Unable to parse CSV string", e)
        }
    }
}
