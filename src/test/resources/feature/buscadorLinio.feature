Feature: Buscador Linio
  Yo como usuario de Linio
  Quiero buscar en el buscador un producto
  Para verificar si existe

  Scenario: Buscar producto en el buscador de Linio exitoso
    Given que me encuentro en la pagina de Linio
    When busco un producto en el buscador
    Then podre ver si el producto existe