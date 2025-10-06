# Descripción del diagrama
El diagrama representa la estructura de clases para un sistema de gestión de pedidos en una tienda online. Se modelan las entidades principales que intervienen en el proceso de venta: Tienda, Cliente, Admin, Pedidos, DetallePedido, Producto, Stock y Venta.

Tienda

Es la clase principal del sistema y actúa como contenedor de los demás elementos.
Contiene atributos básicos de identificación (id_tienda, nombre) y se relaciona con las demás clases mediante composición, indicando que los elementos existen dentro del contexto de una tienda.

Cliente

Representa a las personas que realizan compras en la tienda.
Posee datos personales (dni, nombre, apellido, correo, teléfono).
Un cliente puede realizar uno o varios pedidos (relación 1 a *).

Pedidos

Cada pedido pertenece a un solo cliente y contiene información sobre la operación:
id_pedido, fecha, estado.
El pedido se compone de uno o varios DetallePedido, que especifican qué productos se incluyen.

DetallePedido

Funciona como clase intermedia entre Pedidos y Producto, permitiendo detallar la cantidad de cada producto en un pedido y calcular el subtotal.
Atributos: cantProducto, subTotal.
Un pedido tiene uno o más detalles, y cada detalle hace referencia a un único producto.

Producto

Define los artículos disponibles en la tienda, con los atributos id_producto, nombre, tipoProducto, y precio.
Cada producto puede aparecer en muchos detalles de pedido (1 a *).
Además, cada producto está asociado a un Stock que indica la cantidad disponible.

Stock

Registra la cantidad disponible de cada producto (id_stock, cantidad).
Existe una relación 1 a 1 con la clase Producto, ya que cada producto tiene un único registro de stock.

Venta

Representa la concreción del proceso de compra.
Contiene los datos id_venta y fechaVenta, y se asocia a un Admin (empleado del sistema) que gestiona la operación.

Admin

Corresponde a los usuarios administrativos del sistema, con atributos similares a los del cliente (dni, nombre, apellido, correo, teléfono).
Cada administrador puede estar relacionado con una o varias ventas.
