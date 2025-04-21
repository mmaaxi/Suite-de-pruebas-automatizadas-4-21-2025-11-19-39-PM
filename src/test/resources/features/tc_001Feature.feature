Feature: Verificar el inicio de sesión

  Scenario: El usuario inicia sesión exitosamente
    Given El usuario está en la página de login
    When El usuario ingresa el nombre de usuario y la contraseña válidos
    Then El usuario es redirigido a la página principal