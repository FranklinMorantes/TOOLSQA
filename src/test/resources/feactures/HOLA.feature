# language: es

Característica: Realizar compra de articulo
  como un nuevo cliente
  quiero ingresar a la pagina www.abc.com
  para realizar la compra de un articulo


  @EscenarioSinValor
  Escenario: agregar articulo al carrito de compra
    Dado  que un cliente accede a la web de compras
    Cuando el agrega de franklin de morantes al correo frankjmorantes@hotmail.com con 30 años y salario de 1800000 y departamento CESAR con fecha 09/12/1991 y  01/12/2000/13:00
    Entonces el ve los productos en el carrito de compras


  @EscenarioConValor
  Esquema del escenario: agregar producto al carrito de compras
    Dado  que un cliente accede a la web de compras
    Cuando  el agrega un producto al carrito
      |<nombreProducto>|<cantidadAgregar>|
    Entonces el ve los productos en el carrito de compras


    Ejemplos:
      |nombreProducto|cantidadAgregar|
      |FRANKLIN     |1              |