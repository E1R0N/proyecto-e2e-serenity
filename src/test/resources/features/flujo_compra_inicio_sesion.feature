Feature: Purchase products by logging in

  @InicioSesiónCompraProductos
  Scenario Outline: Inicio de Sesión y Compra de Productos
    #Iniciar sesion
    Given "<actor>" navega en la página de inicio de sesión de Swag Labs
    When ingresa las credenciales correctas "<user>" y "<password>"
    Then agrega dos productos al carrito
    And ve el carrito y continua el proceso de compra

    #Agrego dos productos al carrito y completo el proceso de compra
    When completa el formulario de compra con "<first_name>", "<last_name>" y "<zip_code>"
    Then ve la descripción de la compra
    And finaliza la compra

    Examples:
      | actor         | user          | password     | first_name | last_name | zip_code |
      | Andres        | standard_user | secret_sauce | Andres     | Tayupanta | 170133   |


