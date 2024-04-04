Feature: BellyFeature

  Scenario: eaten many cukes and growl
    Given I have eaten 27 cukes
    When I wait 3 hour
    Then my Belly should Growl

  Scenario: eaten many cukes and not growl
    Given I have eaten 27 cukes
    When I wait 1 hour
    Then my belly Should not Growl

  Scenario: eaten many cukes and not growl