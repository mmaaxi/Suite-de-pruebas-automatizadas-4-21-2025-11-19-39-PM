Feature: Validar error al ingresar credenciales incorrectas

  Scenario: El usuario recibe un mensaje de error con credenciales inválidas
    Given el usuario está en la página de login
    When ingresa el usuario "incorrecto" y la contraseña "incorrecta"
    Then debería ver un mensaje de error que indica datos incorrectos