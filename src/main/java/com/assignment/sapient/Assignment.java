package com.assignment.sapient;

public class Assignment {

    /*
     * final static String outputFilePath =
     * "D:\\Practice\\workspace\\ws5\\Sapient\\src\\main\\java\\com\\assignment\\sapient\\sampleoutput.txt";
     * final static String inputFilePath =
     * "D:\\Practice\\workspace\\ws5\\Sapient\\src\\main\\java\\com\\assignment\\sapient\\sampleInput.csv";
     * final static String outputFileHeader = "City/Country" + "Gender " +
     * "Average Income(in USD)";
     *
     * static List<CountryDetails> readFile() throws IOException {
     * List<CountryDetails> countryDetailsList = new ArrayList<>(); File file = new
     * File(inputFilePath); BufferedReader br = new BufferedReader(new
     * FileReader(file));
     *
     * String line; int i = 0;
     *
     * while ((line = br.readLine()) != null) { if (i == 0) { i++; continue; }
     * countryDetailsList.add(splitLine(line)); } return countryDetailsList; }
     *
     * private static CountryDetails splitLine(String line) { String[] arr =
     * line.split(","); return new CountryDetails(arr[0], arr[1], arr[2], arr[3],
     * Long.valueOf(arr[4])); }
     *
     * static void writeFile(Map<Object, Map<String, Double>> byGenderAndSalary)
     * throws IOException { File file = new File(outputFilePath); BufferedWriter br
     * = new BufferedWriter(new FileWriter(file)); br.write(outputFileHeader);
     * br.newLine();
     *
     * Map<Object, Map<String, Double>> sortedMap = new TreeMap<Object, Map<String,
     * Double>>(); sortedMap.putAll(byGenderAndSalary);
     *
     * for (Entry<Object, Map<String, Double>> entry : sortedMap.entrySet()) {
     *
     * String city = (String) entry.getKey(); Map<String, Double> avg =
     * entry.getValue(); avg.entrySet().stream().sorted();
     *
     * Map<String, Double> result =
     * avg.entrySet().stream().sorted(Map.Entry.comparingByKey())
     * .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue,
     * newValue) -> oldValue, LinkedHashMap::new));
     *
     * for (Entry<String, Double> entry1 : result.entrySet()) { String Key =
     * entry1.getKey(); Double income = entry1.getValue(); String str = city + " " +
     * Key + " " + income; br.write(str); br.newLine(); } } br.close(); }
     *
     * public static void main(String[] args) throws IOException {
     * List<CountryDetails> countryDetailsList = readFile();
     *
     * Map<Object, Map<String, Double>> byGenderAndSalary =
     * countryDetailsList.stream().map(p -> { if (p.getCountry().length() == 1) {
     * p.setCountry(p.getCity()); } return p; }).collect(Collectors.groupingBy(p ->
     * p.getCountry(), Collectors.groupingBy(p -> p.getGender(),
     * Collectors.mapping(p -> { return p; }, Collectors.averagingDouble(p ->
     * p.getAmout())))));
     *
     * System.out.println(byGenderAndSalary); writeFile(byGenderAndSalary);
     *
     * }
     */

}
