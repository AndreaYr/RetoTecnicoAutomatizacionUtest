# Autor: Yuri Andrea Ramírez Reyes
@stories
  Feature: Registro de usuario Utest
    Como usuario, quiero diligenciar el formulario de registro de la página Utest

  @scenario1
  Scenario: Registro de andrea en Utest
    Given Andrea quiere registrarse en Utest
    When ingresa los datos requeridos por el sistema
      | strFirstName | strLastName | strMail            | strBirthMonth | strBirthDay | strBirthYear | strCity | strPostalCode | strCountry | strMobileDevice | strModel | strOperatingSystem | strPassword      |
      | andrea       | reyes       | andrea@ejemplo.com | september     | 05          | 2001         | armenia |  630001       | colombia   |     Alcatel     | OT-918   |    Android 2.3     | contraseñaprueba |
    Then se completa el registro al oprimir el boton de Complete Setup
      | strButtonText  |
      | Complete Setup |