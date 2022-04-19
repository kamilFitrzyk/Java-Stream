package com.java.Collectors;

import java.util.*;

import static java.util.stream.Collectors.*;

public class ToListSetMap {
    public static void  run() {
        List<String> teams = new ArrayList<>();

        teams.add("Poland");
        teams.add("Slovakia");
        teams.add("Spain");
        teams.add("Sweden");
        teams.add("Sweden");

        List<String> teamsStartingWithS = teams.stream()
                .filter(team -> team.startsWith("S"))
                .collect(toUnmodifiableList());

        System.out.println(teamsStartingWithS);


        Set<String> setOfTeamsStartingWithS = teams.stream()
                .filter(team -> team.startsWith("S"))
                .collect(toSet());

        System.out.println(setOfTeamsStartingWithS);


        Country country = new Country("Poland", "Warsaw");
        Country country2 = new Country("Spain", "Madrid");
        Country country3 = new Country("Slovakia", "Bratislava");
        Country country4 = new Country("Sweden", "Stockholm");

        List<Country> countries = new ArrayList<>();
        countries.add(country);
        countries.add(country2);
        countries.add(country3);
        countries.add(country4);

        Map<String, String> countriesMap = countries.stream()
                .filter(countryFromMap -> countryFromMap.getName().startsWith("S"))
                .collect(toMap(Country::getName, Country::getCapital,
                        (oldValue, newValue) -> newValue));

        System.out.println(countriesMap);
    }
}
